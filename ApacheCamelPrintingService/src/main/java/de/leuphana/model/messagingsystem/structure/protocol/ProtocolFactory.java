package de.leuphana.model.messagingsystem.structure.protocol;

public class ProtocolFactory {

	public static Protocol create(ProtocolType protocolType) {
		Protocol protocol = null;

		switch (protocolType) {
		case SMTP:
			protocol = new SMTP();
			break;
		case XMPP:
			protocol = new XMPP();
			break;

		default:
			break;
		}

		return protocol;
	}

}
