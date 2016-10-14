package com.learn.day4;

public class LoopTest {

	public static void main(String[] args) {
		// while Loop - check the condition then execute the block of code
		int rollNum = 1;
		while(rollNum <= 10){
			System.out.println("MarkList for Student :: " + rollNum + " is Printed");
			rollNum++;
		}
		System.out.println("Getting out of the Loops");
		
		// Execute block of code then check the condition
		do{
			System.out.println("Printing Logic executing it first :: " + rollNum);
			rollNum++;
		}while(rollNum <= 20);
		
		// For Loop - initialization, expression , increment for known loop iteration
		for(int j=1, i=0; j < 20 && i < 15; j++, i++){
			System.out.println("For Loop Block of Code :: " + j);
			System.out.println("For Loop Block of code with i :: " + i);
		}
		
	}

}
