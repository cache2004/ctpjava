package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 查询交易所调整保证金率<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:2492</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcQryExchangeMarginRateAdjustField extends Structure {
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
	public CThostFtdcQryExchangeMarginRateAdjustField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "InstrumentID", "HedgeFlag");
	}
	/**
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param InstrumentID 合约代码<br>
	 * C type : TThostFtdcInstrumentIDType<br>
	 * @param HedgeFlag 投机套保标志<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	public CThostFtdcQryExchangeMarginRateAdjustField(byte BrokerID[], byte InstrumentID[], byte HedgeFlag) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((InstrumentID.length != this.InstrumentID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.InstrumentID = InstrumentID;
		this.HedgeFlag = HedgeFlag;
	}
	public static class ByReference extends CThostFtdcQryExchangeMarginRateAdjustField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcQryExchangeMarginRateAdjustField implements Structure.ByValue {
		
	};
}
