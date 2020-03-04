package de.leuphana.routes;

import org.apache.camel.builder.RouteBuilder;

import de.leuphana.converter.ManageableConverter;
import de.leuphana.converter.PrintableConverter;
import de.leuphana.converter.StringConverter;
import de.leuphana.model.statisticssystem.behaviour.Countable;

public class PrintingRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("direct:start").streamCaching().log("Converting String named: ' ${body} ' to Manageable")
				.convertBodyTo(StringConverter.class).log("Manageable Created").bean("docSys", "createDocument")
				.log("Document Created").log("Pulling Document...").bean("docSys", "getDocument(${body.name})")
				.log("Convert Document to Printable").convertBodyTo(ManageableConverter.class).log("Printable Created")
				.log("Printing Printable...").bean("printSys", "print")
				.log("Printed. Invoking Messaging and Statistics System...")
				.wireTap("direct:tomessage").to("direct:tostatistic").to("seda:end");
		from("direct:tostatistic").log("Convert to Countable").convertBodyTo(PrintableConverter.class)
				.bean("statSys", "addEntry").log("Statistic Entry Added");
		from("direct:tomessage").log("Converting to Message").convertBodyTo(PrintableConverter.class)
		.bean("messSys","sendMessage(${body},${body.messageType})").log("Message Sent").to("seda:end");
	}

}
