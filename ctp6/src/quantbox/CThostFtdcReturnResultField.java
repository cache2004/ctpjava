package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * ���ؽ��<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:6421</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcReturnResultField extends Structure {
	/**
	 * ���ش���<br>
	 * C type : TThostFtdcReturnCodeType
	 */
	public byte[] ReturnCode = new byte[7];
	/**
	 * ����������<br>
	 * C type : TThostFtdcDescrInfoForReturnCodeType
	 */
	public byte[] DescrInfoForReturnCode = new byte[129];
	public CThostFtdcReturnResultField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("ReturnCode", "DescrInfoForReturnCode");
	}
	/**
	 * @param ReturnCode ���ش���<br>
	 * C type : TThostFtdcReturnCodeType<br>
	 * @param DescrInfoForReturnCode ����������<br>
	 * C type : TThostFtdcDescrInfoForReturnCodeType
	 */
	public CThostFtdcReturnResultField(byte ReturnCode[], byte DescrInfoForReturnCode[]) {
		super();
		if ((ReturnCode.length != this.ReturnCode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ReturnCode = ReturnCode;
		if ((DescrInfoForReturnCode.length != this.DescrInfoForReturnCode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.DescrInfoForReturnCode = DescrInfoForReturnCode;
	}
	public static class ByReference extends CThostFtdcReturnResultField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcReturnResultField implements Structure.ByValue {
		
	};
}
