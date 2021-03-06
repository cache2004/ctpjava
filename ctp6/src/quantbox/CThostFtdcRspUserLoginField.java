package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 用户登录应答<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:43</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcRspUserLoginField extends Structure {
	/**
	 * 交易日<br>
	 * C type : TThostFtdcDateType
	 */
	public byte[] TradingDay = new byte[9];
	/**
	 * 登录成功时间<br>
	 * C type : TThostFtdcTimeType
	 */
	public byte[] LoginTime = new byte[9];
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
	 * 交易系统名称<br>
	 * C type : TThostFtdcSystemNameType
	 */
	public byte[] SystemName = new byte[41];
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
	 * 最大报单引用<br>
	 * C type : TThostFtdcOrderRefType
	 */
	public byte[] MaxOrderRef = new byte[13];
	/**
	 * 上期所时间<br>
	 * C type : TThostFtdcTimeType
	 */
	public byte[] SHFETime = new byte[9];
	/**
	 * 大商所时间<br>
	 * C type : TThostFtdcTimeType
	 */
	public byte[] DCETime = new byte[9];
	/**
	 * 郑商所时间<br>
	 * C type : TThostFtdcTimeType
	 */
	public byte[] CZCETime = new byte[9];
	/**
	 * 中金所时间<br>
	 * C type : TThostFtdcTimeType
	 */
	public byte[] FFEXTime = new byte[9];
	/**
	 * 能源中心时间<br>
	 * C type : TThostFtdcTimeType
	 */
	public byte[] INETime = new byte[9];
	public CThostFtdcRspUserLoginField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("TradingDay", "LoginTime", "BrokerID", "UserID", "SystemName", "FrontID", "SessionID", "MaxOrderRef", "SHFETime", "DCETime", "CZCETime", "FFEXTime", "INETime");
	}
	public static class ByReference extends CThostFtdcRspUserLoginField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcRspUserLoginField implements Structure.ByValue {
		
	};
}
