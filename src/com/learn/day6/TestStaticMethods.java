package com.learn.day6;

public class TestStaticMethods {

	public static void main(String[] args) {
		TestStaticMethods test = new TestStaticMethods();
		test.testStatic("Accessing with Object");
		// This is the proper way
		TestStaticMethods.testStatic("Test");

	}

	// parameters are also called as arguments
	public static void testStatic(String arg0){
		System.out.println("This is static Method Call :: " + arg0);
	}
	
	public static void testStatic(String arg0, int something){
		System.out.println("This is static Method Call :: " + arg0);
	}
}
