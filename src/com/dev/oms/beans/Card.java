package com.dev.oms.beans;

import java.util.Date;

public class Card {

	private String cardNumber;//format 1111 1111 1111 1111
	private Date expiryDate;// format MM/YY
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "Card [cardNumber=" + cardNumber + ", expiryDate=" + expiryDate + "]";
	}
	
}
