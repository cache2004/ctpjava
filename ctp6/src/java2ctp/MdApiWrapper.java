package java2ctp;

import java.lang.reflect.Method;
import java.util.HashMap;

import quantbox.CThostFtdcDepthMarketDataField;
import quantbox.CThostFtdcRspUserLoginField;
import quantbox.QuantBoxLibrary;
import quantbox.QuantBoxLibrary.fnOnConnect;
import quantbox.QuantBoxLibrary.fnOnDisconnect;
import quantbox.QuantBoxLibrary.fnOnRspError;
import quantbox.QuantBoxLibrary.fnOnRtnDepthMarketData;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallFunctionMapper;

public class MdApiWrapper {
	public fnOnConnect fnOnConnect_Holder;
	public fnOnDisconnect fnOnDisconnect_Holder;
	public fnOnRspError fnOnRspError_Holder;
	public fnOnRtnDepthMarketData fnOnRtnDepthMarketData_Holder;

	private Object _lockMd = new Object();
	private Object _lockMsgQueue = new Object();

	private Pointer m_pMdApi;
	private Pointer m_pMsgQueue;
	private volatile boolean _bMdConnected;

	private String szPath;
	private String szAddresses;
	private String szBrokerId;
	private String szInvestorId;
	private String szPassword;

	private QuantBoxLibrary MdApi;
	private QuantBoxLibrary CommApi;

	static public HashMap map;
	static {
		map = new HashMap();
		map.put(Library.OPTION_FUNCTION_MAPPER, new StdCallFunctionMapper() {
			public String getFunctionName(NativeLibrary library, Method method) {
				// if(method.getName().equalsIgnoreCase("TD_SendOrder"))
				// return "_TD_SendOrder@52";
				return super.getFunctionName(library, method);
			}
		});
	}

	public MdApiWrapper() {
		super();

		CommApi = MdApi = (QuantBoxLibrary) Native.loadLibrary(
				QuantBoxLibrary.JNA_LIBRARY_NAME, QuantBoxLibrary.class, map);
	}

	public void Connect(String szPath, String szAddresses, String szBrokerId,
			String szInvestorId, String szPassword) {
		this.szPath = szPath;
		this.szAddresses = szAddresses;
		this.szBrokerId = szBrokerId;
		this.szInvestorId = szInvestorId;
		this.szPassword = szPassword;

		Disconnect_MD();
		Connect_MsgQueue();
		Connect_MD();
	}

	public void Disconnect() {
		Disconnect_MD();
		Disconnect_MsgQueue();
	}

	// 建立行情
	private void Connect_MD() {
		synchronized (_lockMd) {
			if (null == m_pMdApi) {
				m_pMdApi = MdApi.MD_CreateMdApi();
				MdApi.CTP_RegOnRtnDepthMarketData(m_pMsgQueue,
						fnOnRtnDepthMarketData_Holder);
				MdApi.MD_RegMsgQueue2MdApi(m_pMdApi, m_pMsgQueue);
				MdApi.MD_Connect(m_pMdApi, szPath, szAddresses, szBrokerId,
						szInvestorId, szPassword);
			}
		}
	}

	private void Disconnect_MD() {
		synchronized (_lockMd) {
			if (null != m_pMdApi) {
				MdApi.MD_RegMsgQueue2MdApi(m_pMdApi, null);
				MdApi.MD_ReleaseMdApi(m_pMdApi);
				m_pMdApi = null;
			}
			_bMdConnected = false;
		}
	}

	private void Connect_MsgQueue() {
		synchronized (_lockMsgQueue) {
			if (null == m_pMsgQueue) {
				m_pMsgQueue = CommApi.CTP_CreateMsgQueue();

				CommApi.CTP_RegOnConnect(m_pMsgQueue, fnOnConnect_Holder);
				CommApi.CTP_RegOnDisconnect(m_pMsgQueue, fnOnDisconnect_Holder);
				CommApi.CTP_RegOnRspError(m_pMsgQueue, fnOnRspError_Holder);

				// 由底层启动线程
				CommApi.CTP_StartMsgQueue(m_pMsgQueue);
			}
		}

	}

	private void Disconnect_MsgQueue() {
		synchronized (_lockMsgQueue) {
			if (null != m_pMsgQueue) {
				// 停止底层线程
				CommApi.CTP_StopMsgQueue(m_pMsgQueue);

				CommApi.CTP_ReleaseMsgQueue(m_pMsgQueue);
				m_pMsgQueue = null;
			}
		}
	}

	public void Subscribe(String inst) {
		synchronized (_lockMd) {
			if (null != m_pMdApi) {
				//MdApi.MD_Subscribe(m_pMdApi, inst);
				MdApi.MD_Subscribe(m_pMdApi, inst, null);
			}
		}
	}

	public void Unsubscribe(String inst) {
		synchronized (_lockMd) {
			if (null != m_pMdApi) {
				//MdApi.MD_Unsubscribe(m_pMdApi, inst);
				MdApi.MD_Unsubscribe(m_pMdApi, inst, null);
			}
		}
	}

	
	//http://www.cffex.com.cn/tzgg/jysgg/201403/t20140319_17954.html
	//仿真有关事项的通知 
	
	//swig  to actionscript
//	http://www.adobe.com/devnet-docs/flascc/docs/Reference.html#section_swig
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("jna.library.path",System.getProperty("user.dir"));
		System.setProperty("java.library.path",System.getProperty("user.dir"));
		
		fnOnConnect fnOnConnect_Holder = new QuantBoxLibrary.fnOnConnect() {
			public void apply(Pointer pApi,CThostFtdcRspUserLoginField pRspUserLogin, int result) {
				// TODO Auto-generated method stub
				System.out.println(result);
			}
		};

		fnOnRtnDepthMarketData fnOnRtnDepthMarketData_Holder = new QuantBoxLibrary.fnOnRtnDepthMarketData() {

			public void apply(Pointer pMdUserApi,CThostFtdcDepthMarketDataField pDepthMarketData) {
				// TODO Auto-generated method stub
				 
				
				System.out.println("---------------"+new String(pDepthMarketData.InstrumentID).trim()+"---------------");
				System.out.println("ExchangeID:\t"+new String(pDepthMarketData.ExchangeID).trim());
				System.out.println("ExchangeInstID:\t"+new String(pDepthMarketData.ExchangeInstID).trim());
				System.out.println("AskPrice1:\t"+pDepthMarketData.AskPrice1);
				System.out.println("AskVolume1:\t"+pDepthMarketData.AskVolume1);
				System.out.println("AveragePrice:\t"+pDepthMarketData.AveragePrice);
				System.out.println("BidPrice1:\t"+pDepthMarketData.BidPrice1);
				System.out.println("ClosePrice:\t"+pDepthMarketData.ClosePrice);
				System.out.println("CurrDelta:\t"+pDepthMarketData.CurrDelta);
				System.out.println("HighestPrice:\t"+pDepthMarketData.HighestPrice);
				System.out.println("LastPrice:\t"+pDepthMarketData.LastPrice);
				System.out.println("LowerLimitPrice:\t"+pDepthMarketData.LowerLimitPrice);
				
			}
		};

		MdApiWrapper MdApi = new MdApiWrapper();
		MdApi.fnOnConnect_Holder = fnOnConnect_Holder;
		MdApi.fnOnRtnDepthMarketData_Holder = fnOnRtnDepthMarketData_Holder;
		//MdApi.Connect("D:\\", "tcp://222.240.130.30:41213", "0292", "0018","000000");
		MdApi.Connect("D:\\", "tcp://asp-sim2-md1.financial-trading-platform.com:26213", "2030", "352032","888888");
		MdApi.Subscribe("IF1404,IF1405,IF1406,IF1409");
		 

		System.out.println("开始等待!");
		Thread.sleep(3600 * 1000);
		System.out.println("不等啦！");
		MdApi.Disconnect();
	}
}
