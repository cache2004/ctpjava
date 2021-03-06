package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 资金账户基本准备金<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:7379</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcTradingAccountReserveField extends Structure {
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
	 * 基本准备金<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double Reserve;
	/**
	 * 币种代码<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	public byte[] CurrencyID = new byte[4];
	public CThostFtdcTradingAccountReserveField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "AccountID", "Reserve", "CurrencyID");
	}
	/**
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param AccountID 投资者帐号<br>
	 * C type : TThostFtdcAccountIDType<br>
	 * @param Reserve 基本准备金<br>
	 * C type : TThostFtdcMoneyType<br>
	 * @param CurrencyID 币种代码<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	public CThostFtdcTradingAccountReserveField(byte BrokerID[], byte AccountID[], double Reserve, byte CurrencyID[]) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((AccountID.length != this.AccountID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.AccountID = AccountID;
		this.Reserve = Reserve;
		if ((CurrencyID.length != this.CurrencyID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.CurrencyID = CurrencyID;
	}
	public static class ByReference extends CThostFtdcTradingAccountReserveField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcTradingAccountReserveField implements Structure.ByValue {
		
	};
}
