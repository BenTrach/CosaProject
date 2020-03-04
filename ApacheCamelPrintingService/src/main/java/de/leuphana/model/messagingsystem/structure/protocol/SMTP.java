package de.leuphana.model.messagingsystem.structure.protocol;

import de.leuphana.model.messagingsystem.structure.message.Message;
public class SMTP implements Protocol {

	public void open() {
		System.out.println("SMTP opened");
	}

	public void send(Message message) {
		System.out.println(message.getContent().getContentAsString());
	}

	public void close() {
		
		System.out.println("SMTP closed");
	}

}
