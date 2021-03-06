package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 交易所成交<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:1636</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcExchangeTradeField extends Structure {
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
	 * 买卖方向<br>
	 * C type : TThostFtdcDirectionType
	 */
	public byte Direction;
	/**
	 * 报单编号<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	public byte[] OrderSysID = new byte[21];
	/**
	 * 会员代码<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	public byte[] ParticipantID = new byte[11];
	/**
	 * 客户代码<br>
	 * C type : TThostFtdcClientIDType
	 */
	public byte[] ClientID = new byte[11];
	/**
	 * 交易角色<br>
	 * C type : TThostFtdcTradingRoleType
	 */
	public byte TradingRole;
	/**
	 * 合约在交易所的代码<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	public byte[] ExchangeInstID = new byte[31];
	/**
	 * 开平标志<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	public byte OffsetFlag;
	/**
	 * 投机套保标志<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	public byte HedgeFlag;
	/**
	 * 价格<br>
	 * C type : TThostFtdcPriceType
	 */
	public double Price;
	/**
	 * 数量<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int Volume;
	/**
	 * 成交时期<br>
	 * C type : TThostFtdcDateType
	 */
	public byte[] TradeDate = new byte[9];
	/**
	 * 成交时间<br>
	 * C type : TThostFtdcTimeType
	 */
	public byte[] TradeTime = new byte[9];
	/**
	 * 成交类型<br>
	 * C type : TThostFtdcTradeTypeType
	 */
	public byte TradeType;
	/**
	 * 成交价来源<br>
	 * C type : TThostFtdcPriceSourceType
	 */
	public byte PriceSource;
	/**
	 * 交易所交易员代码<br>
	 * C type : TThostFtdcTraderIDType
	 */
	public byte[] TraderID = new byte[21];
	/**
	 * 本地报单编号<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	public byte[] OrderLocalID = new byte[13];
	/**
	 * 结算会员编号<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	public byte[] ClearingPartID = new byte[11];
	/**
	 * 业务单元<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	public byte[] BusinessUnit = new byte[21];
	/**
	 * 序号<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	public int SequenceNo;
	/**
	 * 成交来源<br>
	 * C type : TThostFtdcTradeSourceType
	 */
	public byte TradeSource;
	public CThostFtdcExchangeTradeField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("ExchangeID", "TradeID", "Direction", "OrderSysID", "ParticipantID", "ClientID", "TradingRole", "ExchangeInstID", "OffsetFlag", "HedgeFlag", "Price", "Volume", "TradeDate", "TradeTime", "TradeType", "PriceSource", "TraderID", "OrderLocalID", "ClearingPartID", "BusinessUnit", "SequenceNo", "TradeSource");
	}
	public static class ByReference extends CThostFtdcExchangeTradeField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcExchangeTradeField implements Structure.ByValue {
		
	};
}
