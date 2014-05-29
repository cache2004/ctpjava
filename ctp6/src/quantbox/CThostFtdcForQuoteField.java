package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * ѯ��<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:3164</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcForQuoteField extends Structure {
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
	 * ��Լ����<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	public byte[] InstrumentID = new byte[31];
	/**
	 * ѯ������<br>
	 * C type : TThostFtdcOrderRefType
	 */
	public byte[] ForQuoteRef = new byte[13];
	/**
	 * �û�����<br>
	 * C type : TThostFtdcUserIDType
	 */
	public byte[] UserID = new byte[16];
	/**
	 * ����ѯ�۱��<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	public byte[] ForQuoteLocalID = new byte[13];
	/**
	 * ����������<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	public byte[] ExchangeID = new byte[9];
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
	 * ��Լ�ڽ������Ĵ���<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	public byte[] ExchangeInstID = new byte[31];
	/**
	 * ����������Ա����<br>
	 * C type : TThostFtdcTraderIDType
	 */
	public byte[] TraderID = new byte[21];
	/**
	 * ��װ���<br>
	 * C type : TThostFtdcInstallIDType
	 */
	public int InstallID;
	/**
	 * ��������<br>
	 * C type : TThostFtdcDateType
	 */
	public byte[] InsertDate = new byte[9];
	/**
	 * ����ʱ��<br>
	 * C type : TThostFtdcTimeType
	 */
	public byte[] InsertTime = new byte[9];
	/**
	 * ѯ��״̬<br>
	 * C type : TThostFtdcForQuoteStatusType
	 */
	public byte ForQuoteStatus;
	/**
	 * ǰ�ñ��<br>
	 * C type : TThostFtdcFrontIDType
	 */
	public int FrontID;
	/**
	 * �Ự���<br>
	 * C type : TThostFtdcSessionIDType
	 */
	public int SessionID;
	/**
	 * ״̬��Ϣ<br>
	 * C type : TThostFtdcErrorMsgType
	 */
	public byte[] StatusMsg = new byte[81];
	/**
	 * �����û�����<br>
	 * C type : TThostFtdcUserIDType
	 */
	public byte[] ActiveUserID = new byte[16];
	/**
	 * ���͹�˾ѯ�۱��<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	public int BrokerForQutoSeq;
	public CThostFtdcForQuoteField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "InvestorID", "InstrumentID", "ForQuoteRef", "UserID", "ForQuoteLocalID", "ExchangeID", "ParticipantID", "ClientID", "ExchangeInstID", "TraderID", "InstallID", "InsertDate", "InsertTime", "ForQuoteStatus", "FrontID", "SessionID", "StatusMsg", "ActiveUserID", "BrokerForQutoSeq");
	}
	public static class ByReference extends CThostFtdcForQuoteField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcForQuoteField implements Structure.ByValue {
		
	};
}