package de.leuphana.model.statisticssystem.behaviour;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import de.leuphana.model.statisticssystem.structure.DailyPrintJobStatistic;
import de.leuphana.model.statisticssystem.structure.MonthlyPrintJobStatistic;
import de.leuphana.model.statisticssystem.structure.PrintJobStatistic;
import de.leuphana.model.statisticssystem.structure.PrintStatisticPeriod;
import de.leuphana.model.statisticssystem.structure.StatisticEntry;
import de.leuphana.model.statisticssystem.structure.YearlyPrintJobStatistic;

public class StatisticsSystem extends Observable {

	private List<StatisticEntry> statisticEntries;

	public StatisticsSystem() {
		statisticEntries = new ArrayList<StatisticEntry>();
	}

	// Strategy pattern
	public void checkStatistic(PrintStatisticPeriod printStatisticPeriod) {
		PrintJobStatistic printJobStatistic = null;

		switch (printStatisticPeriod) {
		case DAILY:
			printJobStatistic = new DailyPrintJobStatistic();
			break;
		case MONTHLY:
			printJobStatistic = new MonthlyPrintJobStatistic();
			break;
		case YEARLY:
			printJobStatistic = new YearlyPrintJobStatistic();
			break;

		default:
			break;
		}

		printJobStatistic.generateStatistic();
		
		super.setChanged();
		super.notifyObservers(printJobStatistic);

	}

	public void addEntry(Countable countable) {
		System.out.println(countable.getNumberOfPages() + " " + countable.getPricePerPage());
		
		StatisticEntry statisticEntry = new StatisticEntry(countable.getNumberOfPages(), countable.getPricePerPage());
		statisticEntries.add(statisticEntry);
		super.setChanged();
		super.notifyObservers(statisticEntry);
	}

}
