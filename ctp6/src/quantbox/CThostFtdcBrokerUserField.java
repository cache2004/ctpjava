package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * ���͹�˾�û�<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:904</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcBrokerUserField extends Structure {
	/**
	 * ���͹�˾����<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public byte[] BrokerID = new byte[11];
	/**
	 * �û�����<br>
	 * C type : TThostFtdcUserIDType
	 */
	public byte[] UserID = new byte[16];
	/**
	 * �û�����<br>
	 * C type : TThostFtdcUserNameType
	 */
	public byte[] UserName = new byte[81];
	/**
	 * �û�����<br>
	 * C type : TThostFtdcUserTypeType
	 */
	public byte UserType;
	/**
	 * �Ƿ��Ծ<br>
	 * C type : TThostFtdcBoolType
	 */
	public int IsActive;
	/**
	 * �Ƿ�ʹ������<br>
	 * C type : TThostFtdcBoolType
	 */
	public int IsUsingOTP;
	public CThostFtdcBrokerUserField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "UserID", "UserName", "UserType", "IsActive", "IsUsingOTP");
	}
	/**
	 * @param BrokerID ���͹�˾����<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param UserID �û�����<br>
	 * C type : TThostFtdcUserIDType<br>
	 * @param UserName �û�����<br>
	 * C type : TThostFtdcUserNameType<br>
	 * @param UserType �û�����<br>
	 * C type : TThostFtdcUserTypeType<br>
	 * @param IsActive �Ƿ��Ծ<br>
	 * C type : TThostFtdcBoolType<br>
	 * @param IsUsingOTP �Ƿ�ʹ������<br>
	 * C type : TThostFtdcBoolType
	 */
	public CThostFtdcBrokerUserField(byte BrokerID[], byte UserID[], byte UserName[], byte UserType, int IsActive, int IsUsingOTP) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((UserID.length != this.UserID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.UserID = UserID;
		if ((UserName.length != this.UserName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.UserName = UserName;
		this.UserType = UserType;
		this.IsActive = IsActive;
		this.IsUsingOTP = IsUsingOTP;
	}
	public static class ByReference extends CThostFtdcBrokerUserField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcBrokerUserField implements Structure.ByValue {
		
	};
}