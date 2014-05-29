package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 输入报价操作<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:3301</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcInputQuoteActionField extends Structure {
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
	 * 报价操作引用<br>
	 * C type : TThostFtdcOrderActionRefType
	 */
	public int QuoteActionRef;
	/**
	 * 报价引用<br>
	 * C type : TThostFtdcOrderRefType
	 */
	public byte[] QuoteRef = new byte[13];
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
	 * 报价操作编号<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	public byte[] QuoteSysID = new byte[21];
	/**
	 * 操作标志<br>
	 * C type : TThostFtdcActionFlagType
	 */
	public byte ActionFlag;
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
	public CThostFtdcInputQuoteActionField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "InvestorID", "QuoteActionRef", "QuoteRef", "RequestID", "FrontID", "SessionID", "ExchangeID", "QuoteSysID", "ActionFlag", "UserID", "InstrumentID");
	}
	public static class ByReference extends CThostFtdcInputQuoteActionField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcInputQuoteActionField implements Structure.ByValue {
		
	};
}
