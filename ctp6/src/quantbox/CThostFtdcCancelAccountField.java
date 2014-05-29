package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 银期销户信息<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:7083</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcCancelAccountField extends Structure {
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
	 * 客户姓名<br>
	 * C type : TThostFtdcIndividualNameType
	 */
	public byte[] CustomerName = new byte[51];
	/**
	 * 证件类型<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	public byte IdCardType;
	/**
	 * 证件号码<br>
	 * C type : TThostFtdcIdentifiedCardNoType
	 */
	public byte[] IdentifiedCardNo = new byte[51];
	/**
	 * 性别<br>
	 * C type : TThostFtdcGenderType
	 */
	public byte Gender;
	/**
	 * 国家代码<br>
	 * C type : TThostFtdcCountryCodeType
	 */
	public byte[] CountryCode = new byte[21];
	/**
	 * 客户类型<br>
	 * C type : TThostFtdcCustTypeType
	 */
	public byte CustType;
	/**
	 * 地址<br>
	 * C type : TThostFtdcAddressType
	 */
	public byte[] Address = new byte[101];
	/**
	 * 邮编<br>
	 * C type : TThostFtdcZipCodeType
	 */
	public byte[] ZipCode = new byte[7];
	/**
	 * 电话号码<br>
	 * C type : TThostFtdcTelephoneType
	 */
	public byte[] Telephone = new byte[41];
	/**
	 * 手机<br>
	 * C type : TThostFtdcMobilePhoneType
	 */
	public byte[] MobilePhone = new byte[21];
	/**
	 * 传真<br>
	 * C type : TThostFtdcFaxType
	 */
	public byte[] Fax = new byte[41];
	/**
	 * 电子邮件<br>
	 * C type : TThostFtdcEMailType
	 */
	public byte[] EMail = new byte[41];
	/**
	 * 资金账户状态<br>
	 * C type : TThostFtdcMoneyAccountStatusType
	 */
	public byte MoneyAccountStatus;
	/**
	 * 银行帐号<br>
	 * C type : TThostFtdcBankAccountType
	 */
	public byte[] BankAccount = new byte[41];
	/**
	 * 银行密码<br>
	 * C type : TThostFtdcPasswordType
	 */
	public byte[] BankPassWord = new byte[41];
	/**
	 * 投资者帐号<br>
	 * C type : TThostFtdcAccountIDType
	 */
	public byte[] AccountID = new byte[13];
	/**
	 * 期货密码<br>
	 * C type : TThostFtdcPasswordType
	 */
	public byte[] Password = new byte[41];
	/**
	 * 安装编号<br>
	 * C type : TThostFtdcInstallIDType
	 */
	public int InstallID;
	/**
	 * 验证客户证件号码标志<br>
	 * C type : TThostFtdcYesNoIndicatorType
	 */
	public byte VerifyCertNoFlag;
	/**
	 * 币种代码<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	public byte[] CurrencyID = new byte[4];
	/**
	 * 汇钞标志<br>
	 * C type : TThostFtdcCashExchangeCodeType
	 */
	public byte CashExchangeCode;
	/**
	 * 摘要<br>
	 * C type : TThostFtdcDigestType
	 */
	public byte[] Digest = new byte[36];
	/**
	 * 银行帐号类型<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	public byte BankAccType;
	/**
	 * 渠道标志<br>
	 * C type : TThostFtdcDeviceIDType
	 */
	public byte[] DeviceID = new byte[3];
	/**
	 * 期货单位帐号类型<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	public byte BankSecuAccType;
	/**
	 * 期货公司银行编码<br>
	 * C type : TThostFtdcBankCodingForFutureType
	 */
	public byte[] BrokerIDByBank = new byte[33];
	/**
	 * 期货单位帐号<br>
	 * C type : TThostFtdcBankAccountType
	 */
	public byte[] BankSecuAcc = new byte[41];
	/**
	 * 银行密码标志<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	public byte BankPwdFlag;
	/**
	 * 期货资金密码核对标志<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	public byte SecuPwdFlag;
	/**
	 * 交易柜员<br>
	 * C type : TThostFtdcOperNoType
	 */
	public byte[] OperNo = new byte[17];
	/**
	 * 交易ID<br>
	 * C type : TThostFtdcTIDType
	 */
	public int TID;
	/**
	 * 用户标识<br>
	 * C type : TThostFtdcUserIDType
	 */
	public byte[] UserID = new byte[16];
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
	public CThostFtdcCancelAccountField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("TradeCode", "BankID", "BankBranchID", "BrokerID", "BrokerBranchID", "TradeDate", "TradeTime", "BankSerial", "TradingDay", "PlateSerial", "LastFragment", "SessionID", "CustomerName", "IdCardType", "IdentifiedCardNo", "Gender", "CountryCode", "CustType", "Address", "ZipCode", "Telephone", "MobilePhone", "Fax", "EMail", "MoneyAccountStatus", "BankAccount", "BankPassWord", "AccountID", "Password", "InstallID", "VerifyCertNoFlag", "CurrencyID", "CashExchangeCode", "Digest", "BankAccType", "DeviceID", "BankSecuAccType", "BrokerIDByBank", "BankSecuAcc", "BankPwdFlag", "SecuPwdFlag", "OperNo", "TID", "UserID", "ErrorID", "ErrorMsg");
	}
	public static class ByReference extends CThostFtdcCancelAccountField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcCancelAccountField implements Structure.ByValue {
		
	};
}
