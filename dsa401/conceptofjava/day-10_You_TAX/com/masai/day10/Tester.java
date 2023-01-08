package com.masai.day10;

public class Tester{
public static void main(String args[]) {
Taxation taxation = null;
taxation = new SalariedPeople(1500000);
System.out.println("The total tax for this salaries person is " + taxation.calculateTax());
taxation = new BusinessPeople(27500000, 15000000, 5100000);
System.out.println("The total tax for this business person is " + taxation.calculateTax());
}
}