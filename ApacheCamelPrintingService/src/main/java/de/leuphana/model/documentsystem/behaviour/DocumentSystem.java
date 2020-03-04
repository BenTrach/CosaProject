package de.leuphana.model.documentsystem.behaviour;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

import org.apache.camel.Consume;

import de.leuphana.model.documentsystem.structure.Document;
import de.leuphana.model.documentsystem.structure.DocumentBodyPosition;
import de.leuphana.model.documentsystem.structure.IBAN;

// behaviour class for DocumentSystem

public class DocumentSystem extends Observable {
	// Was? / Interface
	private Map<String, Document> documentMap;

	public DocumentSystem() {
		// Was? / Interface = Wie? / konkret Klasse
		documentMap = new HashMap<String, Document>();
	}


	public void createDocument(Manageable manageable) {
		Document document = new Document(manageable.getName(), manageable.getDocumentType());

		// documentHead
		document.getDocumentHead().setCreationDate(LocalDate.now());

		// documentBody
		DocumentBodyPosition documentBodyPosition = document.getDocumentBody().createDocumentBodyPosition();
		documentBodyPosition.setName("Chair");

		document.getDocumentBody().setContent(manageable.getContent());

		// documentFooter
		document.getDocumentFooter().setIBAN(new IBAN());

		documentMap.put(document.getDocumentName(), document);

		super.setChanged();
		super.notifyObservers(document);
	}

	public Document getDocument(String documentName) {
		return documentMap.get(documentName);
	}

}
