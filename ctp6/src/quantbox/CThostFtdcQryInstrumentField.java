package quantbox;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * ��ѯ��Լ<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:2412</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CThostFtdcQryInstrumentField extends Structure {
	/**
	 * ��Լ����<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	public byte[] InstrumentID = new byte[31];
	/**
	 * ����������<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	public byte[] ExchangeID = new byte[9];
	/**
	 * ��Լ�ڽ������Ĵ���<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	public byte[] ExchangeInstID = new byte[31];
	/**
	 * ��Ʒ����<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	public byte[] ProductID = new byte[31];
	public CThostFtdcQryInstrumentField() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("InstrumentID", "ExchangeID", "ExchangeInstID", "ProductID");
	}
	/**
	 * @param InstrumentID ��Լ����<br>
	 * C type : TThostFtdcInstrumentIDType<br>
	 * @param ExchangeID ����������<br>
	 * C type : TThostFtdcExchangeIDType<br>
	 * @param ExchangeInstID ��Լ�ڽ������Ĵ���<br>
	 * C type : TThostFtdcExchangeInstIDType<br>
	 * @param ProductID ��Ʒ����<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	public CThostFtdcQryInstrumentField(byte InstrumentID[], byte ExchangeID[], byte ExchangeInstID[], byte ProductID[]) {
		super();
		if ((InstrumentID.length != this.InstrumentID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.InstrumentID = InstrumentID;
		if ((ExchangeID.length != this.ExchangeID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ExchangeID = ExchangeID;
		if ((ExchangeInstID.length != this.ExchangeInstID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ExchangeInstID = ExchangeInstID;
		if ((ProductID.length != this.ProductID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ProductID = ProductID;
	}
	public static class ByReference extends CThostFtdcQryInstrumentField implements Structure.ByReference {
		
	};
	public static class ByValue extends CThostFtdcQryInstrumentField implements Structure.ByValue {
		
	};
}