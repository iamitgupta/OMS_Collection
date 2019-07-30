package com.dev.oms.beans;

public class Cart {
	
	private int cartId;
	private int userId;
	private int product1;
	private int product2;
	private int product3;
	private int product4;
	private int product5;
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
	public int getProduct2() {
		return product2;
	}
	public void setProduct2(int product2) {
		this.product2 = product2;
	}
	public int getProduct3() {
		return product3;
	}
	public void setProduct3(int product3) {
		this.product3 = product3;
	}
	public int getProduct4() {
		return product4;
	}
	public void setProduct4(int product4) {
		this.product4 = product4;
	}
	public int getProduct5() {
		return product5;
	}
	public void setProduct5(int product5) {
		this.product5 = product5;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", userId=" + userId + ", product1=" + product1 + ", product2=" + product2
				+ ", product3=" + product3 + ", product4=" + product4 + ", product5=" + product5 + "]";
	}
	
	

}
