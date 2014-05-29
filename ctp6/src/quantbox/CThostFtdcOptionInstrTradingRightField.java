package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 投资者期权合约交易权限<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:3119</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcOptionInstrTradingRightField extends Structure {
	/**
	 * 合约代码<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	public byte[] InstrumentID = new byte[31];
	/**
	 * 投资者范围<br>
	 * C type : TThostFtdcInvestorRangeType
	 */
	public byte InvestorRange;
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
	 * 买卖方向<br>
	 * C type : TThostFtdcDirectionType
	 */
	public byte Direction;
	/**
	 * 交易权限<br>
	 * C type : TThostFtdcTradingRightType
	 */
	public byte TradingRight;
	public CThostFtdcOptionInstrTradingRightField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("InstrumentID", "InvestorRange", "BrokerID", "InvestorID", "Direction", "TradingRight");
	}
	/**
	 * @param InstrumentID 合约代码<br>
	 * C type : TThostFtdcInstrumentIDType<br>
	 * @param InvestorRange 投资者范围<br>
	 * C type : TThostFtdcInvestorRangeType<br>
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param InvestorID 投资者代码<br>
	 * C type : TThostFtdcInvestorIDType<br>
	 * @param Direction 买卖方向<br>
	 * C type : TThostFtdcDirectionType<br>
	 * @param TradingRight 交易权限<br>
	 * C type : TThostFtdcTradingRightType
	 */
	public CThostFtdcOptionInstrTradingRightField(byte InstrumentID[], byte InvestorRange, byte BrokerID[], byte InvestorID[], byte Direction, byte TradingRight) {
		super();
		if ((InstrumentID.length != this.InstrumentID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.InstrumentID = InstrumentID;
		this.InvestorRange = InvestorRange;
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((InvestorID.length != this.InvestorID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.InvestorID = InvestorID;
		this.Direction = Direction;
		this.TradingRight = TradingRight;
	}
	public static class ByReference extends CThostFtdcOptionInstrTradingRightField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcOptionInstrTradingRightField implements Structure.ByValue {
		
	};
}
