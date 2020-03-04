package de.leuphana.model.statisticssystem.structure;

public class YearlyPrintJobStatistic implements PrintJobStatistic {


	public void generateStatistic() {
		// Generell steht hier der Algorithmus (d.h. die Strategie) wie
		// die entsprechende Statistik generiert werden soll.
		System.out.println(YearlyPrintJobStatistic.class.getSimpleName());
	}

}
