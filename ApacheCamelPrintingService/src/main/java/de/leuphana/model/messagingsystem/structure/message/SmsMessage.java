package de.leuphana.model.messagingsystem.structure.message;

public class SmsMessage extends Message {
	public SmsMessage(MessageType messageType, Content content) {
		super.messageType = messageType;
		super.content = content;
	}

}
