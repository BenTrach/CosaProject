package de.leuphana.model.printingsystem.structure;

import de.leuphana.model.printingsystem.behaviour.PrintAction;

public class Printer {
	private PrintQueue printQueue;

	public Printer(PrintQueue printQueue) {
		this.printQueue = printQueue;
	}

	private void setActive() {
		// TODO sp�ter eigener Prozess
		// pull-Prinzip
		for (;;) {
			PrintJob printJob = printQueue.pullPrintJob();
			
			System.out.println("Document content: " + printJob.getContent());

			printJob.changePrintJobStatus(PrintAction.PRINT_PRINT_JOB);
		}
	}

}
