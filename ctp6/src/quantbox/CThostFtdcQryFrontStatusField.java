package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * ��ѯǰ��״̬<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:2343</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcQryFrontStatusField extends Structure {
	/**
	 * ǰ�ñ��<br>
	 * C type : TThostFtdcFrontIDType
	 */
	public int FrontID;
	public CThostFtdcQryFrontStatusField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("FrontID");
	}
	/**
	 * @param FrontID ǰ�ñ��<br>
	 * C type : TThostFtdcFrontIDType
	 */
	public CThostFtdcQryFrontStatusField(int FrontID) {
		super();
		this.FrontID = FrontID;
	}
	public static class ByReference extends CThostFtdcQryFrontStatusField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcQryFrontStatusField implements Structure.ByValue {
		
	};
}
