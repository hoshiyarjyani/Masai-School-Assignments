package com.masai;

import java.util.Comparator;

public class SortByAmount implements Comparator<Entry>{

	@Override
	public int compare(Entry o1, Entry o2) {
		// TODO Auto-generated method stub
		if(o1.getAmount()>o2.getAmount()) {
			return 1;
		}else if(o1.getAmount()<o2.getAmount()) {
			return -1;
		}else {
			return 0;
		}
	}

}
