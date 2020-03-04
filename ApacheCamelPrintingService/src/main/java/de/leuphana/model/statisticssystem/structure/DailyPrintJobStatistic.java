package de.leuphana.model.statisticssystem.structure;

public class DailyPrintJobStatistic implements PrintJobStatistic {
	
	public DailyPrintJobStatistic() {
		this.generateStatistic();
	}


	public void generateStatistic() {
		// Generell steht hier der Algorithmus (d.h. die Strategie) wie
		// die entsprechende Statistik generiert werden soll.
		System.out.println(DailyPrintJobStatistic.class.getSimpleName());
	}

}
