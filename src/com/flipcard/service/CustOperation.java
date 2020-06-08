package com.flipcard.service;
import java.util.Scanner;

import com.flipcard.bean.Customer;

public class CustOperation implements CustomerInterface {
	private static final Customer NULL = null;
	public static int count=5;

	// Add Customer
	
	public Customer addCustomer() {
		Customer c=new Customer();
		Scanner sc= new Scanner(System.in);
		c.setCustId(sc.nextInt());

		c.setCustName(sc.next());
		c.setCustAddress(sc.next());
		c.setLocation(sc.next());
		return c;
	}

	// Delete Customer
	public Customer[] deleteCustomer(Customer[] cust,int id) {

		for(int i=0;i<count;i++) {
			if(id==cust[i].getCustId()) {
				cust[i]=NULL;
				for(int j=i+1;j<count;j++) {
					cust[j-1]=cust[j];
				}
				cust[count-1]=NULL;
				count--;
				break;
			}
		}
		return cust;
	}
	
	
	// edit customer

	public Customer[] editCustomer(Customer[] cust,int id) {
		
		for(int i=0;i<count;i++) {
			if(id==cust[i].getCustId()) {
				System.out.println("Enter details ");
				Scanner sc= new Scanner(System.in);
				cust[i].setCustId(sc.nextInt());
				cust[i].setCustName(sc.next());
				cust[i].setCustAddress(sc.next());
				cust[i].setLocation(sc.next());
				break;
			}
		}
		return cust;
		
	}

	// List customer

	public void listCustomer(Customer[] cust) {
		for(int i=0;i<count;i++) {
			
			if(cust[i]!=NULL)
			{
				System.out.println(cust[i].getCustId());
				System.out.println(cust[i].getCustName());
				System.out.println(cust[i].getCustAddress());
				System.out.println(cust[i].getLocation());
			}
			
		}
	}
}
