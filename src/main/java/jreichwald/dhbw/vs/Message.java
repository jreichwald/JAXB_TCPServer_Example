package jreichwald.dhbw.vs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private int messageId; 
	
	private String messageText; 
	
	private double messageValue ;

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public double getMessageValue() {
		return messageValue;
	}

	public void setMessageValue(double messageValue) {
		this.messageValue = messageValue;
	}
	
	@Override
	public String toString() {
		return this.messageId + ", " + this.messageText + ", " + this.messageValue;
	}
	
	
}
