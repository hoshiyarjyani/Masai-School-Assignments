package com.masai;

import java.util.Comparator;

public class SortByDate implements Comparator<Entry>{

	@Override
	public int compare(Entry entry1, Entry entry2) {
		// TODO Auto-generated method stub
		return entry1.getDate().compareTo(entry2.getDate());
			
		}
	}


