package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 查询产品<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:2403</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcQryProductField extends Structure {
	/**
	 * 产品代码<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	public byte[] ProductID = new byte[31];
	/**
	 * 产品类型<br>
	 * C type : TThostFtdcProductClassType
	 */
	public byte ProductClass;
	public CThostFtdcQryProductField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("ProductID", "ProductClass");
	}
	/**
	 * @param ProductID 产品代码<br>
	 * C type : TThostFtdcInstrumentIDType<br>
	 * @param ProductClass 产品类型<br>
	 * C type : TThostFtdcProductClassType
	 */
	public CThostFtdcQryProductField(byte ProductID[], byte ProductClass) {
		super();
		if ((ProductID.length != this.ProductID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ProductID = ProductID;
		this.ProductClass = ProductClass;
	}
	public static class ByReference extends CThostFtdcQryProductField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcQryProductField implements Structure.ByValue {
		
	};
}
