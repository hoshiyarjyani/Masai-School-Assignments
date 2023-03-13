package com.problem3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

//Ramesh is selling spices in market and he has just 5 different spices
//(salt sold in 1kg packing for 30.00/-, turmeric sold in 100gm packing for 35.00/-, 
//cumin sold in 100gm packing for 40.00/-, cinnamon sold in 25gm packing for 70.00/-,
// mace sold in 10gm packing for 25.00/-) in his stock. He used to visit store
//to store to sell the products. He takes help of a java developer (say Raman) share 
//price list of product with multiple storekeeper.
//
//Raman uses serialization to store spice name and price in a file named spices.ser.
//Write code to perform the serialization on behalf of Raman.
//
//At selling point (that is store). The store keeper should enter spice names and number 
//of packets for each spice then his final billing amount will be displayed to him. To get price 
//of the spice The file spices.ser file must be deserialiezed. Write code to fulfill
//this demand also on behalf of Raman.
public class DeSerDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		ArrayList<Spice> spices = null;
		try {
			FileInputStream fis = new FileInputStream("spices.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			spices = (ArrayList<Spice>) ois.readObject();
			fis.close();
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		Scanner sc = new Scanner(System.in);
		double TotelBill = 0;

		System.out.println(
				"Tell the Spice Name then Number of Packet of respective Spice if you want Stop then write 'stop'");
		while (true) {
			String nameOfSpice = sc.next();
			if (nameOfSpice.equals("stop")) {
				break;
			}
			System.out.println("Enter Number of Quantity of " + nameOfSpice);
			int num = sc.nextInt();
			sc.nextLine();

			double price = 0.0;
			for (Spice x : spices) {
				if (x.getName().equalsIgnoreCase(nameOfSpice)) {
					price = x.getPrice();
					break;
				}
			}
			double bill = num * price;
			System.out.println("Bill of " + num + " packets of " + nameOfSpice + " is ₹" + bill);
			TotelBill += bill;
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Enter Next Product Name Otherwise Enter 'stop' if you want genrate the Totel Bill");

		}
		System.out.println("Totel Amount of all items = " + TotelBill + " ₹ \n Thanks For Buying Products.");

	}
}
