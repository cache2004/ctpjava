package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 交易所保证金率<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:1028</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcExchangeMarginRateField extends Structure {
	/**
	 * 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public byte[] BrokerID = new byte[11];
	/**
	 * 合约代码<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	public byte[] InstrumentID = new byte[31];
	/**
	 * 投机套保标志<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	public byte HedgeFlag;
	/**
	 * 多头保证金率<br>
	 * C type : TThostFtdcRatioType
	 */
	public double LongMarginRatioByMoney;
	/**
	 * 多头保证金费<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double LongMarginRatioByVolume;
	/**
	 * 空头保证金率<br>
	 * C type : TThostFtdcRatioType
	 */
	public double ShortMarginRatioByMoney;
	/**
	 * 空头保证金费<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double ShortMarginRatioByVolume;
	public CThostFtdcExchangeMarginRateField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "InstrumentID", "HedgeFlag", "LongMarginRatioByMoney", "LongMarginRatioByVolume", "ShortMarginRatioByMoney", "ShortMarginRatioByVolume");
	}
	/**
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param InstrumentID 合约代码<br>
	 * C type : TThostFtdcInstrumentIDType<br>
	 * @param HedgeFlag 投机套保标志<br>
	 * C type : TThostFtdcHedgeFlagType<br>
	 * @param LongMarginRatioByMoney 多头保证金率<br>
	 * C type : TThostFtdcRatioType<br>
	 * @param LongMarginRatioByVolume 多头保证金费<br>
	 * C type : TThostFtdcMoneyType<br>
	 * @param ShortMarginRatioByMoney 空头保证金率<br>
	 * C type : TThostFtdcRatioType<br>
	 * @param ShortMarginRatioByVolume 空头保证金费<br>
	 * C type : TThostFtdcMoneyType
	 */
	public CThostFtdcExchangeMarginRateField(byte BrokerID[], byte InstrumentID[], byte HedgeFlag, double LongMarginRatioByMoney, double LongMarginRatioByVolume, double ShortMarginRatioByMoney, double ShortMarginRatioByVolume) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((InstrumentID.length != this.InstrumentID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.InstrumentID = InstrumentID;
		this.HedgeFlag = HedgeFlag;
		this.LongMarginRatioByMoney = LongMarginRatioByMoney;
		this.LongMarginRatioByVolume = LongMarginRatioByVolume;
		this.ShortMarginRatioByMoney = ShortMarginRatioByMoney;
		this.ShortMarginRatioByVolume = ShortMarginRatioByVolume;
	}
	public static class ByReference extends CThostFtdcExchangeMarginRateField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcExchangeMarginRateField implements Structure.ByValue {
		
	};
}
