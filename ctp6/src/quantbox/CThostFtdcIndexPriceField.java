package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * ��ָ�ֻ�ָ��<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:2672</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcIndexPriceField extends Structure {
	/**
	 * ���͹�˾����<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	public byte[] BrokerID = new byte[11];
	/**
	 * ��Լ����<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	public byte[] InstrumentID = new byte[31];
	/**
	 * ָ���ֻ����̼�<br>
	 * C type : TThostFtdcPriceType
	 */
	public double ClosePrice;
	public CThostFtdcIndexPriceField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BrokerID", "InstrumentID", "ClosePrice");
	}
	/**
	 * @param BrokerID ���͹�˾����<br>
	 * C type : TThostFtdcBrokerIDType<br>
	 * @param InstrumentID ��Լ����<br>
	 * C type : TThostFtdcInstrumentIDType<br>
	 * @param ClosePrice ָ���ֻ����̼�<br>
	 * C type : TThostFtdcPriceType
	 */
	public CThostFtdcIndexPriceField(byte BrokerID[], byte InstrumentID[], double ClosePrice) {
		super();
		if ((BrokerID.length != this.BrokerID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.BrokerID = BrokerID;
		if ((InstrumentID.length != this.InstrumentID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.InstrumentID = InstrumentID;
		this.ClosePrice = ClosePrice;
	}
	public static class ByReference extends CThostFtdcIndexPriceField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcIndexPriceField implements Structure.ByValue {
		
	};
}