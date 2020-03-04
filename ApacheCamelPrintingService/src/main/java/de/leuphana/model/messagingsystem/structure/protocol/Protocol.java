package de.leuphana.model.messagingsystem.structure.protocol;

import de.leuphana.model.messagingsystem.structure.message.Message;

public interface Protocol {

	void open();

	void send(Message message);

	void close();
}
