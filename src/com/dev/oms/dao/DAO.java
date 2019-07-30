package com.dev.oms.dao;

import java.util.List;

import com.dev.oms.beans.Admin;
import com.dev.oms.beans.AdminMessage;
import com.dev.oms.beans.Cart;
import com.dev.oms.beans.Customer;
import com.dev.oms.beans.CustomerAddress;
import com.dev.oms.beans.CustomerMessage;
import com.dev.oms.beans.Order;
import com.dev.oms.beans.Product;

public interface DAO {
	
	//Customer 
	public Boolean  registerCustomer(Customer customer); 
	public Customer loginCustomer(int customerId,String password);
	public Boolean updateCustomer(Customer customer);
	public Boolean deleteCustomer(int customerId);
	public Boolean updatePassword(int customerId,String oldPassword,String newPassword);
	public Boolean addAddress(CustomerAddress address);
	public CustomerAddress updateAddress(CustomerAddress address);
	
	//Admin
	public Admin adminLogin(int adminId,String password);
	//public Boolean deleteCustomer(int customerId);	
	public List<Customer> getAllCustomer();
	public Customer searchCustomer(int customerId);
	public List<Product> getAllProduct();
	
	//Product
	public Product createProduct(Product product);
	public Product updateProduct(Product product);
	public Boolean deleteProduct(int productId);
	public Product searchProduct(int productId);
	public List<Product> searchProduct(String productName);
	
	//Orders and Bill 
	public Order placeOrder(Cart cart);
	public Boolean cancelOrder(int orderId,int customerId);
	public Cart addToCart(int productId, int customerId);
	public Cart removeFromCart(int productId,int customerId);
	public Cart displayCart(int customerId);
	
	//payment
	
	//Helpdesk
	//admin sec
	public Boolean sendMessageToCustomer(AdminMessage msg);
	public List<CustomerMessage> getCustomerMSG();
	
	//customer sec
	public Boolean sendMessageToAdmin(CustomerMessage msg);
	public List<AdminMessage> getAdminMSG(int customerId);

	

}
