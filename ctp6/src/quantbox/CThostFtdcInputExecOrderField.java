package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * �����ִ������<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:2683</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcInputExecOrderField extends Structure {
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
	 * ִ����������<br>
	 * C type : TThostFtdcOrderRefType
	 */
	public byte[] ExecOrderRef = new byte[13];
	/**
	 * �û�����<br>
	 * C type : TThostFtdcUserIDType
	 */
	public byte[] UserID = new byte[16];
	/**
	 * ����<br>
	 * C type : TThostFtdcVolumeType
	 */
	public int Volume;
	/**
	 * ������<br>
	 * C type : TThostFtdcRequestIDType
	 */
	public int RequestID;
	/**
	 * ҵ��Ԫ<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	public byte[] BusinessUnit = new byte[21];
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
	 * ִ������<br>
	 * C type : TThostFtdcActionTypeType
	 */
	public byte ActionType;
	/**
	 * ����ͷ������ĳֲַ���<br>
	 * C type : TThostFtdcPosiDirectionType
	 */
	public byte PosiDirection;
	/**
	 * ��Ȩ��Ȩ���Ƿ����ڻ�ͷ��ı��<br>
	 * C type : TThostFtdcExecOrderPositionFlagType
	 */
	public byte ReservePositionFlag;
	/**
	 * ��Ȩ��Ȩ�����ɵ�ͷ���Ƿ��Զ�ƽ��<br>
	 * C type : TThostFtdcExecOrderCloseFlagType
	 */
	public byte CloseFlag;
	public CThostFtdcInputExecOrderField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "InvestorID", "InstrumentID", "ExecOrderRef", "UserID", "Volume", "RequestID", "BusinessUnit", "OffsetFlag", "HedgeFlag", "ActionType", "PosiDirection", "ReservePositionFlag", "CloseFlag");
	}
	public static class ByReference extends CThostFtdcInputExecOrderField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcInputExecOrderField implements Structure.ByValue {
		
	};
}