package com.problem4;

public class Common {
   int n = 0;
   int count = 0;
   boolean flag = false;
   
   synchronized public void genNumber() {
	   for(int i = 1; i<=5;i++) {
		   n = (int) (Math.random()*6);
		   System.out.println("Producer Produced: "+n);
		   flag = true;
		   notify();
		   if(i==5) {
			   break;
		   }
		   try {
			Thread.sleep(1000);
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		   
	   }
   } 
   
   synchronized public void printSum() {
	   while(true) {
		   int sum = 0;
		   for(int i = 0;i<=n;i++) {
			   sum+=i;
		   }
		   System.out.println("Consumer Calculated Sum is: "+sum);
		   count++;
		   if(count==5) {
			   break;
		   }
		   flag =false;
		   notify();
		   try {
			Thread.sleep(1000);
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	   }
   }
   
   
}
