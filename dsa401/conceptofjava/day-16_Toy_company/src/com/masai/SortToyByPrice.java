package com.masai;

import java.util.Comparator;

public class SortToyByPrice implements Comparator<Toy> {

	@Override
	public int compare(Toy o1, Toy o2) {
		if (o1.getPrice() > o2.getPrice()) {
			return 1;
		} else if (o1.getPrice() < o2.getPrice()) {
			return -1;
		} else {
			return 0;
		}
	}

}
