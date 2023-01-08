package com.masai.day10;

public class BusinessPeople implements Taxation{
	//write code here
	private double totalSale;
    private double totalPurchase;
    private double operatingExpenses;

    public BusinessPeople(double totalSale, double totalPurchase, double operatingExpenses) {
        this.totalSale = totalSale;
        this.totalPurchase = totalPurchase;
        this.operatingExpenses = operatingExpenses;
      }

      @Override
      public double calculateTax() {
        double netProfit = totalSale - (totalPurchase + operatingExpenses);
        double tax = 0;
        if (netProfit <= 500000) {
          tax = 0;
        } else if (netProfit <= 1500000) {
          tax = (netProfit - 500000) * 0.1;
        } else if (netProfit <= 5000000) {
          tax = 100000 + (netProfit - 1500000) * 0.22;
        } else {
          tax = 267000 + (netProfit - 5000000) * 0.32;
          if (netProfit > 50000000) {
            tax += 125000;
          }
        }
        return tax;
      }
}