package com.learn.day13;

public class ThreadTask extends Thread {

	@Override
	public void run() {
		System.out.println("Provide a task here");
	}
	
	
	@Override
	public synchronized void start() {
		System.out.println("My Own Logic for Start");
		super.start();
	}
	
}
