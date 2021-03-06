package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 输入的报价<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:3266</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcInputQuoteField extends Structure {
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
	 * 合约代码<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	public byte[] InstrumentID = new byte[31];
	/**
	 * 报价引用<br>
	 * C type : TThostFtdcOrderRefType
	 */
	public byte[] QuoteRef = new byte[13];
	/**
	 * 用户代码<br>
	 * C type : TThostFtdcUserIDType
	 */
	public byte[] UserID = new byte[16];
	/**
	 * 卖价格<br>
	 * C type : TThostFtdcPriceType
	 */
	public double AskPrice;
	/**
	 * 买价格<br>
	 * C type : TThostFtdcPriceType
	 */
	public double BidPrice;
	/**
	 * 卖数量<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int AskVolume;
	/**
	 * 买数量<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int BidVolume;
	/**
	 * 请求编号<br>
	 * C type : TThostFtdcRequestIDType
	 */
	public int RequestID;
	/**
	 * 业务单元<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	public byte[] BusinessUnit = new byte[21];
	/**
	 * 卖开平标志<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	public byte AskOffsetFlag;
	/**
	 * 买开平标志<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	public byte BidOffsetFlag;
	/**
	 * 卖投机套保标志<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	public byte AskHedgeFlag;
	/**
	 * 买投机套保标志<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	public byte BidHedgeFlag;
	public CThostFtdcInputQuoteField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "InvestorID", "InstrumentID", "QuoteRef", "UserID", "AskPrice", "BidPrice", "AskVolume", "BidVolume", "RequestID", "BusinessUnit", "AskOffsetFlag", "BidOffsetFlag", "AskHedgeFlag", "BidHedgeFlag");
	}
	public static class ByReference extends CThostFtdcInputQuoteField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcInputQuoteField implements Structure.ByValue {
		
	};
}
