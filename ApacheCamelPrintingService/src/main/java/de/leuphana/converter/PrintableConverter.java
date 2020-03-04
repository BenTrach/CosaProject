package de.leuphana.converter;

import org.apache.camel.Converter;
import org.apache.camel.Exchange;
import org.apache.camel.NoTypeConversionAvailableException;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverter;

import de.leuphana.model.messagingsystem.behaviour.Sendable;
import de.leuphana.model.messagingsystem.structure.message.MessageType;
import de.leuphana.model.printingsystem.behaviour.Printable;
import de.leuphana.model.printingsystem.structure.PrintJob;
import de.leuphana.model.statisticssystem.behaviour.Countable;


@Converter
public class PrintableConverter implements Countable,TypeConverter, Sendable {
	
	Float pricePerPage;
	Integer numberOfPages;
	String content;
	MessageType messageType;
public Countable toCountable(Printable printable) {
	this.numberOfPages = 4;
	this.pricePerPage = 7f;
	this.content = printable.getContent();
	
	return this;
	
}
	public Float getPricePerPage() {
		// TODO Auto-generated method stub
		return pricePerPage;
	}

public Integer getNumberOfPages() {
	// TODO Auto-generated method stub
	return numberOfPages;
}

public String getContent() {
	// TODO Auto-generated method stub
	return content;
}
public boolean allowNull() {
	// TODO Auto-generated method stub
	return false;
}
public <T> T convertTo(Class<T> type, Object value) throws TypeConversionException {
	// TODO Auto-generated method stub
	return null;
}
public <T> T convertTo(Class<T> type, Exchange exchange, Object value) throws TypeConversionException {
	// TODO Auto-generated method stub
	
	this.numberOfPages = 4;
	this.pricePerPage = 7f;
	this.content = ((Printable)value).getContent();
	this.messageType = MessageType.EMAIL;
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
@Override
public MessageType getMessageType() {
	// TODO Auto-generated method stub
	return messageType;
}


}
