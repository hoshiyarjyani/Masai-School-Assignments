package com.problem4;

public class Consumer extends Thread {
	Common c;

	Consumer(Common c) {
		this.c = c;
	}

	public void run() {
		c.printSum();
	}
}
