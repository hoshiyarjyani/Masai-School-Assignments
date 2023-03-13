package com.problem4;

//Create a multithreaded Producer-Consumer application, where the Producer Thread 
//will produce a number. And the Consumer thread should print the sum of all the numbers. 
//Producer should produce any 5 numbers from 0 to 5 such that a number may be generated more
//then once. [hint use Math.random() to produce random number]
//
//**Sample Output:**
//
//Producer Produced: 2
//Consumer Calculated Sum is: 3
//
//Producer Produced: 4
//Consumer Calculated Sum is: 10
//
//Producer Produced : 0
//Consumer Calculated Sum is: 0
//
//Producer Produced : 3
//Consumer Calculated Sum is: 6
//
//Producer Produced: 5
//Consumer Calculated Sum is: 15
public class Main {
	public static void main(String[] args) {
		Common c = new Common();
		Producer pro = new Producer(c);
		Consumer con = new Consumer(c);
		pro.start();
		con.start();
		try {
			pro.join();
			con.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sucessfully Ended Program");
	}
}
