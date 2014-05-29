package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 交易所状态<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:4883</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcExchangeSequenceField extends Structure {
	/**
	 * 交易所代码<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	public byte[] ExchangeID = new byte[9];
	/**
	 * 序号<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	public int SequenceNo;
	/**
	 * 合约交易状态<br>
	 * C type : TThostFtdcInstrumentStatusType
	 */
	public byte MarketStatus;
	public CThostFtdcExchangeSequenceField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("ExchangeID", "SequenceNo", "MarketStatus");
	}
	/**
	 * @param ExchangeID 交易所代码<br>
	 * C type : TThostFtdcExchangeIDType<br>
	 * @param SequenceNo 序号<br>
	 * C type : TThostFtdcSequenceNoType<br>
	 * @param MarketStatus 合约交易状态<br>
	 * C type : TThostFtdcInstrumentStatusType
	 */
	public CThostFtdcExchangeSequenceField(byte ExchangeID[], int SequenceNo, byte MarketStatus) {
		super();
		if ((ExchangeID.length != this.ExchangeID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ExchangeID = ExchangeID;
		this.SequenceNo = SequenceNo;
		this.MarketStatus = MarketStatus;
	}
	public static class ByReference extends CThostFtdcExchangeSequenceField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcExchangeSequenceField implements Structure.ByValue {
		
	};
}
