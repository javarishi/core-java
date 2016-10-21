package com.learn.revision;

public class LoopTest {

	public static void main(String[] args) {
		// Looping is iterating the logic 
		int loopOne = 10;
		int summation = 0;
		// iteration till condition matches
		// Iterate only if condition is true
		while(loopOne <= 100){ 
			System.out.println("Do Something in While Loop " + loopOne);
			summation = summation + loopOne;
			loopOne = loopOne + 10;
		}
		System.out.println("Summation Value :: " + summation);
		
		// first execute the block  then check condition
		int loopTwo = 100;
		
		do{
			System.out.println("Do Something in do-while Loop " + loopTwo);
			summation = summation + loopTwo;
			loopTwo = loopTwo + 100;
		}while(loopTwo > 1000);
		System.out.println("Summation Value :: " + summation);
		
		// iteration till number matches
		int count = 0;
		for(int i = 0; i < 10; i++){
			count = count + i;
			System.out.println("Value of i :: " + i);
		}
		
	}

}
