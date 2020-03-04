package de.leuphana.model.documentsystem.behaviour;

import de.leuphana.model.documentsystem.structure.DocumentType;

public interface Manageable {
	String getName();

	String getContent();

	DocumentType getDocumentType();
}