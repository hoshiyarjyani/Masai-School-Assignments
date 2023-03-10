package jyani.hoshiyar.problem2;

public class Main {
	public static void main(String[] args) {
		Object lock = new Object(); // shared object for synchronization

		Salman T1 = new Salman(lock);
		Hritik T2 = new Hritik(lock);

		T1.start();
		T2.start();
	}
}

class Salman extends Thread {
	Object lock;

	Salman(Object lock) {
		this.lock = lock;
	}

	public void run() {
		synchronized (lock) {
			for (int i = 0; i <= 20; i += 2) {
				System.out.print(i + " ");
				lock.notify();
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Hritik extends Thread {
	Object lock;

	Hritik(Object lock) {
		this.lock = lock;
	}

	public void run() {
		synchronized (lock) {
			for (int i = 1; i <= 20; i += 2) {
				System.out.print(i + " ");
				lock.notify();
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
