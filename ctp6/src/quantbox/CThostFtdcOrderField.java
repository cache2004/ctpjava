package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 报单<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:1263</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcOrderField extends Structure {
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
	 * 报单引用<br>
	 * C type : TThostFtdcOrderRefType
	 */
	public byte[] OrderRef = new byte[13];
	/**
	 * 用户代码<br>
	 * C type : TThostFtdcUserIDType
	 */
	public byte[] UserID = new byte[16];
	/**
	 * 报单价格条件<br>
	 * C type : TThostFtdcOrderPriceTypeType
	 */
	public byte OrderPriceType;
	/**
	 * 买卖方向<br>
	 * C type : TThostFtdcDirectionType
	 */
	public byte Direction;
	/**
	 * 组合开平标志<br>
	 * C type : TThostFtdcCombOffsetFlagType
	 */
	public byte[] CombOffsetFlag = new byte[5];
	/**
	 * 组合投机套保标志<br>
	 * C type : TThostFtdcCombHedgeFlagType
	 */
	public byte[] CombHedgeFlag = new byte[5];
	/**
	 * 价格<br>
	 * C type : TThostFtdcPriceType
	 */
	public double LimitPrice;
	/**
	 * 数量<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int VolumeTotalOriginal;
	/**
	 * 有效期类型<br>
	 * C type : TThostFtdcTimeConditionType
	 */
	public byte TimeCondition;
	/**
	 * GTD日期<br>
	 * C type : TThostFtdcDateType
	 */
	public byte[] GTDDate = new byte[9];
	/**
	 * 成交量类型<br>
	 * C type : TThostFtdcVolumeConditionType
	 */
	public byte VolumeCondition;
	/**
	 * 最小成交量<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int MinVolume;
	/**
	 * 触发条件<br>
	 * C type : TThostFtdcContingentConditionType
	 */
	public byte ContingentCondition;
	/**
	 * 止损价<br>
	 * C type : TThostFtdcPriceType
	 */
	public double StopPrice;
	/**
	 * 强平原因<br>
	 * C type : TThostFtdcForceCloseReasonType
	 */
	public byte ForceCloseReason;
	/**
	 * 自动挂起标志<br>
	 * C type : TThostFtdcBoolType
	 */
	public int IsAutoSuspend;
	/**
	 * 业务单元<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	public byte[] BusinessUnit = new byte[21];
	/**
	 * 请求编号<br>
	 * C type : TThostFtdcRequestIDType
	 */
	public int RequestID;
	/**
	 * 本地报单编号<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	public byte[] OrderLocalID = new byte[13];
	/**
	 * 交易所代码<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	public byte[] ExchangeID = new byte[9];
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
	 * 合约在交易所的代码<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	public byte[] ExchangeInstID = new byte[31];
	/**
	 * 交易所交易员代码<br>
	 * C type : TThostFtdcTraderIDType
	 */
	public byte[] TraderID = new byte[21];
	/**
	 * 安装编号<br>
	 * C type : TThostFtdcInstallIDType
	 */
	public int InstallID;
	/**
	 * 报单提交状态<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	public byte OrderSubmitStatus;
	/**
	 * 报单提示序号<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	public int NotifySequence;
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
	 * 报单编号<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	public byte[] OrderSysID = new byte[21];
	/**
	 * 报单来源<br>
	 * C type : TThostFtdcOrderSourceType
	 */
	public byte OrderSource;
	/**
	 * 报单状态<br>
	 * C type : TThostFtdcOrderStatusType
	 */
	public byte OrderStatus;
	/**
	 * 报单类型<br>
	 * C type : TThostFtdcOrderTypeType
	 */
	public byte OrderType;
	/**
	 * 今成交数量<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int VolumeTraded;
	/**
	 * 剩余数量<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int VolumeTotal;
	/**
	 * 报单日期<br>
	 * C type : TThostFtdcDateType
	 */
	public byte[] InsertDate = new byte[9];
	/**
	 * 委托时间<br>
	 * C type : TThostFtdcTimeType
	 */
	public byte[] InsertTime = new byte[9];
	/**
	 * 激活时间<br>
	 * C type : TThostFtdcTimeType
	 */
	public byte[] ActiveTime = new byte[9];
	/**
	 * 挂起时间<br>
	 * C type : TThostFtdcTimeType
	 */
	public byte[] SuspendTime = new byte[9];
	/**
	 * 最后修改时间<br>
	 * C type : TThostFtdcTimeType
	 */
	public byte[] UpdateTime = new byte[9];
	/**
	 * 撤销时间<br>
	 * C type : TThostFtdcTimeType
	 */
	public byte[] CancelTime = new byte[9];
	/**
	 * 最后修改交易所交易员代码<br>
	 * C type : TThostFtdcTraderIDType
	 */
	public byte[] ActiveTraderID = new byte[21];
	/**
	 * 结算会员编号<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	public byte[] ClearingPartID = new byte[11];
	/**
	 * 序号<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	public int SequenceNo;
	/**
	 * 前置编号<br>
	 * C type : TThostFtdcFrontIDType
	 */
	public int FrontID;
	/**
	 * 会话编号<br>
	 * C type : TThostFtdcSessionIDType
	 */
	public int SessionID;
	/**
	 * 用户端产品信息<br>
	 * C type : TThostFtdcProductInfoType
	 */
	public byte[] UserProductInfo = new byte[11];
	/**
	 * 状态信息<br>
	 * C type : TThostFtdcErrorMsgType
	 */
	public byte[] StatusMsg = new byte[81];
	/**
	 * 用户强评标志<br>
	 * C type : TThostFtdcBoolType
	 */
	public int UserForceClose;
	/**
	 * 操作用户代码<br>
	 * C type : TThostFtdcUserIDType
	 */
	public byte[] ActiveUserID = new byte[16];
	/**
	 * 经纪公司报单编号<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	public int BrokerOrderSeq;
	/**
	 * 相关报单<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	public byte[] RelativeOrderSysID = new byte[21];
	/**
	 * 郑商所成交数量<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int ZCETotalTradedVolume;
	/**
	 * 互换单标志<br>
	 * C type : TThostFtdcBoolType
	 */
	public int IsSwapOrder;
	public CThostFtdcOrderField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "InvestorID", "InstrumentID", "OrderRef", "UserID", "OrderPriceType", "Direction", "CombOffsetFlag", "CombHedgeFlag", "LimitPrice", "VolumeTotalOriginal", "TimeCondition", "GTDDate", "VolumeCondition", "MinVolume", "ContingentCondition", "StopPrice", "ForceCloseReason", "IsAutoSuspend", "BusinessUnit", "RequestID", "OrderLocalID", "ExchangeID", "ParticipantID", "ClientID", "ExchangeInstID", "TraderID", "InstallID", "OrderSubmitStatus", "NotifySequence", "TradingDay", "SettlementID", "OrderSysID", "OrderSource", "OrderStatus", "OrderType", "VolumeTraded", "VolumeTotal", "InsertDate", "InsertTime", "ActiveTime", "SuspendTime", "UpdateTime", "CancelTime", "ActiveTraderID", "ClearingPartID", "SequenceNo", "FrontID", "SessionID", "UserProductInfo", "StatusMsg", "UserForceClose", "ActiveUserID", "BrokerOrderSeq", "RelativeOrderSysID", "ZCETotalTradedVolume", "IsSwapOrder");
	}
	public static class ByReference extends CThostFtdcOrderField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcOrderField implements Structure.ByValue {
		
	};
}
