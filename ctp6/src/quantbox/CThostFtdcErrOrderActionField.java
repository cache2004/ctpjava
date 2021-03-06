package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 错误报单操作<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:4817</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcErrOrderActionField extends Structure {
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
	 * 操作日期<br>
	 * C type : TThostFtdcDateType
	 */
	public byte[] ActionDate = new byte[9];
	/**
	 * 操作时间<br>
	 * C type : TThostFtdcTimeType
	 */
	public byte[] ActionTime = new byte[9];
	/**
	 * 交易所交易员代码<br>
	 * C type : TThostFtdcTraderIDType
	 */
	public byte[] TraderID = new byte[21];
	/**
	 * 安装编号<br>
	 * C type : TThostFtdcInstallIDType
	 */
	public int InstallID;
	/**
	 * 本地报单编号<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	public byte[] OrderLocalID = new byte[13];
	/**
	 * 操作本地编号<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	public byte[] ActionLocalID = new byte[13];
	/**
	 * 会员代码<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	public byte[] ParticipantID = new byte[11];
	/**
	 * 客户代码<br>
	 * C type : TThostFtdcClientIDType
	 */
	public byte[] ClientID = new byte[11];
	/**
	 * 业务单元<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	public byte[] BusinessUnit = new byte[21];
	/**
	 * 报单操作状态<br>
	 * C type : TThostFtdcOrderActionStatusType
	 */
	public byte OrderActionStatus;
	/**
	 * 用户代码<br>
	 * C type : TThostFtdcUserIDType
	 */
	public byte[] UserID = new byte[16];
	/**
	 * 状态信息<br>
	 * C type : TThostFtdcErrorMsgType
	 */
	public byte[] StatusMsg = new byte[81];
	/**
	 * 合约代码<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	public byte[] InstrumentID = new byte[31];
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
	public CThostFtdcErrOrderActionField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "InvestorID", "OrderActionRef", "OrderRef", "RequestID", "FrontID", "SessionID", "ExchangeID", "OrderSysID", "ActionFlag", "LimitPrice", "VolumeChange", "ActionDate", "ActionTime", "TraderID", "InstallID", "OrderLocalID", "ActionLocalID", "ParticipantID", "ClientID", "BusinessUnit", "OrderActionStatus", "UserID", "StatusMsg", "InstrumentID", "ErrorID", "ErrorMsg");
	}
	public static class ByReference extends CThostFtdcErrOrderActionField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcErrOrderActionField implements Structure.ByValue {
		
	};
}
