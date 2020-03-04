package de.leuphana.converter;

import org.apache.camel.Exchange;
import org.apache.camel.NoTypeConversionAvailableException;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverter;

import de.leuphana.model.documentsystem.behaviour.Manageable;
import de.leuphana.model.documentsystem.structure.DocumentType;


//@Converter
public class StringConverter implements TypeConverter, Manageable {

	String content;
	 String name;
	DocumentType documentType;
public StringConverter() {
	this.documentType = DocumentType.ORDER;
	this.name = "";
	this.content = "content";
}
	public <T> T convertTo(Class<T> type, Exchange exchange, Object value) throws TypeConversionException {
		// TODO Auto-generated method stub
		
		try {
		this.documentType = DocumentType.ORDER;
		this.name = (String)value;
		this.content = "content";
		System.out.println("geht");
		System.out.println(value);
		}
		catch(Exception e ) {
			System.out.println("geht nicht");
		}
		
		return (T) this;

	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getContent() {
		// TODO Auto-generated method stub
		return content;
	}

	public DocumentType getDocumentType() {
		// TODO Auto-generated method stub
		return documentType;
	}

	public boolean allowNull() {
		// TODO Auto-generated method stub
		return false;
	}

	public <T> T convertTo(Class<T> type, Object value) throws TypeConversionException {
		// TODO Auto-generated method stub
		return null;
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


}
