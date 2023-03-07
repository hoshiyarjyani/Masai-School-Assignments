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
class Salman implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
}