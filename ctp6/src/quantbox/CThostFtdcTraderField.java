package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 交易所交易员<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:441</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcTraderField extends Structure {
	/**
	 * 交易所代码<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	public byte[] ExchangeID = new byte[9];
	/**
	 * 交易所交易员代码<br>
	 * C type : TThostFtdcTraderIDType
	 */
	public byte[] TraderID = new byte[21];
	/**
	 * 会员代码<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	public byte[] ParticipantID = new byte[11];
	/**
	 * 密码<br>
	 * C type : TThostFtdcPasswordType
	 */
	public byte[] Password = new byte[41];
	/**
	 * 安装数量<br>
	 * C type : TThostFtdcInstallCountType
	 */
	public int InstallCount;
	/**
	 * 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public byte[] BrokerID = new byte[11];
	public CThostFtdcTraderField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("ExchangeID", "TraderID", "ParticipantID", "Password", "InstallCount", "BrokerID");
	}
	/**
	 * @param ExchangeID 交易所代码<br>
	 * C type : TThostFtdcExchangeIDType<br>
	 * @param TraderID 交易所交易员代码<br>
	 * C type : TThostFtdcTraderIDType<br>
	 * @param ParticipantID 会员代码<br>
	 * C type : TThostFtdcParticipantIDType<br>
	 * @param Password 密码<br>
	 * C type : TThostFtdcPasswordType<br>
	 * @param InstallCount 安装数量<br>
	 * C type : TThostFtdcInstallCountType<br>
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public CThostFtdcTraderField(byte ExchangeID[], byte TraderID[], byte ParticipantID[], byte Password[], int InstallCount, byte BrokerID[]) {
		super();
		if ((ExchangeID.length != this.ExchangeID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ExchangeID = ExchangeID;
		if ((TraderID.length != this.TraderID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.TraderID = TraderID;
		if ((ParticipantID.length != this.ParticipantID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ParticipantID = ParticipantID;
		if ((Password.length != this.Password.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.Password = Password;
		this.InstallCount = InstallCount;
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
	}
	public static class ByReference extends CThostFtdcTraderField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcTraderField implements Structure.ByValue {
		
	};
}
