package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 查询结算信息确认域<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:4105</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcQrySettlementInfoConfirmField extends Structure {
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
	public CThostFtdcQrySettlementInfoConfirmField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "InvestorID");
	}
	/**
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param InvestorID 投资者代码<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	public CThostFtdcQrySettlementInfoConfirmField(byte BrokerID[], byte InvestorID[]) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((InvestorID.length != this.InvestorID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.InvestorID = InvestorID;
	}
	public static class ByReference extends CThostFtdcQrySettlementInfoConfirmField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcQrySettlementInfoConfirmField implements Structure.ByValue {
		
	};
}
