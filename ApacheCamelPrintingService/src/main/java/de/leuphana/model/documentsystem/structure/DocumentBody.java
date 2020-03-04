package de.leuphana.model.documentsystem.structure;

import java.util.HashMap;
import java.util.Map;

public class DocumentBody {
	private Map<Integer, DocumentBodyPosition> documentBodyPositions;
	private String subject;
	private String content;
	private String salutation;

	public DocumentBody() {
		documentBodyPositions = new HashMap<Integer, DocumentBodyPosition>();
	}

	// intrinsic
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	// relational


	public Map<Integer, DocumentBodyPosition> getDocumentBodyPositions() {
		return documentBodyPositions;
	}

	public DocumentBodyPosition createDocumentBodyPosition() {
		// TODO Ver�nderung der ID f�r zu Hause
		DocumentBodyPosition documentBodyPosition = new DocumentBodyPosition(1);
		documentBodyPositions.put(documentBodyPosition.getId(), documentBodyPosition);
		
		return documentBodyPosition;
	}
}