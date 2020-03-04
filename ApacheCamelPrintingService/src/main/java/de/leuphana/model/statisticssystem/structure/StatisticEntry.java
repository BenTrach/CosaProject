package de.leuphana.model.statisticssystem.structure;

public class StatisticEntry {

	private Integer numberOfPages;
	private Float pricePerPage;

	public StatisticEntry(Integer numberOfPages, Float pricePerPage) {
		this.numberOfPages = numberOfPages;
		this.pricePerPage = pricePerPage;
	}

	public Integer getNumberOfPages() {
		return numberOfPages;
	}
	
	public Float getPricePerPage() {
		return pricePerPage;
	}
}
