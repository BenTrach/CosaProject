package de.leuphana.model.printingsystem.structure;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import de.leuphana.model.printingsystem.behaviour.PrintAction;

public class PrintQueue {
	// Was? / Interface
	private Queue<PrintJob> queue;
	
	public PrintQueue() {
		// Was? / Interface = Wie? / konkrete Klasse
		queue = new LinkedBlockingQueue<PrintJob>();
	}

	public void addPrintJob(PrintJob printJob) {
		queue.add(printJob);
		printJob.changePrintJobStatus(PrintAction.ADD_PRINT_JOB);
	}

	public PrintJob pullPrintJob() {
		PrintJob printJob = queue.poll();
		printJob.changePrintJobStatus(PrintAction.PULL_PRINT_JOB);
		
		return printJob;
	}

}
