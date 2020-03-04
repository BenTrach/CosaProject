package de.leuphana.model.printingsystem.behaviour.event;

import java.util.EventListener;

public interface PrintingSystemListener extends EventListener {
	void onPrintablePrinted(PrintEvent printEvent);
}
