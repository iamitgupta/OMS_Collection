package com.dev.oms.beans;

import java.util.Date;

public class AdminMessage {
	
	private int messageId;
	private int adminId;
	private int customerId;
	private String message;
	private Date date;
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "AdminMessage [messageId=" + messageId + ", adminId=" + adminId + ", customerId=" + customerId
				+ ", message=" + message + ", date=" + date + "]";
	}
	
	

}
