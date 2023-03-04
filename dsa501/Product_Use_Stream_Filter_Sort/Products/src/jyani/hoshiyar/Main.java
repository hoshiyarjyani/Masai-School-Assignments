package jyani.hoshiyar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Note: for filtering and printing and sorting make use of Stream or Lambda
 
public class Main {
	public static void main(String[] args) {
		//1. Create a List of 5 product objects.
       Product p1 = new Product(1,"Mobile",15000,15);
       Product p2 = new Product(2,"TV",35000,7);
       Product p3 = new Product(3,"Washing Machine",9000,5);
       Product p4 = new Product(4,"LED",80000,25);
       Product p5 = new Product(5,"Laptop",65000,15);
       List<Product> list = Arrays.asList(p1,p2,p3,p4,p5);
       System.out.println(list);
     //2. From the product list filter the products whose quantity is more than 10 in a separate List of Products.
       System.out.println("======Filtered List by Quantity=======");
       List<Product> filteredList = list.stream().filter(p -> p.getQuantity() > 10).toList();
       filteredList.forEach(System.out::println);
       
     //3. Sort the Filtered List of Products by the price in ascending order.
       System.out.println("======Sorted by quantity and Filtered List by Price =======");
       List<Product> filterAndSortedList = filteredList.stream().sorted((a,b)-> Integer.compare(a.getPrice(), b.getPrice())).toList();
       filterAndSortedList.forEach(System.out::println);
	}
}
