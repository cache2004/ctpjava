package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 行情基础属性<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:3705</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcMarketDataBaseField extends Structure {
	/**
	 * 交易日<br>
	 * C type : TThostFtdcDateType
	 */
	public byte[] TradingDay = new byte[9];
	/**
	 * 上次结算价<br>
	 * C type : TThostFtdcPriceType
	 */
	public double PreSettlementPrice;
	/**
	 * 昨收盘<br>
	 * C type : TThostFtdcPriceType
	 */
	public double PreClosePrice;
	/**
	 * 昨持仓量<br>
	 * C type : TThostFtdcLargeVolumeType
	 */
	public double PreOpenInterest;
	/**
	 * 昨虚实度<br>
	 * C type : TThostFtdcRatioType
	 */
	public double PreDelta;
	public CThostFtdcMarketDataBaseField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("TradingDay", "PreSettlementPrice", "PreClosePrice", "PreOpenInterest", "PreDelta");
	}
	/**
	 * @param TradingDay 交易日<br>
	 * C type : TThostFtdcDateType<br>
	 * @param PreSettlementPrice 上次结算价<br>
	 * C type : TThostFtdcPriceType<br>
	 * @param PreClosePrice 昨收盘<br>
	 * C type : TThostFtdcPriceType<br>
	 * @param PreOpenInterest 昨持仓量<br>
	 * C type : TThostFtdcLargeVolumeType<br>
	 * @param PreDelta 昨虚实度<br>
	 * C type : TThostFtdcRatioType
	 */
	public CThostFtdcMarketDataBaseField(byte TradingDay[], double PreSettlementPrice, double PreClosePrice, double PreOpenInterest, double PreDelta) {
		super();
		if ((TradingDay.length != this.TradingDay.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.TradingDay = TradingDay;
		this.PreSettlementPrice = PreSettlementPrice;
		this.PreClosePrice = PreClosePrice;
		this.PreOpenInterest = PreOpenInterest;
		this.PreDelta = PreDelta;
	}
	public static class ByReference extends CThostFtdcMarketDataBaseField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcMarketDataBaseField implements Structure.ByValue {
		
	};
}
