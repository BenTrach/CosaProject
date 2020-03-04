package de.leuphana.model.printingsystem.structure;

import java.util.HashMap;
import java.util.Map;

public class PrintJobDispatcher {
	private static PrintJobDispatcher printJobDispatcher;
	private Map<Integer, PrintQueue> printQueues;
	
	private PrintJobDispatcher() {
		// Was? Interface = Wie? / Realisierung
		printQueues = new HashMap<Integer, PrintQueue>();
		
		printQueues.put(1, new PrintQueue());
		printQueues.put(2, new PrintQueue());
	}
	
	// Singleton-Pattern
	public static PrintJobDispatcher create() {
		if(printJobDispatcher == null) {
			printJobDispatcher = new PrintJobDispatcher();
		}
		
		return printJobDispatcher;
	}
	
	
	public void dispatchPrintJob(PrintJob printJob) {
		// TODO Bestimme die PrintQueue, die die wenigsten PrintJobs enth�lt
		PrintQueue printQueue = printQueues.get(1);
		printQueue.addPrintJob(printJob);
	}

}
