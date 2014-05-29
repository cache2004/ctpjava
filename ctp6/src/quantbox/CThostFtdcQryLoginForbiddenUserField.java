package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 查询禁止登录用户<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:7359</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcQryLoginForbiddenUserField extends Structure {
	/**
	 * 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public byte[] BrokerID = new byte[11];
	/**
	 * 用户代码<br>
	 * C type : TThostFtdcUserIDType
	 */
	public byte[] UserID = new byte[16];
	public CThostFtdcQryLoginForbiddenUserField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "UserID");
	}
	/**
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param UserID 用户代码<br>
	 * C type : TThostFtdcUserIDType
	 */
	public CThostFtdcQryLoginForbiddenUserField(byte BrokerID[], byte UserID[]) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((UserID.length != this.UserID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.UserID = UserID;
	}
	public static class ByReference extends CThostFtdcQryLoginForbiddenUserField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcQryLoginForbiddenUserField implements Structure.ByValue {
		
	};
}
