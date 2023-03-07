//1. **Create a Multithreaded application to start 3 threads :**
//- **Salman Thread**
//- **Hritik Thread**
//- **Akshay Thread should be the main thread**
//
//**Salman thread will print the sum of the first 10 number**
//
//**Hritik thread will print the multiplication of the first 10 number**
//
//**Akshay thread will print its name 10 times.**
//
//***Tip: Use Runnable interface to implement the same. use join() 
//method to make sure that main thread must finish after all child threads.***
package jyani.hoshiyar.problem1;

class Akshay implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " Thread");
		}

	}
	
	public static void main(String[] args) {
		
	   Thread t1 = new Thread(new Salman());
	   Thread t2 = new Thread(new Hritik());
	   Thread t3 = new Thread(new Akshay(),"Akshay");
	   t1.start();
	   try {
		t1.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   t2.start();
	   try {
		t2.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   t3.start();
	}
	

}