package com.learn.day1;

public class Customer {
	// Class Variable
	static String storeName;
	// Instance Variables
	String firstName;
	String lastName;
	String address;
	String mobileNumber;

	void testLocalVar(){
		// Local Variables or Method Variables
		int localInt = 100;
		System.out.println("Local Variable Test :: " + localInt);
	}
	
	
	void testLocalVarFromOtherMethod(){
		System.out.println("Uncomment below line for testing");
		//System.out.println("Local Variable Test :: " + localInt);
	}
}
