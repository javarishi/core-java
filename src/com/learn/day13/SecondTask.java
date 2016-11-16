package com.learn.day13;

public class SecondTask implements Runnable {

	int counter = 100;
	
	@Override
	public void run() {
		System.out.println("Another Work");
		commonTask();
	}

	
	public void commonTask(){
		
		System.out.println("Increase this operator " + Thread.currentThread().getName());
		synchronized(this){
			counter++;
			System.out.println("counter :: " + counter);
			System.out.println(Thread.holdsLock(this));
		}
		System.out.println("Increase is Done " + Thread.currentThread().getName());
		System.out.println(Thread.holdsLock(this));
		
	}
}
