package de.leuphana.model.printingsystem.behaviour.printjobstatus;

import de.leuphana.model.printingsystem.behaviour.PrintAction;

// Wie?
// implements immer, wenn ein Interface in einer konkreten Klasse realisiert wird;
// eine konkrete Klasse kann mehrere Intefaces realisieren
// extends immer, wenn eine Klasse von einer anderen Klasse erbt oder ein Interface von einem anderen Inteface
public class PrintJobPrinted extends PrintJobStatus {

	// Signatur + Methodenk�rper
	@Override
	public PrintJobStatus changePrintJobStatus(PrintAction printAction) {
		return this;
	}

	@Override
	public String getPrintJobStatusName() {
		return PrintJobPrinted.class.getSimpleName();
	}

}
