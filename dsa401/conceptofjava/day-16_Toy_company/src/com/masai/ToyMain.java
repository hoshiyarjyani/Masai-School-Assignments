package com.masai;

import java.util.List;

public class ToyMain {
	 public static void main(String[] args) {
		    //Create object of ToyOperation class
		    ToyOperations toyOperations = new ToyOperations();
		    try {
		      List<String> list = toyOperations.getToysListToDisplay();
		    }catch(NoToyException ex) {
		      System.out.println(ex.getMessage());
		    }
		    try {
		      toyOperations.addToy("EKP001", "Barbie Doll", 1299.00, "Animal");      
		      toyOperations.addToy("EXP002", "Hoop Rolling", 399.00, "Spinning Toys");
		      toyOperations.addToy("TZN003", "Camel on Bike", 599.00, "Animals");
		      toyOperations.addToy("TZN004", "Monkey in Bike", 799.00, "Animals");
		      toyOperations.addToy("SLD005", "DDLJ Doll", 499.00, "Dolls");
		      toyOperations.addToy("NKT006", "Pingy Piano", 499.00, "Wooden Toys");
		      toyOperations.addToy("FSK007", "Bike Rider", 1299.00, "Spinning Toys");
		      toyOperations.addToy("NKT008", "Snack-Ladder", 399.00, "Wooden Toy");
		      System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		      toyOperations.addToy("ABC009", "Business", 199.00, "Spinning Toys");
		    }catch(InvalidToyNumberException | ToyCompanyNotFoundException ex) {
		      System.out.println(ex.getMessage());
		      System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		    }
		    
		    try {
		      toyOperations.addToy("A0B0C9", "Business", 199.00, "Spinning Toys");
		    }catch(InvalidToyNumberException | ToyCompanyNotFoundException exp) {
		      System.out.println(exp.getMessage());
		    }
		    
		    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		    
		    try{
		      List<String> list = toyOperations.getToysListToDisplay();
		      System.out.println("Toy Number\tToy Name\t\tPrice\t\tCategory");
		      for(String toy: list)
		        System.out.println(toy);
		    }catch(NoToyException ex) {}
		    
		    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		    
		    try {
		      Toy toy = toyOperations.getToyByToyNumber("NKT008");
		      System.out.println("Toy Number\tToy Name\t\tPrice\t\tCategory");
		      System.out.println(toy);
		      toy = toyOperations.getToyByToyNumber("NKT010");
		    }catch(Exception ex) {
		      System.out.println(ex.getMessage());
		    }
		    
		    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		    try{
		      List<String> list = toyOperations.getToyListSortedByPrice();
		      System.out.println("Toy Number\tToy Name\t\tPrice\t\tCategory");
		      for(String toy: list)
		        System.out.println(toy);
		    }catch(NoToyException ex) {
		      System.out.println(ex.getMessage());
		    }
		    
		    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		    try{
		      List<String> list = toyOperations.getToyListForGivenPriceRange(599.00, 1299.00);
		      System.out.println("Toy Number\tToy Name\t\tPrice\t\tCategory");
		      for(String toy: list)
		        System.out.println(toy);
		      System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		      list = toyOperations.getToyListForGivenPriceRange(1300.00, 1500.00);
		    }catch(NoToyException ex) {
		      System.out.println(ex.getMessage());
		    }
		  }
}
