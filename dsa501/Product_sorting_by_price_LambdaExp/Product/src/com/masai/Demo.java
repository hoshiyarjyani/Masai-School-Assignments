package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(1,"Laptop",15,62000));
		products.add(new Product(2,"Freedge",15,35000));
		products.add(new Product(3,"LED",15,25000));
		products.add(new Product(4,"Mobile",15,15000));
		products.add(new Product(5,"Bike",15,182000));
       Collections.sort(products,(a,b)->b.getPrice()-a.getPrice());
       System.out.println(products);
	}

}
