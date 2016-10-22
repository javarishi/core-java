package com.learn.day5;

public class ArrayTest {

	public static void main(String[] args) {
		int[] roll = {10,11,12,13,14,15};
		int[][] multiDimention = {{1,2,3},{4,5,6}};
		
		String[] names = {"Daivd", "Ryan", "Byron", "Eric", "Andy"};
		
		short[] example = {};
		
		System.out.println("This is an Array :: " + roll[4]);
		System.out.println("Names 0 :: " + names[3]);
		int length = names.length;
		// ArrayIndexOutofBoundException
		/*
		System.out.println("Length of names array :: " + example[0]);
		System.out.println("Common mistake of developers :: " + names[length]);
		*/
		// Older way of writing loops for arrays and collection
		/* for(int i =0; i < length; i++){
			System.out.println(names[i]);
		}*/
		// this is java 5 way or advance for loop
		for(String eachName : names){
			System.out.println(eachName);
		}
		// Breaking a loop in between
		
		for(int rollNum : roll){
			if(rollNum == 13){
				break; // Jump out of the loop, right now
			}
			//System.out.println("Processing Roll Number " + rollNum);
		}
		
		// If I don't want to processes Roll number 13 but continue with others
		for(int rollNum : roll){
			if(rollNum == 13){
				continue;
			}
			System.out.println("Processing Roll Number " + rollNum);
		}
		
	}

}
