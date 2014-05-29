package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 查询货币质押流水<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:2514</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcQrySyncFundMortgageField extends Structure {
	/**
	 * 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public byte[] BrokerID = new byte[11];
	/**
	 * 货币质押流水号<br>
	 * C type : TThostFtdcDepositSeqNoType
	 */
	public byte[] MortgageSeqNo = new byte[15];
	public CThostFtdcQrySyncFundMortgageField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "MortgageSeqNo");
	}
	/**
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param MortgageSeqNo 货币质押流水号<br>
	 * C type : TThostFtdcDepositSeqNoType
	 */
	public CThostFtdcQrySyncFundMortgageField(byte BrokerID[], byte MortgageSeqNo[]) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((MortgageSeqNo.length != this.MortgageSeqNo.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.MortgageSeqNo = MortgageSeqNo;
	}
	public static class ByReference extends CThostFtdcQrySyncFundMortgageField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcQrySyncFundMortgageField implements Structure.ByValue {
		
	};
}
