package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * ��֤�ڻ��ʽ�����Ϳͻ���Ϣ<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:6505</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcDepositResultInformField extends Structure {
	/**
	 * �������ˮ�ţ�����ˮ��Ϊ���ڱ��̷��ص���ˮ��<br>
	 * C type : TThostFtdcDepositSeqNoType
	 */
	public byte[] DepositSeqNo = new byte[15];
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
	 * �����<br>
	 * C type : TThostFtdcMoneyType
	 */
	public double Deposit;
	/**
	 * ������<br>
	 * C type : TThostFtdcRequestIDType
	 */
	public int RequestID;
	/**
	 * ���ش���<br>
	 * C type : TThostFtdcReturnCodeType
	 */
	public byte[] ReturnCode = new byte[7];
	/**
	 * ����������<br>
	 * C type : TThostFtdcDescrInfoForReturnCodeType
	 */
	public byte[] DescrInfoForReturnCode = new byte[129];
	public CThostFtdcDepositResultInformField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("DepositSeqNo", "BrokerID", "InvestorID", "Deposit", "RequestID", "ReturnCode", "DescrInfoForReturnCode");
	}
	/**
	 * @param DepositSeqNo �������ˮ�ţ�����ˮ��Ϊ���ڱ��̷��ص���ˮ��<br>
	 * C type : TThostFtdcDepositSeqNoType<br>
	 * @param BrokerID ���͹�˾����<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param InvestorID Ͷ���ߴ���<br>
	 * C type : TThostFtdcInvestorIDType<br>
	 * @param Deposit �����<br>
	 * C type : TThostFtdcMoneyType<br>
	 * @param RequestID ������<br>
	 * C type : TThostFtdcRequestIDType<br>
	 * @param ReturnCode ���ش���<br>
	 * C type : TThostFtdcReturnCodeType<br>
	 * @param DescrInfoForReturnCode ����������<br>
	 * C type : TThostFtdcDescrInfoForReturnCodeType
	 */
	public CThostFtdcDepositResultInformField(byte DepositSeqNo[], byte BrokerID[], byte InvestorID[], double Deposit, int RequestID, byte ReturnCode[], byte DescrInfoForReturnCode[]) {
		super();
		if ((DepositSeqNo.length != this.DepositSeqNo.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.DepositSeqNo = DepositSeqNo;
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((InvestorID.length != this.InvestorID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.InvestorID = InvestorID;
		this.Deposit = Deposit;
		this.RequestID = RequestID;
		if ((ReturnCode.length != this.ReturnCode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ReturnCode = ReturnCode;
		if ((DescrInfoForReturnCode.length != this.DescrInfoForReturnCode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.DescrInfoForReturnCode = DescrInfoForReturnCode;
	}
	public static class ByReference extends CThostFtdcDepositResultInformField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcDepositResultInformField implements Structure.ByValue {
		
	};
}