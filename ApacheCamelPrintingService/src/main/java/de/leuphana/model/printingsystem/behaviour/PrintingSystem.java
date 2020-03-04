package de.leuphana.model.printingsystem.behaviour;

import java.util.ArrayList;
import java.util.List;

import de.leuphana.model.printingsystem.behaviour.event.PrintEvent;
import de.leuphana.model.printingsystem.behaviour.event.PrintingSystemListener;
import de.leuphana.model.printingsystem.structure.PrintJob;
import de.leuphana.model.printingsystem.structure.PrintJobDispatcher;
import de.leuphana.model.printingsystem.structure.PrintResult;

// behaviour class for PrintingSystem

public class PrintingSystem implements PrintEventService, PrintCommandService {
	private PrintJobDispatcher printJobDispatcher;
	private List<PrintingSystemListener> listeners;

	public PrintingSystem() {
		printJobDispatcher = PrintJobDispatcher.create();
		listeners = new ArrayList<PrintingSystemListener>();
	}

	public void print (Printable printable) {

		PrintJob printJob = new PrintJob(printable.getContent());

		printJobDispatcher.dispatchPrintJob(printJob);

		// TODO PrintJob aus printQueue
		// TODO PrintJob drucken

		// TODO sp�ter flexible gestalten
		for (PrintingSystemListener printingSystemListener : listeners) {
			PrintEvent printEvent = new PrintEvent(new PrintResult(12, 10.3f, printable.getContent()));
			printingSystemListener.onPrintablePrinted(printEvent);
		}

	}

	public synchronized void addPrintingSystemListener(PrintingSystemListener listener) {
		this.listeners.add(listener);

	}

	public synchronized void removePrintingSystemListener(PrintingSystemListener listener) {
		this.listeners.remove(listener);

	}
}
