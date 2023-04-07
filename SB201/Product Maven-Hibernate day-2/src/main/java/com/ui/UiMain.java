package com.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dto.Products;

public class UiMain {
  public static void main(String[] args) {
	  EntityManagerFactory emf= Persistence.createEntityManagerFactory("products");
	  EntityManager em = emf.createEntityManager();
	  
	  //1. we want to find a product here , this is DRL statement so we not need to start the transiction
	   Products pro = em.find(Products.class, 3);
	  if(pro!=null) {
		  System.out.println(pro);
	  }else {
		  System.out.println("Product is not found");
	  }
	  
	  //2. we want to add a product in the database now we need to start transiction and commit transiction
	  Products p6 = new Products(15,"Product15",10,200);
	// this is transiction area where we can add remove update the products  
	em.getTransaction().begin();
	
	em.persist(p6);
	
	em.getTransaction().commit();
	System.out.println("Product Added Sucessfully");
	//em.close(); // this is for the close the connection
	
	
	
	
	
	//3. Now we are remove a product from database

	Scanner sc = new Scanner(System.in);
	System.out.println("Write the ID of product that you want to remove");
	int id  = sc.nextInt();
	em.getTransaction().begin();
	// first we find the product is present or not
	Products product = em.find(Products.class, id);
	if(product!=null) {
		// at this time we an say that product is present in our database
		em.remove(product);
		System.out.println("Product whos id is "+id+" is removed sucessfully");
	}else {
		System.out.println("Product is not present in database whose id is "+id);
	}
	em.getTransaction().commit();
	//em.close();
	  
	  
	  //4. Now we are write logic for update the product for that we can use merge and in transiction area we can set the value of product
	
	System.out.println("Write the id of product that you want to update");
	
	int n = sc.nextInt();
	
	// here we are find the product so not need to start  transiction because it is DRL statement
	
	Products prod = em.find(Products.class, n);
	
	if(prod!=null) {
		 em.getTransaction().begin();
		 prod.setPrice(prod.getPrice()+5000);
		 em.getTransaction().commit();
		 System.out.println("Product price update sucessfully");
		// em.close();
	}else {
		System.out.println("Product not found whose id is "+n);
	}
	
	// now we are doing update with help of merge method
	
	
	
	System.out.println("Write the id of product that you want to update using Merge method");
	
	int m = sc.nextInt();
	
	// here we are find the product so not need to start  transiction because it is DRL statement
	
	Products prodc = em.find(Products.class, m);
	
	if(prodc!=null) {
		 em.getTransaction().begin();
		 prodc.setPrice(prodc.getPrice()+33300);
		 em.merge(prodc);
		 em.getTransaction().commit();
		 System.out.println("Product price update sucessfully");
		// em.close();
	}else {
		System.out.println("Product not found whose id is "+m);
	}
	
	
	
	  
}
}
