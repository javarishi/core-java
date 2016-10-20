package com.learn.revision;

public class ConditionsTest {

	public static void main(String[] args) {
		
		int varOne = 200;
		int varTwo = 100;
		int varThree = 300;
		
		// Simple if-else
		if(varTwo > varOne){
			System.out.println("Executed with Condition is true :: Greater Value " + varTwo);
		}else{
			System.out.println("Executed if the condition is false ::  Greater Value " + varOne);
		}

		// using else-if
		if(varTwo > varOne){
			System.out.println("Executed with Condition is true :: Greater Value " + varTwo);
		}else if(varTwo > varThree){
				System.out.println("Executed if the condition is true ::  Greater Value " + varTwo);
			}else{
				System.out.println("Executed if the condition is false ::  Greater Value " + varThree);
			}

		// using && and else-if
		if((varOne > varTwo) && (varOne > varThree)){
			System.out.println("Greatest Variable is :: " + varOne);
		}else if(varTwo > varThree){
			System.out.println("Greatest Variable is :: " + varTwo);
		}else{
			System.out.println("Greatest Variable is :: " + varThree);
		}
	}

}
