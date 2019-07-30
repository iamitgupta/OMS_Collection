package com.dev.oms.beans;

import java.util.Date;

public class CustomerMessage {
	
	private int messageId;
	private int userId;
	private String userMessage;
	private Date date;
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
		return "UserMessage [messageId=" + messageId + ", userId=" + userId + ", userMessage=" + userMessage + ", date="
				+ date + "]";
	}
	
	

}
