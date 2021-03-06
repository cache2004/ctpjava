package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 查询投资者品种/跨品种保证金<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:5173</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcQryInvestorProductGroupMarginField extends Structure {
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
	 * 品种/跨品种标示<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	public byte[] ProductGroupID = new byte[31];
	/**
	 * 投机套保标志<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	public byte HedgeFlag;
	public CThostFtdcQryInvestorProductGroupMarginField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "InvestorID", "ProductGroupID", "HedgeFlag");
	}
	/**
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param InvestorID 投资者代码<br>
	 * C type : TThostFtdcInvestorIDType<br>
	 * @param ProductGroupID 品种/跨品种标示<br>
	 * C type : TThostFtdcInstrumentIDType<br>
	 * @param HedgeFlag 投机套保标志<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	public CThostFtdcQryInvestorProductGroupMarginField(byte BrokerID[], byte InvestorID[], byte ProductGroupID[], byte HedgeFlag) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((InvestorID.length != this.InvestorID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.InvestorID = InvestorID;
		if ((ProductGroupID.length != this.ProductGroupID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ProductGroupID = ProductGroupID;
		this.HedgeFlag = HedgeFlag;
	}
	public static class ByReference extends CThostFtdcQryInvestorProductGroupMarginField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcQryInvestorProductGroupMarginField implements Structure.ByValue {
		
	};
}
