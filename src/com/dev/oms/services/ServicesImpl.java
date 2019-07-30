package com.dev.oms.services;

import java.util.Date;
import java.util.List;

import com.dev.oms.beans.Admin;
import com.dev.oms.beans.AdminMessage;
import com.dev.oms.beans.Cart;
import com.dev.oms.beans.Customer;
import com.dev.oms.beans.CustomerAddress;
import com.dev.oms.beans.CustomerMessage;
import com.dev.oms.beans.Order;
import com.dev.oms.beans.Product;
import com.dev.oms.dao.DAO;
import com.dev.oms.dao.DAOImpl;

public class ServicesImpl  implements Services{
	
	DAO dao=new DAOImpl();

	@Override
	public Boolean registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer loginCustomer(int customerId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updatePassword(int customerId, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addAddress(CustomerAddress address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerAddress updateAddress(CustomerAddress address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin adminLogin(int adminId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer searchCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product searchProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> searchProduct(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order placeOrder(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean cancelOrder(int orderId, int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart addToCart(int productId, int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart removeFromCart(int productId, int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart displayCart(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean sendMessageToCustomer(AdminMessage msg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerMessage> getCustomerMSG() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean sendMessageToAdmin(CustomerMessage msg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminMessage> getAdminMSG(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean validateCard(long cardNumber, Date expDate, int cvv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer calculatePrice(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}

}
