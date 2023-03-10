package jyani.hoshiyar.problem1;

public class Main {
	public static void main(String[] args) {
		Thread1 T1 = new Thread1();
		Thread2 T2 = new Thread2();

		T1.start();
		try {
			T1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		T2.start();
		try {
			T2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Thread1 extends Thread {
	public void run() {
		for (int i = 2; i <= 20; i += 2) {
			System.out.print(i + " ");
		}
	}
}

class Thread2 extends Thread {
	public void run() {
		for (int i = 1; i <= 20; i += 2) {
			System.out.print(i + " ");
		}
	}
}