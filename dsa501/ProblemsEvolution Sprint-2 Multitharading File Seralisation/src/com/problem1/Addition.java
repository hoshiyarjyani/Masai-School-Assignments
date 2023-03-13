package com.problem1;

public class Addition implements Runnable {

	@Override
	public void run() {
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			sum += i;
		}
		System.out.println(Thread.currentThread().getName() + " Addition of the first 20 numbers: " + sum);
	}

}
