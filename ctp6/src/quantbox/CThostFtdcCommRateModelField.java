package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * 投资者手续费率模板<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:5099</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcCommRateModelField extends Structure {
	/**
	 * 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public byte[] BrokerID = new byte[11];
	/**
	 * 手续费率模板代码<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	public byte[] CommModelID = new byte[13];
	/**
	 * 模板名称<br>
	 * C type : TThostFtdcCommModelNameType
	 */
	public byte[] CommModelName = new byte[161];
	public CThostFtdcCommRateModelField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "CommModelID", "CommModelName");
	}
	/**
	 * @param BrokerID 经纪公司代码<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param CommModelID 手续费率模板代码<br>
	 * C type : TThostFtdcInvestorIDType<br>
	 * @param CommModelName 模板名称<br>
	 * C type : TThostFtdcCommModelNameType
	 */
	public CThostFtdcCommRateModelField(byte BrokerID[], byte CommModelID[], byte CommModelName[]) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((CommModelID.length != this.CommModelID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.CommModelID = CommModelID;
		if ((CommModelName.length != this.CommModelName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.CommModelName = CommModelName;
	}
	public static class ByReference extends CThostFtdcCommRateModelField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcCommRateModelField implements Structure.ByValue {
		
	};
}
