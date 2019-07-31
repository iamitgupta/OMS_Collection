package com.dev.oms.beans;

public class Cart {
	
	private int cartId;
	private int userId;
	
	private int product1;
	private int product1Count;
	
	private int product2;
	private int product2Count;
	
	private int product3;
	private int product3Count;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getProduct1() {
		return product1;
	}
	public void setProduct1(int product1) {
		this.product1 = product1;
	}
	public int getProduct1Count() {
		return product1Count;
	}
	public void setProduct1Count(int product1Count) {
		this.product1Count = product1Count;
	}
	public int getProduct2() {
		return product2;
	}
	public void setProduct2(int product2) {
		this.product2 = product2;
	}
	public int getProduct2Count() {
		return product2Count;
	}
	public void setProduct2Count(int product2Count) {
		this.product2Count = product2Count;
	}
	public int getProduct3() {
		return product3;
	}
	public void setProduct3(int product3) {
		this.product3 = product3;
	}
	public int getProduct3Count() {
		return product3Count;
	}
	public void setProduct3Count(int product3Count) {
		this.product3Count = product3Count;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", userId=" + userId + ", product1=" + product1 + ", product1Count="
				+ product1Count + ", product2=" + product2 + ", product2Count=" + product2Count + ", product3="
				+ product3 + ", product3Count=" + product3Count + "]";
	}
	
	
	
	

}
