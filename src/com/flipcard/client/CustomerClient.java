/**
 * 
 */
package com.flipcard.client;

import com.flipcard.bean.Customer;
import com.flipcard.bean.service.CustOperation;

/**
 * @author Lenovo
 *
 */
public class CustomerClient {
public static void main(String[] args) {
	Customer cust=new Customer();
	cust.setCustId(101);
	cust.setCustName("flipcard");
	cust.setCustAddress("Delhi");
	cust.setLocation("India");
	CustOperation custOpt=new CustOperation();
	System.out.println(custOpt.addCustomer(cust));
	
//	System.out.println(cust.deleteCustomer(101));
//	System.out.println(cust.updateCustomer("updated"));
//	System.out.println(cust.editCustomer("edited"));
}
}
