package de.leuphana.model.messagingsystem.structure.message;

public abstract class Message {
	protected MessageType messageType;
	protected Content content;

	public MessageType getMessageType() {
		return messageType;
	}

	public Content getContent() {
		return content;
	}

}