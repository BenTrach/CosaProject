package de.leuphana.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import de.leuphana.converter.PrintableConverter;
import de.leuphana.model.printingsystem.behaviour.Printable;
import de.leuphana.model.printingsystem.behaviour.PrintingSystem;
import de.leuphana.model.printingsystem.structure.PrintJob;

public class PrintingProcessor implements Processor {
	PrintingSystem printSys;

	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		printSys = new PrintingSystem();
		printSys.print(exchange.getIn().getBody(Printable.class));
	}
}
