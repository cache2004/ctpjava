package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 经纪公司同步<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:1843</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcBrokerSyncField extends Structure {
	/**
	 * 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public byte[] BrokerID = new byte[11];
	public CThostFtdcBrokerSyncField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID");
	}
	/**
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public CThostFtdcBrokerSyncField(byte BrokerID[]) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
	}
	public static class ByReference extends CThostFtdcBrokerSyncField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcBrokerSyncField implements Structure.ByValue {
		
	};
}
