package com.learn.revision;

import java.util.Calendar;

public class SwitchTest {

	public static void main(String[] args) {
		// Store opening time Day 
		/*
		 * Sunday - 7 AM  - 0 
		 * Monday - 9 AM  - 1
		 * Tuesday - 8 AM - 2
		 * Wed - 10 AM
		 * Thursday - 10 AM
		 * Friday - 9 AM
		 * Saturday - 7 AM
		 * 
		 */
		int dayofWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		// You can use switch with Strings, Char, int
		String day = "Monday";
		
		switch(dayofWeek){
		
	
		case 1: {
					System.out.println("Store Opens at 9 AM. Happy Sunday!!");
					break;
			}
		case 2: {
					System.out.println("Store Opens at 8 AM. Happy Monday!!");
					break;
			}
		case 3: {
					System.out.println("Store Opens at 10 AM. Happy Tuesday!!");
					break;
			}
		case 4: {
					System.out.println("Store Opens at 10 AM. Happy Wednesday!!");
					break;
			}
		case 5: {
					System.out.println("Store Opens at 9 AM. Happy Thursday!!");
					break;
			}
		case 6: {
					System.out.println("Store Opens at 7 AM. Happy Friday!!");
					break;
			}
		case 0: {
					System.out.println("Store Opens at 7 AM. Happy Saturday!!");
					break;
			}
		
		default: {
				System.out.println("Your day calculation went wrong. But open the store at 9 AM");
				break;
			}
		}
		System.out.println("Statement after Switch Case Statement");
		
	}

}
