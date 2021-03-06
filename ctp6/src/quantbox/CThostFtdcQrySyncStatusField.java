package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 查询组合合约分腿<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:4185</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcQrySyncStatusField extends Structure {
	/**
	 * 交易日<br>
	 * C type : TThostFtdcDateType
	 */
	public byte[] TradingDay = new byte[9];
	public CThostFtdcQrySyncStatusField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("TradingDay");
	}
	/**
	 * @param TradingDay 交易日<br>
	 * C type : TThostFtdcDateType
	 */
	public CThostFtdcQrySyncStatusField(byte TradingDay[]) {
		super();
		if ((TradingDay.length != this.TradingDay.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.TradingDay = TradingDay;
	}
	public static class ByReference extends CThostFtdcQrySyncStatusField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcQrySyncStatusField implements Structure.ByValue {
		
	};
}
