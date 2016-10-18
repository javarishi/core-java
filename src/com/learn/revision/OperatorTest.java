package com.learn.revision;

public class OperatorTest {

	public static void main(String[] args) {
		int varOne = 100;
		int varTwo = 105;
		
		// Basic Mathematical
		System.out.println("Addition " + (varOne+varTwo));
		System.out.println("Substration " + (varOne - varTwo));
		System.out.println("Multipication " + (varOne * varTwo));
		System.out.println("Deivision " + (varOne / varTwo));
		System.out.println("Modulous " + (varOne % varTwo));
		 
		// Basic Logical - comparison
		System.out.println("Greater Than (varOne > varTwo) :: " + (varOne > varTwo));
		System.out.println("Less Than :: (varOne < varTwo) " + (varOne < varTwo));
		System.out.println("Equals to :: varOne == varTwo) " + (varOne == varTwo));
		System.out.println("Non-equality :: (varOne != varTwo) " + (varOne != varTwo));
		
		//increment 
		System.out.println("Increment first then use the value " + (++varOne));
		System.out.println("Use the value then increment by one" + (varOne++));
		System.out.println("Incremented Value will be ::" + varOne);
		
		// Logical Expressions AND and OR
		boolean first = true;
		boolean second = false;
		boolean third = false;
		
		System.out.println(" AND " + (first & second));
		System.out.println(" OR " + (first | second));
		
		System.out.println(" Short Circuit AND " + (first && second && third));
		System.out.println(" Short Circuit OR " + (first || second || third));
	}

}
