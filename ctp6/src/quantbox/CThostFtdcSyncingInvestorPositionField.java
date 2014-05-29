package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 正在同步中的投资者持仓<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:2010</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcSyncingInvestorPositionField extends Structure {
	/**
	 * 合约代码<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	public byte[] InstrumentID = new byte[31];
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
	 * 持仓多空方向<br>
	 * C type : TThostFtdcPosiDirectionType
	 */
	public byte PosiDirection;
	/**
	 * 投机套保标志<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	public byte HedgeFlag;
	/**
	 * 持仓日期<br>
	 * C type : TThostFtdcPositionDateType
	 */
	public byte PositionDate;
	/**
	 * 上日持仓<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int YdPosition;
	/**
	 * 今日持仓<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int Position;
	/**
	 * 多头冻结<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int LongFrozen;
	/**
	 * 空头冻结<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int ShortFrozen;
	/**
	 * 开仓冻结金额<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double LongFrozenAmount;
	/**
	 * 开仓冻结金额<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double ShortFrozenAmount;
	/**
	 * 开仓量<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int OpenVolume;
	/**
	 * 平仓量<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int CloseVolume;
	/**
	 * 开仓金额<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double OpenAmount;
	/**
	 * 平仓金额<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double CloseAmount;
	/**
	 * 持仓成本<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double PositionCost;
	/**
	 * 上次占用的保证金<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double PreMargin;
	/**
	 * 占用的保证金<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double UseMargin;
	/**
	 * 冻结的保证金<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double FrozenMargin;
	/**
	 * 冻结的资金<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double FrozenCash;
	/**
	 * 冻结的手续费<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double FrozenCommission;
	/**
	 * 资金差额<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double CashIn;
	/**
	 * 手续费<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double Commission;
	/**
	 * 平仓盈亏<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double CloseProfit;
	/**
	 * 持仓盈亏<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double PositionProfit;
	/**
	 * 上次结算价<br>
	 * C type : TThostFtdcPriceType
	 */
	public double PreSettlementPrice;
	/**
	 * 本次结算价<br>
	 * C type : TThostFtdcPriceType
	 */
	public double SettlementPrice;
	/**
	 * 交易日<br>
	 * C type : TThostFtdcDateType
	 */
	public byte[] TradingDay = new byte[9];
	/**
	 * 结算编号<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	public int SettlementID;
	/**
	 * 开仓成本<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double OpenCost;
	/**
	 * 交易所保证金<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double ExchangeMargin;
	/**
	 * 组合成交形成的持仓<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int CombPosition;
	/**
	 * 组合多头冻结<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int CombLongFrozen;
	/**
	 * 组合空头冻结<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int CombShortFrozen;
	/**
	 * 逐日盯市平仓盈亏<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double CloseProfitByDate;
	/**
	 * 逐笔对冲平仓盈亏<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double CloseProfitByTrade;
	/**
	 * 今日持仓<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int TodayPosition;
	/**
	 * 保证金率<br>
	 * C type : TThostFtdcRatioType
	 */
	public double MarginRateByMoney;
	/**
	 * 保证金率(按手数)<br>
	 * C type : TThostFtdcRatioType
	 */
	public double MarginRateByVolume;
	/**
	 * 执行冻结<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int StrikeFrozen;
	/**
	 * 执行冻结金额<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double StrikeFrozenAmount;
	/**
	 * 放弃执行冻结<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int AbandonFrozen;
	/**
	 * 期权市值<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double OptionValue;
	public CThostFtdcSyncingInvestorPositionField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("InstrumentID", "BrokerID", "InvestorID", "PosiDirection", "HedgeFlag", "PositionDate", "YdPosition", "Position", "LongFrozen", "ShortFrozen", "LongFrozenAmount", "ShortFrozenAmount", "OpenVolume", "CloseVolume", "OpenAmount", "CloseAmount", "PositionCost", "PreMargin", "UseMargin", "FrozenMargin", "FrozenCash", "FrozenCommission", "CashIn", "Commission", "CloseProfit", "PositionProfit", "PreSettlementPrice", "SettlementPrice", "TradingDay", "SettlementID", "OpenCost", "ExchangeMargin", "CombPosition", "CombLongFrozen", "CombShortFrozen", "CloseProfitByDate", "CloseProfitByTrade", "TodayPosition", "MarginRateByMoney", "MarginRateByVolume", "StrikeFrozen", "StrikeFrozenAmount", "AbandonFrozen", "OptionValue");
	}
	public static class ByReference extends CThostFtdcSyncingInvestorPositionField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcSyncingInvestorPositionField implements Structure.ByValue {
		
	};
}
