package com.masai.day10;

public class SalariedPeople implements Taxation{
    private double annualIncome;

	public SalariedPeople(double annualIncome) {
		super();
		this.annualIncome = annualIncome;
	}

	

	  @Override
	  public double calculateTax() {
	    double tax = 0;
	    if (annualIncome <= 250000) {
	      tax = 0;
	    } else if (annualIncome <= 500000) {
	      tax = (annualIncome - 250000) * 0.1;
	    } else if (annualIncome <= 1000000) {
	      tax = 50000 + (annualIncome - 500000) * 0.2;
	    } else {
	      tax = 125000 + (annualIncome - 1000000) * 0.3;
	      if (annualIncome > 10000000) {
	        tax += 75000;
	      }
	    }
	    return tax;
	  }
	
	
}
