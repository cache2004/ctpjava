package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * ���������ġ�������<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:3806</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcMarketDataAsk45Field extends Structure {
	/**
	 * ��������<br>
	 * C type : TThostFtdcPriceType
	 */
	public double AskPrice4;
	/**
	 * ��������<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int AskVolume4;
	/**
	 * ��������<br>
	 * C type : TThostFtdcPriceType
	 */
	public double AskPrice5;
	/**
	 * ��������<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int AskVolume5;
	public CThostFtdcMarketDataAsk45Field() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("AskPrice4", "AskVolume4", "AskPrice5", "AskVolume5");
	}
	/**
	 * @param AskPrice4 ��������<br>
	 * C type : TThostFtdcPriceType<br>
	 * @param AskVolume4 ��������<br>
	 * C type : TThostFtdcVolumeType<br>
	 * @param AskPrice5 ��������<br>
	 * C type : TThostFtdcPriceType<br>
	 * @param AskVolume5 ��������<br>
	 * C type : TThostFtdcVolumeType
	 */
	public CThostFtdcMarketDataAsk45Field(double AskPrice4, int AskVolume4, double AskPrice5, int AskVolume5) {
		super();
		this.AskPrice4 = AskPrice4;
		this.AskVolume4 = AskVolume4;
		this.AskPrice5 = AskPrice5;
		this.AskVolume5 = AskVolume5;
	}
	public static class ByReference extends CThostFtdcMarketDataAsk45Field implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcMarketDataAsk45Field implements Structure.ByValue {
		
	};
}