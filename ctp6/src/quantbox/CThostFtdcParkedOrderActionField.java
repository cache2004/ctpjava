package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 输入预埋单操作<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:4422</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcParkedOrderActionField extends Structure {
	/**
	 * 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public byte[] BrokerID = new byte[11];
	/**
	 * 投资者代码<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	public byte[] InvestorID = new byte[13];
	/**
	 * 报单操作引用<br>
	 * C type : TThostFtdcOrderActionRefType
	 */
	public int OrderActionRef;
	/**
	 * 报单引用<br>
	 * C type : TThostFtdcOrderRefType
	 */
	public byte[] OrderRef = new byte[13];
	/**
	 * 请求编号<br>
	 * C type : TThostFtdcRequestIDType
	 */
	public int RequestID;
	/**
	 * 前置编号<br>
	 * C type : TThostFtdcFrontIDType
	 */
	public int FrontID;
	/**
	 * 会话编号<br>
	 * C type : TThostFtdcSessionIDType
	 */
	public int SessionID;
	/**
	 * 交易所代码<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	public byte[] ExchangeID = new byte[9];
	/**
	 * 报单编号<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	public byte[] OrderSysID = new byte[21];
	/**
	 * 操作标志<br>
	 * C type : TThostFtdcActionFlagType
	 */
	public byte ActionFlag;
	/**
	 * 价格<br>
	 * C type : TThostFtdcPriceType
	 */
	public double LimitPrice;
	/**
	 * 数量变化<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int VolumeChange;
	/**
	 * 用户代码<br>
	 * C type : TThostFtdcUserIDType
	 */
	public byte[] UserID = new byte[16];
	/**
	 * 合约代码<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	public byte[] InstrumentID = new byte[31];
	/**
	 * 预埋撤单单编号<br>
	 * C type : TThostFtdcParkedOrderActionIDType
	 */
	public byte[] ParkedOrderActionID = new byte[13];
	/**
	 * 用户类型<br>
	 * C type : TThostFtdcUserTypeType
	 */
	public byte UserType;
	/**
	 * 预埋撤单状态<br>
	 * C type : TThostFtdcParkedOrderStatusType
	 */
	public byte Status;
	/**
	 * 错误代码<br>
	 * C type : TThostFtdcErrorIDType
	 */
	public int ErrorID;
	/**
	 * 错误信息<br>
	 * C type : TThostFtdcErrorMsgType
	 */
	public byte[] ErrorMsg = new byte[81];
	public CThostFtdcParkedOrderActionField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "InvestorID", "OrderActionRef", "OrderRef", "RequestID", "FrontID", "SessionID", "ExchangeID", "OrderSysID", "ActionFlag", "LimitPrice", "VolumeChange", "UserID", "InstrumentID", "ParkedOrderActionID", "UserType", "Status", "ErrorID", "ErrorMsg");
	}
	public static class ByReference extends CThostFtdcParkedOrderActionField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcParkedOrderActionField implements Structure.ByValue {
		
	};
}
