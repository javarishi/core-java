package com.learn.day3;

import java.util.Calendar;

public class ConditionsTest {

	public static void main(String[] args) {
		int varOne = 100;
		int varTwo = 120;
			
		// If condition
		if((varTwo < varOne) || (varTwo > 100)) {
			if(varOne != 100){
				System.out.println("VarOne is not 100");
			}else if(varOne / 10 == 10){
				System.out.println("VarOne is 100");
			}
			System.out.println("VarTwo is Greater than VarOne");
		}
		else{
			System.out.println("VarOne is Less than VarTwo");
		}
		System.out.println("Statement in If condition will not be printed - if expression is false");
		
		
		int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		
		switch(dayOfWeek){
		
				case 1 :
				case 8: {
						System.out.println("Open the Store at 7 AM");
						break;
					}
				case 2: {
					System.out.println("Open the Store at 9 AM");
					break;
				}
				case 3: {
					System.out.println("Open the Store at 10 AM");
					break;
				}
				case 4: {
					System.out.println("Open the Store at 10 AM");
					break;
				}
				case 5: {
					System.out.println("Open the Store at 11 AM");
					break;
				}
				case 6: {
					System.out.println("Open the Store at 9 AM");
					break;
				}
				case 7: {
					System.out.println("Open the Store at 7 AM");
					break;
				}
				default : {
					System.out.println("Your day calculation went wrong. We will open the store at 8:00 AM");
					break;
				}
		}
		
	}

}
