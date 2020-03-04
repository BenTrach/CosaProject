package de.leuphana.model.printingsystem.behaviour.event;

import java.util.EventObject;

import de.leuphana.model.printingsystem.structure.PrintResult;

public class PrintEvent extends EventObject {
	private PrintResult printResult;

	public PrintEvent(PrintResult printResult) {
		super(printResult);
		this.printResult = printResult;
	}

	public PrintResult getPrintResult() {
		return printResult;
	}
}
