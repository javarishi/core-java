package com.learn.day2;

public class OperatorTest {

	static int varOne = 25;
	static int varTwo = 10;
	static boolean varBool = true;
	
	public static void main(String[] args) {
		// Basic Operators
		float division  = (varOne / varTwo);
		System.out.println("Addition :: "  + (varOne + varTwo));
		System.out.println("Substraction :: "  + (varOne - varTwo));
		System.out.println("Division :: "  + division);
		System.out.println("Multiplication :: "  + (varOne * varTwo));
		System.out.println("Modulous :: "  + (varOne % varTwo));

		// Unary Operator
		System.out.println("Addition :: " + (++varOne)); // increase by 1 and then use it
		System.out.println("Now Value is :: " + (varOne));

		System.out.println("Addition :: " + (varOne++)); // Use the value and increase by 1
		System.out.println("Now Value is :: " + (varOne));
		
		System.out.println("Boolean Value :: " + varBool);
		System.out.println("Boolean Negative :: " + !varBool);
		
		// Logical
		System.out.println("Comparision Greater than:: "  + (varOne > varTwo));
		System.out.println("Comparision Less than:: "  + (varOne < varTwo));
		// Equality
		System.out.println("Equal to Check :: "  + (varOne == varTwo));
		System.out.println("Not Equal to Check :: "  + (varOne != varTwo));
		
		// Logical & - AND and | - OR
		boolean oneBool = true;
		boolean twoBool = false;
		
		if(oneBool & twoBool){
			System.out.println("Logical AND Fails");
		}else{
			System.out.println("Logical AND Works");
		}
		// Logical OR
		if(oneBool | twoBool){
			System.out.println("Logical OR Works");
		}else{
			System.out.println("Logical OR Fails");
		}
	}

}
