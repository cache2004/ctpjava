package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * �ֵ��۵���Ϣ<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:5139</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcEWarrantOffsetField extends Structure {
	/**
	 * ��������<br>
	 * C type : TThostFtdcTradeDateType
	 */
	public byte[] TradingDay = new byte[9];
	/**
	 * ���͹�˾����<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public byte[] BrokerID = new byte[11];
	/**
	 * Ͷ���ߴ���<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	public byte[] InvestorID = new byte[13];
	/**
	 * ����������<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	public byte[] ExchangeID = new byte[9];
	/**
	 * ��Լ����<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	public byte[] InstrumentID = new byte[31];
	/**
	 * ��������<br>
	 * C type : TThostFtdcDirectionType
	 */
	public byte Direction;
	/**
	 * Ͷ���ױ���־<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	public byte HedgeFlag;
	/**
	 * ����<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int Volume;
	public CThostFtdcEWarrantOffsetField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("TradingDay", "BrokerID", "InvestorID", "ExchangeID", "InstrumentID", "Direction", "HedgeFlag", "Volume");
	}
	/**
	 * @param TradingDay ��������<br>
	 * C type : TThostFtdcTradeDateType<br>
	 * @param BrokerID ���͹�˾����<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param InvestorID Ͷ���ߴ���<br>
	 * C type : TThostFtdcInvestorIDType<br>
	 * @param ExchangeID ����������<br>
	 * C type : TThostFtdcExchangeIDType<br>
	 * @param InstrumentID ��Լ����<br>
	 * C type : TThostFtdcInstrumentIDType<br>
	 * @param Direction ��������<br>
	 * C type : TThostFtdcDirectionType<br>
	 * @param HedgeFlag Ͷ���ױ���־<br>
	 * C type : TThostFtdcHedgeFlagType<br>
	 * @param Volume ����<br>
	 * C type : TThostFtdcVolumeType
	 */
	public CThostFtdcEWarrantOffsetField(byte TradingDay[], byte BrokerID[], byte InvestorID[], byte ExchangeID[], byte InstrumentID[], byte Direction, byte HedgeFlag, int Volume) {
		super();
		if ((TradingDay.length != this.TradingDay.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.TradingDay = TradingDay;
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((InvestorID.length != this.InvestorID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.InvestorID = InvestorID;
		if ((ExchangeID.length != this.ExchangeID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ExchangeID = ExchangeID;
		if ((InstrumentID.length != this.InstrumentID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.InstrumentID = InstrumentID;
		this.Direction = Direction;
		this.HedgeFlag = HedgeFlag;
		this.Volume = Volume;
	}
	public static class ByReference extends CThostFtdcEWarrantOffsetField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcEWarrantOffsetField implements Structure.ByValue {
		
	};
}