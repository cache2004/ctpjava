package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 用户会话<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:1750</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcUserSessionField extends Structure {
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
	/**
	 * 登录日期<br>
	 * C type : TThostFtdcDateType
	 */
	public byte[] LoginDate = new byte[9];
	/**
	 * 登录时间<br>
	 * C type : TThostFtdcTimeType
	 */
	public byte[] LoginTime = new byte[9];
	/**
	 * IP地址<br>
	 * C type : TThostFtdcIPAddressType
	 */
	public byte[] IPAddress = new byte[16];
	/**
	 * 用户端产品信息<br>
	 * C type : TThostFtdcProductInfoType
	 */
	public byte[] UserProductInfo = new byte[11];
	/**
	 * 接口端产品信息<br>
	 * C type : TThostFtdcProductInfoType
	 */
	public byte[] InterfaceProductInfo = new byte[11];
	/**
	 * 协议信息<br>
	 * C type : TThostFtdcProtocolInfoType
	 */
	public byte[] ProtocolInfo = new byte[11];
	/**
	 * Mac地址<br>
	 * C type : TThostFtdcMacAddressType
	 */
	public byte[] MacAddress = new byte[21];
	public CThostFtdcUserSessionField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("FrontID", "SessionID", "BrokerID", "UserID", "LoginDate", "LoginTime", "IPAddress", "UserProductInfo", "InterfaceProductInfo", "ProtocolInfo", "MacAddress");
	}
	public static class ByReference extends CThostFtdcUserSessionField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcUserSessionField implements Structure.ByValue {
		
	};
}
