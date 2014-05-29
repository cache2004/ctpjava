package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 交易所<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:311</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcExchangeField extends Structure {
	/**
	 * 交易所代码<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	public byte[] ExchangeID = new byte[9];
	/**
	 * 交易所名称<br>
	 * C type : TThostFtdcExchangeNameType
	 */
	public byte[] ExchangeName = new byte[61];
	/**
	 * 交易所属性<br>
	 * C type : TThostFtdcExchangePropertyType
	 */
	public byte ExchangeProperty;
	public CThostFtdcExchangeField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("ExchangeID", "ExchangeName", "ExchangeProperty");
	}
	/**
	 * @param ExchangeID 交易所代码<br>
	 * C type : TThostFtdcExchangeIDType<br>
	 * @param ExchangeName 交易所名称<br>
	 * C type : TThostFtdcExchangeNameType<br>
	 * @param ExchangeProperty 交易所属性<br>
	 * C type : TThostFtdcExchangePropertyType
	 */
	public CThostFtdcExchangeField(byte ExchangeID[], byte ExchangeName[], byte ExchangeProperty) {
		super();
		if ((ExchangeID.length != this.ExchangeID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ExchangeID = ExchangeID;
		if ((ExchangeName.length != this.ExchangeName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ExchangeName = ExchangeName;
		this.ExchangeProperty = ExchangeProperty;
	}
	public static class ByReference extends CThostFtdcExchangeField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcExchangeField implements Structure.ByValue {
		
	};
}
