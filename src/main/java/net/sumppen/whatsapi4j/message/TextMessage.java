package net.sumppen.whatsapi4j.message;

import net.sumppen.whatsapi4j.ProtocolNode;

public class TextMessage extends BasicMessage {
	private String text;
	
	public TextMessage(ProtocolNode node, String from, String group) {
		super(MessageType.TEXT,node, from, group);
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		if(getGroupId() != null) {
			return getDate()+" :: "+getFrom()+"("+getGroupId()+"): "+text;
		}
		return getDate()+" :: "+getFrom()+": "+text;
	}
}
