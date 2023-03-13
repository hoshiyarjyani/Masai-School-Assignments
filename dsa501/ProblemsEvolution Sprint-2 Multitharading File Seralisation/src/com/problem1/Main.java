package com.problem1;

//Write a multithreaded application that should perform the following tasks:
//● Start the 3 threads.
//● Give the name of those threads as Virat, Dhoni, and Rohit.
//● Set the max priority to the Dhoni thread.
//● Dhoni thread should print from 1 to 10.
//● Virat Thread should print the Addition of the first 20 numbers.
//● Rohit thread should print the product of 1st 10 number
//
//Note Make sure that first, the Dhoni thread should print then Rohit Thread, and then Virat Thread.
public class Main {
	public static void main(String[] args) {
		Thread virat = new Thread(new Addition(), "Virat");
		Thread dhoni = new Thread(new Count(), "Dhoni");
		Thread rohit = new Thread(new Product(), "Rohit");

		dhoni.setPriority(Thread.MAX_PRIORITY);
		dhoni.start();
		try {
			dhoni.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		rohit.start();
		try {
			rohit.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		virat.start();
		try {
			virat.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
