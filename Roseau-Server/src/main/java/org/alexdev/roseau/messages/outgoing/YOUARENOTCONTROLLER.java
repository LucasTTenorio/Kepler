package org.alexdev.roseau.messages.outgoing;

import org.alexdev.roseau.messages.OutgoingMessageComposer;


public class YOUARENOTCONTROLLER extends OutgoingMessageComposer {

	@Override
	public void write() {
		response.init("YOUARENOTCONTROLLER");
	}

}
