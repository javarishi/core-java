package com.learn.day13;

import java.util.Calendar;

public class RunTask implements Runnable {

	@Override
	public void run() {
		// work which we want to do parallely
	//	System.out.println("This task can run in parallel " + Thread.currentThread().getName());
		for(int i =0; i < 10; i++){
			System.out.println("Task Running : " + i + " "  + Thread.currentThread().getName() + " " + Calendar.getInstance().getTime());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//Thread.dumpStack();
		} 
	}

}
