package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * Ͷ�����˻�<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:3876</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcInvestorAccountField extends Structure {
	/**
	 * ���͹�˾����<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public byte[] BrokerID = new byte[11];
	/**
	 * Ͷ���ߴ���<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	public byte[] InvestorID = new byte[13];
	/**
	 * Ͷ�����ʺ�<br>
	 * C type : TThostFtdcAccountIDType
	 */
	public byte[] AccountID = new byte[13];
	/**
	 * ���ִ���<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	public byte[] CurrencyID = new byte[4];
	public CThostFtdcInvestorAccountField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "InvestorID", "AccountID", "CurrencyID");
	}
	/**
	 * @param BrokerID ���͹�˾����<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param InvestorID Ͷ���ߴ���<br>
	 * C type : TThostFtdcInvestorIDType<br>
	 * @param AccountID Ͷ�����ʺ�<br>
	 * C type : TThostFtdcAccountIDType<br>
	 * @param CurrencyID ���ִ���<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	public CThostFtdcInvestorAccountField(byte BrokerID[], byte InvestorID[], byte AccountID[], byte CurrencyID[]) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((InvestorID.length != this.InvestorID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.InvestorID = InvestorID;
		if ((AccountID.length != this.AccountID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.AccountID = AccountID;
		if ((CurrencyID.length != this.CurrencyID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.CurrencyID = CurrencyID;
	}
	public static class ByReference extends CThostFtdcInvestorAccountField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcInvestorAccountField implements Structure.ByValue {
		
	};
}