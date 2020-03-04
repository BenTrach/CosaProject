package de.leuphana.model.printingsystem.structure;

import de.leuphana.model.printingsystem.behaviour.PrintAction;
import de.leuphana.model.printingsystem.behaviour.printjobstatus.PrintJobCreated;
import de.leuphana.model.printingsystem.behaviour.printjobstatus.PrintJobStatus;

public class PrintJob {
	private String content;
	private PrintJobStatus printJobStatus;

	public PrintJob(String content) {
		this.content = content;
		printJobStatus = new PrintJobCreated();
		this.changePrintJobStatus(PrintAction.CREATE_PRINT_JOB);
	}

	public String getContent() {
		return content;
	}

	public PrintJobStatus changePrintJobStatus(PrintAction printAction) {
		// Delegationsprinzip
		return printJobStatus.changePrintJobStatus(printAction);
	}

}
