package com.problem1;

public class Product implements Runnable {

	@Override
	public void run() {
		int pro = 1;
		for (int i = 1; i <= 10; i++) {
			pro *= i;
		}
		System.out.println(Thread.currentThread().getName() + " Product of first 10 number is : " + pro);
	}

}
