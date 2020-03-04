package de.leuphana.model.printingsystem.behaviour.printjobstatus;

import de.leuphana.model.printingsystem.behaviour.PrintAction;

// Wie?
// implements immer, wenn ein Interface in einer konkreten Klasse realisiert wird;
// eine konkrete Klasse kann mehrere Intefaces realisieren
// extends immer, wenn eine Klasse von einer anderen Klasse erbt oder ein Interface von einem anderen Inteface
public class PrintJobPulled extends PrintJobStatus {

	// Signatur + Methodenk�rper
	@Override
	public PrintJobStatus changePrintJobStatus(PrintAction printAction) {
		PrintJobStatus printJobStatus = null;

		switch (printAction) {
		case STOP_PRINT_JOB:
			// Was?; Interface = Wie ?; konkrete Klasse
			printJobStatus = new PrintJobStopped();
			break;
		case PRINT_PRINT_JOB:
			// Was?; Interface = Wie ?; konkrete Klasse
			printJobStatus = new PrintJobPrinted();
			break;
		default:
			printJobStatus = this;
		}

		return printJobStatus;
	}

	@Override
	public String getPrintJobStatusName() {
		return PrintJobPulled.class.getSimpleName();
	}

}
