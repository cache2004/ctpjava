package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 查询用户会话<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:2319</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcQryUserSessionField extends Structure {
	/**
	 * 前置编号<br>
	 * C type : TThostFtdcFrontIDType
	 */
	public int FrontID;
	/**
	 * 会话编号<br>
	 * C type : TThostFtdcSessionIDType
	 */
	public int SessionID;
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
	public CThostFtdcQryUserSessionField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("FrontID", "SessionID", "BrokerID", "UserID");
	}
	/**
	 * @param FrontID 前置编号<br>
	 * C type : TThostFtdcFrontIDType<br>
	 * @param SessionID 会话编号<br>
	 * C type : TThostFtdcSessionIDType<br>
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param UserID 用户代码<br>
	 * C type : TThostFtdcUserIDType
	 */
	public CThostFtdcQryUserSessionField(int FrontID, int SessionID, byte BrokerID[], byte UserID[]) {
		super();
		this.FrontID = FrontID;
		this.SessionID = SessionID;
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((UserID.length != this.UserID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.UserID = UserID;
	}
	public static class ByReference extends CThostFtdcQryUserSessionField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcQryUserSessionField implements Structure.ByValue {
		
	};
}
