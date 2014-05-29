package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 行情交易所代码属性<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:3832</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcMarketDataExchangeField extends Structure {
	/**
	 * 交易所代码<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	public byte[] ExchangeID = new byte[9];
	public CThostFtdcMarketDataExchangeField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("ExchangeID");
	}
	/**
	 * @param ExchangeID 交易所代码<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	public CThostFtdcMarketDataExchangeField(byte ExchangeID[]) {
		super();
		if ((ExchangeID.length != this.ExchangeID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ExchangeID = ExchangeID;
	}
	public static class ByReference extends CThostFtdcMarketDataExchangeField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcMarketDataExchangeField implements Structure.ByValue {
		
	};
}
