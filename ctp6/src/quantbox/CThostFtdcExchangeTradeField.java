package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * �������ɽ�<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:1636</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcExchangeTradeField extends Structure {
	/**
	 * ����������<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	public byte[] ExchangeID = new byte[9];
	/**
	 * �ɽ����<br>
	 * C type : TThostFtdcTradeIDType
	 */
	public byte[] TradeID = new byte[21];
	/**
	 * ��������<br>
	 * C type : TThostFtdcDirectionType
	 */
	public byte Direction;
	/**
	 * �������<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	public byte[] OrderSysID = new byte[21];
	/**
	 * ��Ա����<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	public byte[] ParticipantID = new byte[11];
	/**
	 * �ͻ�����<br>
	 * C type : TThostFtdcClientIDType
	 */
	public byte[] ClientID = new byte[11];
	/**
	 * ���׽�ɫ<br>
	 * C type : TThostFtdcTradingRoleType
	 */
	public byte TradingRole;
	/**
	 * ��Լ�ڽ������Ĵ���<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	public byte[] ExchangeInstID = new byte[31];
	/**
	 * ��ƽ��־<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	public byte OffsetFlag;
	/**
	 * Ͷ���ױ���־<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	public byte HedgeFlag;
	/**
	 * �۸�<br>
	 * C type : TThostFtdcPriceType
	 */
	public double Price;
	/**
	 * ����<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int Volume;
	/**
	 * �ɽ�ʱ��<br>
	 * C type : TThostFtdcDateType
	 */
	public byte[] TradeDate = new byte[9];
	/**
	 * �ɽ�ʱ��<br>
	 * C type : TThostFtdcTimeType
	 */
	public byte[] TradeTime = new byte[9];
	/**
	 * �ɽ�����<br>
	 * C type : TThostFtdcTradeTypeType
	 */
	public byte TradeType;
	/**
	 * �ɽ�����Դ<br>
	 * C type : TThostFtdcPriceSourceType
	 */
	public byte PriceSource;
	/**
	 * ����������Ա����<br>
	 * C type : TThostFtdcTraderIDType
	 */
	public byte[] TraderID = new byte[21];
	/**
	 * ���ر������<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	public byte[] OrderLocalID = new byte[13];
	/**
	 * �����Ա���<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	public byte[] ClearingPartID = new byte[11];
	/**
	 * ҵ��Ԫ<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	public byte[] BusinessUnit = new byte[21];
	/**
	 * ���<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	public int SequenceNo;
	/**
	 * �ɽ���Դ<br>
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