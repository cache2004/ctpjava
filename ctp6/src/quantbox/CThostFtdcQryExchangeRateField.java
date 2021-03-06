package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 查询汇率<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:2503</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcQryExchangeRateField extends Structure {
	/**
	 * 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public byte[] BrokerID = new byte[11];
	/**
	 * 源币种<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	public byte[] FromCurrencyID = new byte[4];
	/**
	 * 目标币种<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	public byte[] ToCurrencyID = new byte[4];
	public CThostFtdcQryExchangeRateField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "FromCurrencyID", "ToCurrencyID");
	}
	/**
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param FromCurrencyID 源币种<br>
	 * C type : TThostFtdcCurrencyIDType<br>
	 * @param ToCurrencyID 目标币种<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	public CThostFtdcQryExchangeRateField(byte BrokerID[], byte FromCurrencyID[], byte ToCurrencyID[]) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((FromCurrencyID.length != this.FromCurrencyID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.FromCurrencyID = FromCurrencyID;
		if ((ToCurrencyID.length != this.ToCurrencyID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ToCurrencyID = ToCurrencyID;
	}
	public static class ByReference extends CThostFtdcQryExchangeRateField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcQryExchangeRateField implements Structure.ByValue {
		
	};
}
