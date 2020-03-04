package de.leuphana.model.messagingsystem.structure.message;

public class WhatsAppMessage extends Message {
	public WhatsAppMessage(MessageType messageType, Content content) {
		super.messageType = messageType;
		super.content = content;
	}

}