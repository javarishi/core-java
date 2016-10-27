package com.learn.day8;

public class TestInheritance {

	public static void main(String[] args) {
		// Child Class can access Parent Class Methods as if they are defined in Child Class
		PreferredCustomer pCust = new PreferredCustomer();
		pCust.setFirstName("David");
		
		pCust.setSsnNumber("029590324");
		
		System.out.println("CustomerName :: " + pCust.getFirstName());
		
		// java.lang.Object is Parent of all Classes in Java
		//System.out.println(pCust.getClass().getName());
		
		// Parent Child Relation is IS-A relationship
		// Visibility of methods /  variables is attached to reference type (Customer here)
		Customer cust = new PreferredCustomer();
		cust.setFirstName("Nick");
		
		//	cust.setSsnNumber("029590324");
		Object obj = new PreferredCustomer();
		
			
		// Preferred Cust
		pCust.validateAddress("pref Cust Atlanta", "30005"); 
		
		// Method Logic is attached to instance created
		cust.validateAddress("Cust Ref Atlanta", "30005"); 
		
	}

}
