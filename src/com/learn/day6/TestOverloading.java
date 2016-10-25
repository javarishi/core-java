package com.learn.day6;

public class TestOverloading {

	
	
	
	public static void main(String[] args) {
		TestOverloading overload = new TestOverloading();
		overload.testSomething("ABC", 1234);

	}

	
	public void testSomething(String strVal, int varInt){
		System.out.println("String :: " + strVal);
		System.out.println("Interger :: " + varInt);
	}
	// Overloading type 1 - reduced parm
	public void testSomething(String strVal){
		System.out.println("String :: " + strVal);
	}
	
	// Overloading type 2 - additing param
	public void testSomething(String strVal, int varInt, float testFloat){
		System.out.println("String :: " + strVal);
		System.out.println("Interger :: " + varInt);
		System.out.println("Float :: " + testFloat);
	}
	// This is NOT overloading
	/* Change in return type
	public String testSomething(String strVal, int varInt){
		System.out.println("String :: " + strVal);
		System.out.println("Interger :: " + varInt);
		return "Message";
	} 
	// Change in access Modifier
	private void testSomething(String strVal, int varInt){
		System.out.println("String :: " + strVal);
		System.out.println("Interger :: " + varInt);
	}*/
	
	
}
