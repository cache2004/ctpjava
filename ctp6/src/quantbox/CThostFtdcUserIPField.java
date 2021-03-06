package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 用户IP<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:4559</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcUserIPField extends Structure {
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
	 * IP地址<br>
	 * C type : TThostFtdcIPAddressType
	 */
	public byte[] IPAddress = new byte[16];
	/**
	 * IP地址掩码<br>
	 * C type : TThostFtdcIPAddressType
	 */
	public byte[] IPMask = new byte[16];
	/**
	 * Mac地址<br>
	 * C type : TThostFtdcMacAddressType
	 */
	public byte[] MacAddress = new byte[21];
	public CThostFtdcUserIPField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "UserID", "IPAddress", "IPMask", "MacAddress");
	}
	/**
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param UserID 用户代码<br>
	 * C type : TThostFtdcUserIDType<br>
	 * @param IPAddress IP地址<br>
	 * C type : TThostFtdcIPAddressType<br>
	 * @param IPMask IP地址掩码<br>
	 * C type : TThostFtdcIPAddressType<br>
	 * @param MacAddress Mac地址<br>
	 * C type : TThostFtdcMacAddressType
	 */
	public CThostFtdcUserIPField(byte BrokerID[], byte UserID[], byte IPAddress[], byte IPMask[], byte MacAddress[]) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((UserID.length != this.UserID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.UserID = UserID;
		if ((IPAddress.length != this.IPAddress.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.IPAddress = IPAddress;
		if ((IPMask.length != this.IPMask.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.IPMask = IPMask;
		if ((MacAddress.length != this.MacAddress.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.MacAddress = MacAddress;
	}
	public static class ByReference extends CThostFtdcUserIPField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcUserIPField implements Structure.ByValue {
		
	};
}
