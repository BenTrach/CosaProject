package de.leuphana.model.messagingsystem.structure.message;

public class MessageFactory {

	public static Message create(MessageType messageType, Content content) {
		Message message = null;
				
		switch(messageType) {
		case EMAIL:
			message = new EmailMessage(messageType, content);
			break;
		case SMS:
			message = new SmsMessage(messageType, content);
			break;
		case WHATS_APP:
			message = new WhatsAppMessage(messageType, content);
			break;
		default:
			// TODO MessageTypeException
		}
		
		return message;
	}

}
