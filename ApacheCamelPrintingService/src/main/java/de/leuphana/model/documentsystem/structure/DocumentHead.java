package de.leuphana.model.documentsystem.structure;

import java.time.LocalDate;

public class DocumentHead {

	private LocalDate creationDate;
	private Address receiverAddress;
	private Address senderAddress;

	public DocumentHead(){

	}
	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public Address getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(Address receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public Address getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(Address senderAddress) {
		this.senderAddress = senderAddress;
	}

	
	
	
}