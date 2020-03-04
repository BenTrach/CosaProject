package de.leuphana.model.printingsystem.structure;

public class PrintResult {

	private Integer numberOfPages;
	private Float pricePerPage;
	private String content;

	public PrintResult(Integer numberOfPages, Float pricePerPage, String content) {
		this.numberOfPages = numberOfPages;
		this.pricePerPage = pricePerPage;
		this.content = content;
	}

	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	public Float getPricePerPage() {
		return pricePerPage;
	}

	public String getContent() {
		return content;
	}

}
