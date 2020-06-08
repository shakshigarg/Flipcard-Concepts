package com.flipcard.service;

import com.flipcard.bean.Customer;

public interface CustomerInterface {
	public static int count=5;
	public Customer addCustomer();
	public Customer[] deleteCustomer(Customer[] cust,int id);
	public Customer[] editCustomer(Customer[] cust,int id);
	public void listCustomer(Customer[] cust);
}
