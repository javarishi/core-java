package com.learn.day11;

public class ExceptionTest {

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundException
		int[] testInt = {};
		//System.out.println(testInt[0]);
		
		System.out.println("Can we see this");
		// NumberFormatException
		String str = "test";
		//int testConversion = Integer.parseInt(str);
	//	System.out.println(testConversion);

		int valA =100;
		int valB = 0;
		// ArithmaticException
		double result = valA / valB;
		System.out.println(result);
		
		
		
		
		
		
	}

}
