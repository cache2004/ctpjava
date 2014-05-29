package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 期商签退通知<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:6832</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcNotifyFutureSignOutField extends Structure {
	/**
	 * 业务功能码<br>
	 * C type : TThostFtdcTradeCodeType
	 */
	public byte[] TradeCode = new byte[7];
	/**
	 * 银行代码<br>
	 * C type : TThostFtdcBankIDType
	 */
	public byte[] BankID = new byte[4];
	/**
	 * 银行分支机构代码<br>
	 * C type : TThostFtdcBankBrchIDType
	 */
	public byte[] BankBranchID = new byte[5];
	/**
	 * 期商代码<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public byte[] BrokerID = new byte[11];
	/**
	 * 期商分支机构代码<br>
	 * C type : TThostFtdcFutureBranchIDType
	 */
	public byte[] BrokerBranchID = new byte[31];
	/**
	 * 交易日期<br>
	 * C type : TThostFtdcTradeDateType
	 */
	public byte[] TradeDate = new byte[9];
	/**
	 * 交易时间<br>
	 * C type : TThostFtdcTradeTimeType
	 */
	public byte[] TradeTime = new byte[9];
	/**
	 * 银行流水号<br>
	 * C type : TThostFtdcBankSerialType
	 */
	public byte[] BankSerial = new byte[13];
	/**
	 * 交易系统日期<br>
	 * C type : TThostFtdcTradeDateType
	 */
	public byte[] TradingDay = new byte[9];
	/**
	 * 银期平台消息流水号<br>
	 * C type : TThostFtdcSerialType
	 */
	public int PlateSerial;
	/**
	 * 最后分片标志<br>
	 * C type : TThostFtdcLastFragmentType
	 */
	public byte LastFragment;
	/**
	 * 会话号<br>
	 * C type : TThostFtdcSessionIDType
	 */
	public int SessionID;
	/**
	 * 安装编号<br>
	 * C type : TThostFtdcInstallIDType
	 */
	public int InstallID;
	/**
	 * 用户标识<br>
	 * C type : TThostFtdcUserIDType
	 */
	public byte[] UserID = new byte[16];
	/**
	 * 摘要<br>
	 * C type : TThostFtdcDigestType
	 */
	public byte[] Digest = new byte[36];
	/**
	 * 币种代码<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	public byte[] CurrencyID = new byte[4];
	/**
	 * 渠道标志<br>
	 * C type : TThostFtdcDeviceIDType
	 */
	public byte[] DeviceID = new byte[3];
	/**
	 * 期货公司银行编码<br>
	 * C type : TThostFtdcBankCodingForFutureType
	 */
	public byte[] BrokerIDByBank = new byte[33];
	/**
	 * 交易柜员<br>
	 * C type : TThostFtdcOperNoType
	 */
	public byte[] OperNo = new byte[17];
	/**
	 * 请求编号<br>
	 * C type : TThostFtdcRequestIDType
	 */
	public int RequestID;
	/**
	 * 交易ID<br>
	 * C type : TThostFtdcTIDType
	 */
	public int TID;
	/**
	 * 错误代码<br>
	 * C type : TThostFtdcErrorIDType
	 */
	public int ErrorID;
	/**
	 * 错误信息<br>
	 * C type : TThostFtdcErrorMsgType
	 */
	public byte[] ErrorMsg = new byte[81];
	public CThostFtdcNotifyFutureSignOutField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("TradeCode", "BankID", "BankBranchID", "BrokerID", "BrokerBranchID", "TradeDate", "TradeTime", "BankSerial", "TradingDay", "PlateSerial", "LastFragment", "SessionID", "InstallID", "UserID", "Digest", "CurrencyID", "DeviceID", "BrokerIDByBank", "OperNo", "RequestID", "TID", "ErrorID", "ErrorMsg");
	}
	public static class ByReference extends CThostFtdcNotifyFutureSignOutField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcNotifyFutureSignOutField implements Structure.ByValue {
		
	};
}
