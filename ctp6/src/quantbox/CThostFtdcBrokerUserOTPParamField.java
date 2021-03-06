package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 用户动态令牌参数<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:5063</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcBrokerUserOTPParamField extends Structure {
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
	/**
	 * 动态令牌提供商<br>
	 * C type : TThostFtdcOTPVendorsIDType
	 */
	public byte[] OTPVendorsID = new byte[2];
	/**
	 * 动态令牌序列号<br>
	 * C type : TThostFtdcSerialNumberType
	 */
	public byte[] SerialNumber = new byte[17];
	/**
	 * 令牌密钥<br>
	 * C type : TThostFtdcAuthKeyType
	 */
	public byte[] AuthKey = new byte[41];
	/**
	 * 漂移值<br>
	 * C type : TThostFtdcLastDriftType
	 */
	public int LastDrift;
	/**
	 * 成功值<br>
	 * C type : TThostFtdcLastSuccessType
	 */
	public int LastSuccess;
	/**
	 * 动态令牌类型<br>
	 * C type : TThostFtdcOTPTypeType
	 */
	public byte OTPType;
	public CThostFtdcBrokerUserOTPParamField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "UserID", "OTPVendorsID", "SerialNumber", "AuthKey", "LastDrift", "LastSuccess", "OTPType");
	}
	/**
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param UserID 用户代码<br>
	 * C type : TThostFtdcUserIDType<br>
	 * @param OTPVendorsID 动态令牌提供商<br>
	 * C type : TThostFtdcOTPVendorsIDType<br>
	 * @param SerialNumber 动态令牌序列号<br>
	 * C type : TThostFtdcSerialNumberType<br>
	 * @param AuthKey 令牌密钥<br>
	 * C type : TThostFtdcAuthKeyType<br>
	 * @param LastDrift 漂移值<br>
	 * C type : TThostFtdcLastDriftType<br>
	 * @param LastSuccess 成功值<br>
	 * C type : TThostFtdcLastSuccessType<br>
	 * @param OTPType 动态令牌类型<br>
	 * C type : TThostFtdcOTPTypeType
	 */
	public CThostFtdcBrokerUserOTPParamField(byte BrokerID[], byte UserID[], byte OTPVendorsID[], byte SerialNumber[], byte AuthKey[], int LastDrift, int LastSuccess, byte OTPType) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((UserID.length != this.UserID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.UserID = UserID;
		if ((OTPVendorsID.length != this.OTPVendorsID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.OTPVendorsID = OTPVendorsID;
		if ((SerialNumber.length != this.SerialNumber.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.SerialNumber = SerialNumber;
		if ((AuthKey.length != this.AuthKey.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.AuthKey = AuthKey;
		this.LastDrift = LastDrift;
		this.LastSuccess = LastSuccess;
		this.OTPType = OTPType;
	}
	public static class ByReference extends CThostFtdcBrokerUserOTPParamField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcBrokerUserOTPParamField implements Structure.ByValue {
		
	};
}
