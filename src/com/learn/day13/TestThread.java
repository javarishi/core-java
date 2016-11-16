package com.learn.day13;

public class TestThread {

	public static void main(String[] args) {
	/* Java runs in single thread 
		int i = 0; int j = 100;
		double d = j/i;
		System.out.println("result :: " + d); */
		
		RunTask task = new RunTask();
		Thread T1 = new Thread(task);
		T1.setName("T1");
		T1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Before start T1 : " + T1.isAlive());
		Thread T3 = new Thread(task);
		T3.setName("T3");
		T3.setPriority(Thread.NORM_PRIORITY);
		
		Thread T2 = new Thread(task);
		T2.setName("T2");
		T2.setPriority(Thread.MAX_PRIORITY);
		//T2.setDaemon(true);
		try {
			T1.start();
			System.out.println("T1 : " + T1.isAlive());
			//T2.start();
			//T3.start();
			//T3.join(1000l); // you know which thread is going to wait
			// Thread.yield(); <-- this is for currently running thread
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
