package com.masai;

import java.util.Comparator;

public class SortToyByCategoryNamePriceToyNumber implements Comparator<Toy> {

	@Override
	public int compare(Toy o1, Toy o2){
		int byCat = o1.getCategory().compareTo(o2.getCategory());
		if(byCat !=0){
			return byCat;
		}
		int byName = o1.getToyName().compareTo(o2.getToyName());
		if(byName !=0){
			return byCat;
		}
		if(o1.getPrice()>o2.getPrice()) {
			return 1;
		}else if(o1.getPrice()<o2.getPrice()) {
			return -1;
		}else {
			return o1.getToyNumber().compareTo(o2.getToyNumber());
		}
	}

	
}
