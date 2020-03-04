package de.leuphana.model.messagingsystem.behaviour;

import java.util.Observable;

import de.leuphana.model.messagingsystem.structure.message.Content;
import de.leuphana.model.messagingsystem.structure.message.Message;
import de.leuphana.model.messagingsystem.structure.message.MessageFactory;
import de.leuphana.model.messagingsystem.structure.message.MessageType;
import de.leuphana.model.messagingsystem.structure.protocol.Protocol;
import de.leuphana.model.messagingsystem.structure.protocol.ProtocolFactory;
import de.leuphana.model.messagingsystem.structure.protocol.ProtocolType;

public class MessagingSystem extends Observable {

	public void sendMessage(Sendable sendable , MessageType messageType) {
		
		Message message = MessageFactory.create(messageType, new Content(sendable.getContent()));
		
		Protocol protocol = null;
		
		// Method Factory
		switch(message.getMessageType()) {
		case EMAIL:
		case SMS:
			protocol = ProtocolFactory.create(ProtocolType.SMTP);
			break;
		case WHATS_APP:
			protocol = ProtocolFactory.create(ProtocolType.XMPP);
			break;
		default:
			// TODO MessageTypeException
		}
		
		protocol.open();
		protocol.send(message);
		protocol.close();
		
		super.setChanged();
		super.notifyObservers(message);
	}

	

}
