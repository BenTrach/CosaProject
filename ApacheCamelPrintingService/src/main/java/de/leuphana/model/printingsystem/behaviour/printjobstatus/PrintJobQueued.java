package de.leuphana.model.printingsystem.behaviour.printjobstatus;

import de.leuphana.model.printingsystem.behaviour.PrintAction;

public class PrintJobQueued extends PrintJobStatus {
	
	@Override
	public PrintJobStatus changePrintJobStatus(PrintAction printAction) {
		PrintJobStatus printJobStatus = null;

		switch (printAction) {
		case STOP_PRINT_JOB:
			// Was?; Interface = Wie ?; konkrete Klasse
			printJobStatus = new PrintJobStopped();
			break;
		case PULL_PRINT_JOB:
			// Was?; Interface = Wie ?; konkrete Klasse
			printJobStatus = new PrintJobPulled();
			break;
		default:
			printJobStatus = this;
		}

		return printJobStatus;
	}
	
	@Override
	public String getPrintJobStatusName() {
		return PrintJobQueued.class.getSimpleName();
	}

}
