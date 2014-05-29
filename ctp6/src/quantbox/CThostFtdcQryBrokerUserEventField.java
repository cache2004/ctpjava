package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * ��ѯ���͹�˾�û��¼�<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:4256</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcQryBrokerUserEventField extends Structure {
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
	 * �û��¼�����<br>
	 * C type : TThostFtdcUserEventTypeType
	 */
	public byte UserEventType;
	public CThostFtdcQryBrokerUserEventField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "UserID", "UserEventType");
	}
	/**
	 * @param BrokerID ���͹�˾����<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param UserID �û�����<br>
	 * C type : TThostFtdcUserIDType<br>
	 * @param UserEventType �û��¼�����<br>
	 * C type : TThostFtdcUserEventTypeType
	 */
	public CThostFtdcQryBrokerUserEventField(byte BrokerID[], byte UserID[], byte UserEventType) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((UserID.length != this.UserID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.UserID = UserID;
		this.UserEventType = UserEventType;
	}
	public static class ByReference extends CThostFtdcQryBrokerUserEventField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcQryBrokerUserEventField implements Structure.ByValue {
		
	};
}