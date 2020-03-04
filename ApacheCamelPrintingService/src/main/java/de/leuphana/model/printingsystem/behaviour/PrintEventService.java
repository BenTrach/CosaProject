package de.leuphana.model.printingsystem.behaviour;

import de.leuphana.model.printingsystem.behaviour.event.PrintingSystemListener;

public interface PrintEventService {

	void addPrintingSystemListener(PrintingSystemListener listener);
	void removePrintingSystemListener(PrintingSystemListener listener);
}
