package de.leuphana.model.messagingsystem.behaviour;

import de.leuphana.model.messagingsystem.structure.message.MessageType;

public interface Sendable {
	String getContent();
	MessageType getMessageType();
}
