package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 银期转帐报文头<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:131</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcTransferHeaderField extends Structure {
	/**
	 * 版本号，常量，1.0<br>
	 * C type : TThostFtdcVersionType
	 */
	public byte[] Version = new byte[4];
	/**
	 * 交易代码，必填<br>
	 * C type : TThostFtdcTradeCodeType
	 */
	public byte[] TradeCode = new byte[7];
	/**
	 * 交易日期，必填，格式：yyyymmdd<br>
	 * C type : TThostFtdcTradeDateType
	 */
	public byte[] TradeDate = new byte[9];
	/**
	 * 交易时间，必填，格式：hhmmss<br>
	 * C type : TThostFtdcTradeTimeType
	 */
	public byte[] TradeTime = new byte[9];
	/**
	 * 发起方流水号，N/A<br>
	 * C type : TThostFtdcTradeSerialType
	 */
	public byte[] TradeSerial = new byte[9];
	/**
	 * 期货公司代码，必填<br>
	 * C type : TThostFtdcFutureIDType
	 */
	public byte[] FutureID = new byte[11];
	/**
	 * 银行代码，根据查询银行得到，必填<br>
	 * C type : TThostFtdcBankIDType
	 */
	public byte[] BankID = new byte[4];
	/**
	 * 银行分中心代码，根据查询银行得到，必填<br>
	 * C type : TThostFtdcBankBrchIDType
	 */
	public byte[] BankBrchID = new byte[5];
	/**
	 * 操作员，N/A<br>
	 * C type : TThostFtdcOperNoType
	 */
	public byte[] OperNo = new byte[17];
	/**
	 * 交易设备类型，N/A<br>
	 * C type : TThostFtdcDeviceIDType
	 */
	public byte[] DeviceID = new byte[3];
	/**
	 * 记录数，N/A<br>
	 * C type : TThostFtdcRecordNumType
	 */
	public byte[] RecordNum = new byte[7];
	/**
	 * 会话编号，N/A<br>
	 * C type : TThostFtdcSessionIDType
	 */
	public int SessionID;
	/**
	 * 请求编号，N/A<br>
	 * C type : TThostFtdcRequestIDType
	 */
	public int RequestID;
	public CThostFtdcTransferHeaderField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("Version", "TradeCode", "TradeDate", "TradeTime", "TradeSerial", "FutureID", "BankID", "BankBrchID", "OperNo", "DeviceID", "RecordNum", "SessionID", "RequestID");
	}
	public static class ByReference extends CThostFtdcTransferHeaderField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcTransferHeaderField implements Structure.ByValue {
		
	};
}
