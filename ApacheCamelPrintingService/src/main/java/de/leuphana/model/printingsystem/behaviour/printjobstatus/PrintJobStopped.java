package de.leuphana.model.printingsystem.behaviour.printjobstatus;

import de.leuphana.model.printingsystem.behaviour.PrintAction;

public class PrintJobStopped extends PrintJobStatus {

	@Override
	public PrintJobStatus changePrintJobStatus(PrintAction printAction) {
		PrintJobStatus printJobStatus = null;

		switch (printAction) {
		case CANCEL_PRINT_JOB:
			// Was?; Interface = Wie ?; konkrete Klasse
			printJobStatus = new PrintJobCancelled();
			break;
		case RESUME_PRINT_JOB:
			// Was?; Interface = Wie ?; konkrete Klasse
			printJobStatus = new PrintJobQueued();
			break;

		default:
			printJobStatus = this;
		}

		return printJobStatus;
	}

	@Override
	public String getPrintJobStatusName() {
		return PrintJobStopped.class.getSimpleName();
	}

}
