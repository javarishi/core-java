package com.learn.day13;

public class SyncTest {

	public static void main(String[] args) {
		SecondTask task = new SecondTask();
		
		Thread T1 = new Thread(task);
		Thread T2 = new Thread(task);
		Thread T3 = new Thread(task);
		
		T1.start();
		T2.start();
		T3.start();
		

	}

}
