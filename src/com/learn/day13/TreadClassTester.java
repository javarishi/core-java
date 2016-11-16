package com.learn.day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TreadClassTester {

	public static void main(String[] args) {
		int nThreads = 10;
		ExecutorService service = Executors.newFixedThreadPool(nThreads);
		
		for(int i=0; i < 10; i++){
			ThreadTask task = new ThreadTask();
			service.execute(task);
		}

	}

}
