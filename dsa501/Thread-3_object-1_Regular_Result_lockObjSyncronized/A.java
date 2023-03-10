package jyani.hoshiyar.problem5;

public class A extends Thread {

	static Object lock = new Object(); // lock object to synchronize threads

	String name;

	public A(String name) {
		this.name = name;
	}

	public void run() {
		sayHello();
	}

	public void sayHello() {
		synchronized (lock) {
			System.out.print("Welcome : ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}

	public static void main(String[] args) {

		A obj = new A("Hoshiyar");
		
		Thread T1 = new Thread(obj);
		Thread T2 = new Thread(obj);
		Thread T3 = new Thread(obj);

		T1.start();
		T2.start();
		T3.start();
	}

}
