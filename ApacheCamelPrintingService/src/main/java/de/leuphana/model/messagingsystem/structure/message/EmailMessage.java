package de.leuphana.model.messagingsystem.structure.message;

public class EmailMessage extends Message {
	
	public EmailMessage(MessageType messageType, Content content) {
		super.messageType = messageType;
		super.content = content;
	}
}
