package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 正在同步中的投资者分组<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:1898</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcSyncingInvestorGroupField extends Structure {
	/**
	 * 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public byte[] BrokerID = new byte[11];
	/**
	 * 投资者分组代码<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	public byte[] InvestorGroupID = new byte[13];
	/**
	 * 投资者分组名称<br>
	 * C type : TThostFtdcInvestorGroupNameType
	 */
	public byte[] InvestorGroupName = new byte[41];
	public CThostFtdcSyncingInvestorGroupField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "InvestorGroupID", "InvestorGroupName");
	}
	/**
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param InvestorGroupID 投资者分组代码<br>
	 * C type : TThostFtdcInvestorIDType<br>
	 * @param InvestorGroupName 投资者分组名称<br>
	 * C type : TThostFtdcInvestorGroupNameType
	 */
	public CThostFtdcSyncingInvestorGroupField(byte BrokerID[], byte InvestorGroupID[], byte InvestorGroupName[]) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((InvestorGroupID.length != this.InvestorGroupID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.InvestorGroupID = InvestorGroupID;
		if ((InvestorGroupName.length != this.InvestorGroupName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.InvestorGroupName = InvestorGroupName;
	}
	public static class ByReference extends CThostFtdcSyncingInvestorGroupField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcSyncingInvestorGroupField implements Structure.ByValue {
		
	};
}
