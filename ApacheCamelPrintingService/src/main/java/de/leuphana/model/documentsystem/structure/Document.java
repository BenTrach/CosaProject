package de.leuphana.model.documentsystem.structure;

public class Document {

	// relational
	private DocumentHead documentHead;
	private DocumentBody documentBody;
	private DocumentFooter documentFooter;
	// intrinsic
	private DocumentType documentType;
	private String documentName;

	public Document(String documentName, DocumentType documentType) {
		this.documentName = documentName;
		this.documentType = documentType;
		this.documentHead = new DocumentHead();
		this.documentBody = new DocumentBody();
		this.documentFooter = new DocumentFooter();
	}

	public String getDocumentName() {
		return documentName;
	}

	public DocumentType getDocumentType() {
		return documentType;
	}

	public DocumentHead getDocumentHead() {
		return documentHead;
	}

	public DocumentBody getDocumentBody() {
		return documentBody;
	}

	public DocumentFooter getDocumentFooter() {
		return documentFooter;
	}


}