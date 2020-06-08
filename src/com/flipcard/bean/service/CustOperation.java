package com.flipcard.bean.service;
import com.flipcard.bean.Customer;

public class CustOperation {
	// Add Customer
		public Customer addCustomer(Customer cust) {
//			cust= "customer created"
			System.out.println(cust.getCustId());
			System.out.println(cust.getCustName());
			System.out.println(cust.getCustAddress());
			System.out.println(cust.getLocation());
			return cust;
		}
		
		// Delete Customer
		public int deleteCustomer(int custId) {
			System.out.println("deleted customer");
			return custId;
		}
	// edit customer
			
	public String editCustomer(String cust) {
		System.out.println("customer edited on details");
		
		cust="edited customer";
		return cust;
	}
	
	// update customer
	
		public String updateCustomer(String cust) {
			System.out.println("customer updated on details");
			cust= "edited customer";
			return cust;
		}
}
