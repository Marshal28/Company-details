package org.Company;

import org.client.Client;

public class Company extends Client {
	
	public void companyname() {
		
		
		System.out.println(" company name: Ashok Leyland ");
	}
	
	
	public void companyLocation() {
		
		System.out.println("location : chennai ");
	}
	public static void main(String[] args) {
		
		Company c = new Company();
		
		c.companyname();
		c.companyLocation();
		c.clientName();
		c.clientid();
		
		
		
		
	}

}
