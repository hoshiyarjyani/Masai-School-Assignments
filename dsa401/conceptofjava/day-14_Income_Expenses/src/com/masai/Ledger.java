package com.masai;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ledger {
	private List <Entry> incomeEntries;
	private List <Entry> expenseEntries;
	
public Ledger() {
	incomeEntries = new ArrayList<>();
	expenseEntries = new ArrayList<>();
	}
public void addExpense(Entry expeEntry) {
	if(expeEntry != null) {
		expenseEntries.add(expeEntry);
	}
}
public void addIncome(Entry incomeEntry) {
	if(incomeEntries != null) {
		incomeEntries.add(incomeEntry);
	}
}
public double getTotalExpenses() {
	double total = 0.0;
	
	for(Entry entry : expenseEntries) {
		total += entry.getAmount();
	}
	 
	return total;
}

public double getTotalIncome(){
double total = 0.0;

	for(Entry entry : incomeEntries) {
		total += entry.getAmount();
	}
	return total;
}
public String getRemarkOnFinHealth() {
	double totalIncome = getTotalIncome();
	double totalExpense = getTotalExpenses();
	if(totalExpense<=0.7*totalIncome) {
		return "Your financial health is good";
	}else if(totalExpense<=totalExpense) {
		return "You need to increase the saving";
	}else {
		return "You need to manage expenses well also try to increase income";
	}
}

public List<Entry> getHighestLowestExpenseIncomeEntries(){
	List<Entry> list = new ArrayList<>();
	list.add(Collections.max(expenseEntries,new SortByAmount()));
	list.add(Collections.min(expenseEntries,new SortByAmount()));
	list.add(Collections.max(incomeEntries,new SortByAmount()));
	list.add(Collections.min(incomeEntries,new SortByAmount()));
	
	return list;
}

public List<Entry> getIncomeByDateRange(LocalDate startDate, LocalDate endDate){
	List <Entry> incomeList = new ArrayList<>();
	for(Entry entry : incomeEntries) {
		LocalDate incomeDate = entry.getDate();
		boolean isInRange = incomeDate.isAfter(startDate.minusDays(1)) && incomeDate.isBefore(endDate.plusDays(1));
	if(isInRange) {
		incomeList.add(entry);
	 }
	}
	return incomeList;
}

public void deleteExpensesExcludingAmountRange(double from, double to) {
	for(int i = 0; i<expenseEntries.size();i++) {
		if(expenseEntries.get(i).getAmount()<from || expenseEntries.get(i).getAmount()>to ) {
			int index = i;
			expenseEntries.remove(i);
			 i=index-1;
		}
	}
}

@Override
public String toString() {
	List<Entry> grossList = new ArrayList<>();
	grossList.addAll(expenseEntries);
	grossList.addAll(incomeEntries);
	
	Collections.sort(grossList, new SortByDate());
	
	StringBuilder sb = new StringBuilder();
	for(Entry entry : grossList) {
		sb.append(entry+"\n");
	}
	sb.append("GrandTotal \t\t"+(getTotalIncome()-getTotalExpenses()));
   
	return sb.toString();
}
}
