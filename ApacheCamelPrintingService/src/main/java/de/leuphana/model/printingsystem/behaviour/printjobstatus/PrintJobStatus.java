package de.leuphana.model.printingsystem.behaviour.printjobstatus;

import de.leuphana.model.printingsystem.behaviour.PrintAction;

// Was?
public abstract class PrintJobStatus {
	
	public PrintJobStatus() {
		System.out.println(this.getPrintJobStatusName());
	}
	
	// Signatur
	public abstract PrintJobStatus changePrintJobStatus(PrintAction printAction);
	public abstract String getPrintJobStatusName();
}
