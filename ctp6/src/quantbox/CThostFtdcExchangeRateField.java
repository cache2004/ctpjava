package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 汇率<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:1082</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcExchangeRateField extends Structure {
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
	 * 源币种单位数量<br>
	 * C type : TThostFtdcCurrencyUnitType
	 */
	public double FromCurrencyUnit;
	/**
	 * 目标币种<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	public byte[] ToCurrencyID = new byte[4];
	/**
	 * 汇率<br>
	 * C type : TThostFtdcExchangeRateType
	 */
	public double ExchangeRate;
	public CThostFtdcExchangeRateField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "FromCurrencyID", "FromCurrencyUnit", "ToCurrencyID", "ExchangeRate");
	}
	/**
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param FromCurrencyID 源币种<br>
	 * C type : TThostFtdcCurrencyIDType<br>
	 * @param FromCurrencyUnit 源币种单位数量<br>
	 * C type : TThostFtdcCurrencyUnitType<br>
	 * @param ToCurrencyID 目标币种<br>
	 * C type : TThostFtdcCurrencyIDType<br>
	 * @param ExchangeRate 汇率<br>
	 * C type : TThostFtdcExchangeRateType
	 */
	public CThostFtdcExchangeRateField(byte BrokerID[], byte FromCurrencyID[], double FromCurrencyUnit, byte ToCurrencyID[], double ExchangeRate) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((FromCurrencyID.length != this.FromCurrencyID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.FromCurrencyID = FromCurrencyID;
		this.FromCurrencyUnit = FromCurrencyUnit;
		if ((ToCurrencyID.length != this.ToCurrencyID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ToCurrencyID = ToCurrencyID;
		this.ExchangeRate = ExchangeRate;
	}
	public static class ByReference extends CThostFtdcExchangeRateField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcExchangeRateField implements Structure.ByValue {
		
	};
}
