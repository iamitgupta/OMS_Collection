package com.dev.oms.beans;

import java.util.Date;

public class CustomerMessage {
	
	private int messageId;
	private int customerId;
	private String userMessage;
	private Date date;
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getUserMessage() {
		return userMessage;
	}
	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "CustomerMessage [messageId=" + messageId + ", customerId=" + customerId + ", userMessage=" + userMessage
				+ ", date=" + date + "]";
	}
	
	
	
	

}
