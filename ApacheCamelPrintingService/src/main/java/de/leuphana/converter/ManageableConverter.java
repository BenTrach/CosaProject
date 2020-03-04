package de.leuphana.converter;

import org.apache.camel.Converter;
import org.apache.camel.Exchange;
import org.apache.camel.NoTypeConversionAvailableException;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverter;

import de.leuphana.model.documentsystem.structure.Document;
import de.leuphana.model.printingsystem.behaviour.Printable;
import de.leuphana.model.printingsystem.structure.PrintJob;


public class ManageableConverter implements TypeConverter, Printable {

	String content;

	public boolean allowNull() {
		// TODO Auto-generated method stub
		return false;
	}
public ManageableConverter() {
	this.content = "";
}
	public <T> T convertTo(Class<T> type, Object value) throws TypeConversionException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T convertTo(Class<T> type, Exchange exchange, Object value) throws TypeConversionException {
		// TODO Auto-generated method stub
		this.content = ((Document)value).getDocumentBody().getContent();
		return (T) this;
	}

	public <T> T mandatoryConvertTo(Class<T> type, Object value)
			throws TypeConversionException, NoTypeConversionAvailableException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T mandatoryConvertTo(Class<T> type, Exchange exchange, Object value)
			throws TypeConversionException, NoTypeConversionAvailableException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T tryConvertTo(Class<T> type, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T tryConvertTo(Class<T> type, Exchange exchange, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getContent() {
		// TODO Auto-generated method stub
		return content;
	}
}
