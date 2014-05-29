package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * ָ���ĺ�Լ<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:3839</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcSpecificInstrumentField extends Structure {
	/**
	 * ��Լ����<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	public byte[] InstrumentID = new byte[31];
	public CThostFtdcSpecificInstrumentField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("InstrumentID");
	}
	/**
	 * @param InstrumentID ��Լ����<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	public CThostFtdcSpecificInstrumentField(byte InstrumentID[]) {
		super();
		if ((InstrumentID.length != this.InstrumentID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.InstrumentID = InstrumentID;
	}
	public static class ByReference extends CThostFtdcSpecificInstrumentField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcSpecificInstrumentField implements Structure.ByValue {
		
	};
}