package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 结算引用<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:1097</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcSettlementRefField extends Structure {
	/**
	 * 交易日<br>
	 * C type : TThostFtdcDateType
	 */
	public byte[] TradingDay = new byte[9];
	/**
	 * 结算编号<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	public int SettlementID;
	public CThostFtdcSettlementRefField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("TradingDay", "SettlementID");
	}
	/**
	 * @param TradingDay 交易日<br>
	 * C type : TThostFtdcDateType<br>
	 * @param SettlementID 结算编号<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	public CThostFtdcSettlementRefField(byte TradingDay[], int SettlementID) {
		super();
		if ((TradingDay.length != this.TradingDay.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.TradingDay = TradingDay;
		this.SettlementID = SettlementID;
	}
	public static class ByReference extends CThostFtdcSettlementRefField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcSettlementRefField implements Structure.ByValue {
		
	};
}
