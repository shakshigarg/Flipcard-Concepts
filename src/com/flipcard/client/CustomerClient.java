/**
 * 
 */
package com.flipcard.client;

import java.util.Scanner;

import com.flipcard.bean.Customer;
import com.flipcard.service.CustOperation;
import com.flipcard.service.CustomerInterface;

/**
 * @author Lenovo
 *
 */
public class CustomerClient {
	public static void main(String[] args) {
		Customer[] cust=new Customer[10];
		Scanner sc= new Scanner(System.in);
		
		
		for(int i=0;i<5;i++) {	
			cust[i]=new Customer();
			cust[i].setCustId(i+1);
			cust[i].setCustName("flipcard"+i);
			cust[i].setCustAddress("Delhi"+i);
			cust[i].setLocation("India"+i);

					/*
					 * To take as input
					System.out.println("enter detail of "+ i);
					cust[i]=new Customer();
					int id=sc.nextInt();
					cust[i].setCustId(id);					
					cust[i].setCustName(sc.next());
					cust[i].setCustAddress(sc.next());
					cust[i].setLocation(sc.next());
					 */
					
		}
		CustomerInterface custOpt=new CustOperation();
		int id;

		while(true) {
			
			System.out.println("\n1. Create Customer");
			System.out.println("2. del Customer");
			System.out.println("3. edit Customer");
			System.out.println("4. list Customer");
			System.out.println("5. No of Customers");
			System.out.println("6. exit");
			int val=sc.nextInt();
			switch(val) {
			case 1:
				cust[CustOperation.count]=custOpt.addCustomer();
				CustOperation.count++;
				continue;

			case 2:
				System.out.println("enter the id on which you want to delete");
				id=sc.nextInt();
				cust=custOpt.deleteCustomer(cust,id);
				continue;
			case 3:
				System.out.println("enter the id which you want to edit");
				id=sc.nextInt();
				cust=custOpt.editCustomer(cust,id);
				continue;
			case 4:
				custOpt.listCustomer(cust);
				continue;
				
			case 5:
				System.out.println(CustOperation.count++);
				continue;
			case 6:
				break;

			}
			break;
		}

	}
	
}

