package com.problem4;

public class Producer extends Thread{
	Common c;

	Producer(Common c) {
		this.c = c;
	}

	public void run() {
		c.genNumber();
	}
}
