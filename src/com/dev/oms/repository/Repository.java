package com.dev.oms.repository;

import java.util.HashMap;

import com.dev.oms.beans.Admin;
import com.dev.oms.beans.AdminMessage;
import com.dev.oms.beans.Cart;
import com.dev.oms.beans.Customer;
import com.dev.oms.beans.CustomerAddress;
import com.dev.oms.beans.CustomerMessage;
import com.dev.oms.beans.Order;
import com.dev.oms.beans.Product;

public class Repository {
	
	public static HashMap<Integer,Customer> customerInfo=new HashMap<>();
	public static HashMap<Integer,CustomerAddress> addressInfo=new HashMap<>();
	public static HashMap<Integer,Admin> adminInfo=new HashMap<>();
	public static HashMap<Integer,Product> productInfo=new HashMap<>();
	public static HashMap<Integer,Cart> cartInfo=new HashMap<>();
	public static HashMap<Integer,Order> orderInfo=new HashMap<>();
	public static HashMap<Integer,CustomerMessage> customerMSGInfo=new HashMap<>();
	public static HashMap<Integer,AdminMessage> adminMSGInfo=new HashMap<>();
	
	
	//Insert some hard coded data
	
}
