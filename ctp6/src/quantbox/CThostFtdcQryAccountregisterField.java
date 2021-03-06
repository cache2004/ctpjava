package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 请求查询银期签约关系<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:6932</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcQryAccountregisterField extends Structure {
	/**
	 * 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public byte[] BrokerID = new byte[11];
	/**
	 * 投资者帐号<br>
	 * C type : TThostFtdcAccountIDType
	 */
	public byte[] AccountID = new byte[13];
	/**
	 * 银行编码<br>
	 * C type : TThostFtdcBankIDType
	 */
	public byte[] BankID = new byte[4];
	/**
	 * 银行分支机构编码<br>
	 * C type : TThostFtdcBankBrchIDType
	 */
	public byte[] BankBranchID = new byte[5];
	/**
	 * 币种代码<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	public byte[] CurrencyID = new byte[4];
	public CThostFtdcQryAccountregisterField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "AccountID", "BankID", "BankBranchID", "CurrencyID");
	}
	/**
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param AccountID 投资者帐号<br>
	 * C type : TThostFtdcAccountIDType<br>
	 * @param BankID 银行编码<br>
	 * C type : TThostFtdcBankIDType<br>
	 * @param BankBranchID 银行分支机构编码<br>
	 * C type : TThostFtdcBankBrchIDType<br>
	 * @param CurrencyID 币种代码<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	public CThostFtdcQryAccountregisterField(byte BrokerID[], byte AccountID[], byte BankID[], byte BankBranchID[], byte CurrencyID[]) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((AccountID.length != this.AccountID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.AccountID = AccountID;
		if ((BankID.length != this.BankID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BankID = BankID;
		if ((BankBranchID.length != this.BankBranchID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BankBranchID = BankBranchID;
		if ((CurrencyID.length != this.CurrencyID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.CurrencyID = CurrencyID;
	}
	public static class ByReference extends CThostFtdcQryAccountregisterField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcQryAccountregisterField implements Structure.ByValue {
		
	};
}
