package jyani.hoshiyar.problem2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// using method reference to implement Runnable interface
		Runnable r1 = ThreadOperations::reverseArray;
		ThreadOperations t1 = new ThreadOperations();
		Runnable r2 = t1::findNearestToAverage;

		// using method reference to implement RunThread interface
		RunThread rt1 = Thread::start;

		// creating a list of threads containing two threads
		List<Thread> threads = new ArrayList<>();
		threads.add(new Thread(r1));
		threads.add(new Thread(r2));

		// executing both threads and observing the output
		threads.forEach(rt1::startThread);

		// using sleep method to make sure that main thread finishes at last
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End of Main Thread");
	}
}
