package com.problem3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
//Ramesh is selling spices in market and he has just 5 different spices
//(salt sold in 1kg packing for 30.00/-, turmeric sold in 100gm packing for 35.00/-, 
//cumin sold in 100gm packing for 40.00/-, cinnamon sold in 25gm packing for 70.00/-,
//mace sold in 10gm packing for 25.00/-) in his stock. He used to visit store
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

public class Spice implements Serializable {
	String name;
	double price;

	public Spice(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public static void main(String[] args) {
		ArrayList<Spice> spices = new ArrayList<>();
		spices.add(new Spice("salt", 30.00));
		spices.add(new Spice("turmeric", 35.00));
		spices.add(new Spice("cinnamon", 70.00));
		spices.add(new Spice("mace", 25.00));

		try {
			FileOutputStream fos = new FileOutputStream("spices.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(spices);
			fos.close();
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Sucessfully Bill List Sent to all StoreKeepers");
	}

}
