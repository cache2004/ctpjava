package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 查询成交<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:2187</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcQryTradeField extends Structure {
	/**
	 * 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public byte[] BrokerID = new byte[11];
	/**
	 * 投资者代码<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	public byte[] InvestorID = new byte[13];
	/**
	 * 合约代码<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	public byte[] InstrumentID = new byte[31];
	/**
	 * 交易所代码<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	public byte[] ExchangeID = new byte[9];
	/**
	 * 成交编号<br>
	 * C type : TThostFtdcTradeIDType
	 */
	public byte[] TradeID = new byte[21];
	/**
	 * 开始时间<br>
	 * C type : TThostFtdcTimeType
	 */
	public byte[] TradeTimeStart = new byte[9];
	/**
	 * 结束时间<br>
	 * C type : TThostFtdcTimeType
	 */
	public byte[] TradeTimeEnd = new byte[9];
	public CThostFtdcQryTradeField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "InvestorID", "InstrumentID", "ExchangeID", "TradeID", "TradeTimeStart", "TradeTimeEnd");
	}
	/**
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param InvestorID 投资者代码<br>
	 * C type : TThostFtdcInvestorIDType<br>
	 * @param InstrumentID 合约代码<br>
	 * C type : TThostFtdcInstrumentIDType<br>
	 * @param ExchangeID 交易所代码<br>
	 * C type : TThostFtdcExchangeIDType<br>
	 * @param TradeID 成交编号<br>
	 * C type : TThostFtdcTradeIDType<br>
	 * @param TradeTimeStart 开始时间<br>
	 * C type : TThostFtdcTimeType<br>
	 * @param TradeTimeEnd 结束时间<br>
	 * C type : TThostFtdcTimeType
	 */
	public CThostFtdcQryTradeField(byte BrokerID[], byte InvestorID[], byte InstrumentID[], byte ExchangeID[], byte TradeID[], byte TradeTimeStart[], byte TradeTimeEnd[]) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((InvestorID.length != this.InvestorID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.InvestorID = InvestorID;
		if ((InstrumentID.length != this.InstrumentID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.InstrumentID = InstrumentID;
		if ((ExchangeID.length != this.ExchangeID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ExchangeID = ExchangeID;
		if ((TradeID.length != this.TradeID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.TradeID = TradeID;
		if ((TradeTimeStart.length != this.TradeTimeStart.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.TradeTimeStart = TradeTimeStart;
		if ((TradeTimeEnd.length != this.TradeTimeEnd.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.TradeTimeEnd = TradeTimeEnd;
	}
	public static class ByReference extends CThostFtdcQryTradeField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcQryTradeField implements Structure.ByValue {
		
	};
}
