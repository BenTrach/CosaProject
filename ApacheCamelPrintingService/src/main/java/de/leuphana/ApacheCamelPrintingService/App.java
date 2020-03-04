package de.leuphana.ApacheCamelPrintingService;

import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import de.leuphana.converter.ManageableConverter;
import de.leuphana.converter.PrintableConverter;
import de.leuphana.converter.StringConverter;
import de.leuphana.model.documentsystem.behaviour.DocumentSystem;
import de.leuphana.model.documentsystem.structure.Document;
import de.leuphana.model.messagingsystem.behaviour.MessagingSystem;
import de.leuphana.model.printingsystem.behaviour.Printable;
import de.leuphana.model.printingsystem.behaviour.PrintingSystem;
import de.leuphana.model.statisticssystem.behaviour.StatisticsSystem;
import de.leuphana.routes.PrintingRouteBuilder;

public class App 
{

	static ApplicationContext appContext;
	static CamelContext camelContext;
	static ProducerTemplate producerTemplate;
	static ConsumerTemplate consumerTemplate;
    public static void main( String[] args )
    {
    		
    
    		appContext = new ClassPathXmlApplicationContext("SpringRouteContext.xml");
    		
    		
    		
    		try {
    			camelContext = new SpringCamelContext(appContext);
    			camelContext.getTypeConverterRegistry().addTypeConverter(StringConverter.class, String.class, new StringConverter());
    			camelContext.getTypeConverterRegistry().addTypeConverter(ManageableConverter.class, Document.class, new ManageableConverter());
    			camelContext.getTypeConverterRegistry().addTypeConverter(PrintableConverter.class, Printable.class, new PrintableConverter());
       		camelContext.addRoutes(new PrintingRouteBuilder());
       			camelContext.start();
       			
    			producerTemplate = camelContext.createProducerTemplate();
    			producerTemplate.sendBody("direct:start" , "Dokument");
    			consumerTemplate = camelContext.createConsumerTemplate();
    			Thread.sleep(10000);
       			camelContext.stop();
    			
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    		
    	}
    }

