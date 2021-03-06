package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 经济公司是否有在本标示的交易权限<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:7308</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcBrokerUserRightAssignField extends Structure {
	/**
	 * 应用单元代码<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public byte[] BrokerID = new byte[11];
	/**
	 * 交易中心代码<br>
	 * C type : TThostFtdcDRIdentityIDType
	 */
	public int DRIdentityID;
	/**
	 * 能否交易<br>
	 * C type : TThostFtdcBoolType
	 */
	public int Tradeable;
	public CThostFtdcBrokerUserRightAssignField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "DRIdentityID", "Tradeable");
	}
	/**
	 * @param BrokerID 应用单元代码<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param DRIdentityID 交易中心代码<br>
	 * C type : TThostFtdcDRIdentityIDType<br>
	 * @param Tradeable 能否交易<br>
	 * C type : TThostFtdcBoolType
	 */
	public CThostFtdcBrokerUserRightAssignField(byte BrokerID[], int DRIdentityID, int Tradeable) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		this.DRIdentityID = DRIdentityID;
		this.Tradeable = Tradeable;
	}
	public static class ByReference extends CThostFtdcBrokerUserRightAssignField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcBrokerUserRightAssignField implements Structure.ByValue {
		
	};
}
