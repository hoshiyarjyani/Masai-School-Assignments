package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HashingDemo {
	public static Map<Character, List<String>> addName(String names[]) {
		Map<Character, List<String>> map = new TreeMap<>();
		for (int i = 0; i < names.length; i++) {
			if (!map.containsKey(names[i].charAt(0))) {
				List<String> list = new ArrayList<>();
				list.add(names[i]);
				map.put(names[i].charAt(0), list);
			} else {
				List<String> newlist = map.get(names[i].charAt(0));
				newlist.add(names[i]);
				map.put(names[i].charAt(0), newlist);
			}
		}
		return map;

	}

	public static void display(Map<Character, List<String>> map) {
		for (Map.Entry<Character, List<String>> m : map.entrySet()) {
			List<String> arr = m.getValue();
			System.out.println(m.getKey() + ":" + String.join(",", arr));
		}
	}

	public static boolean searchName(Map<Character, List<String>> map, String name) {
		if (!map.containsKey(name.charAt(0))) {
			return false;
		} else {
			List<String> Arr = map.get(name.charAt(0));
			return Arr.contains(name);
		}
	}

	public static boolean removeName(Map<Character, List<String>> map, String name) {

		if (!map.containsKey(name.charAt(0))) {
			return false;
		} else {
			List<String> Arr = map.get(name.charAt(0));
			Arr.remove(name);
			if (Arr.isEmpty()) {
				map.remove(name.charAt(0));
			}
			return true;
		}

	}

	public static void main(String[] args) {
		String names[] = { "Naya", "Ishaan", "Jai", "Inaya", "Amar", "Navi", "Dhruv", "Kanan", "Diya", "Shyla",
				"Agastya", "Ananya", "Nila", "Tenzin", "Tamia", "Shaan", "Ajay", "Jaya", "Anjali", "Aditi", "Reva",
				"Sahil", "Darsh", "Aja", "Ambar", "Deven", "Ishani", "Kavi", "Marjane", "Jasleen", "Ashwin", "Aadhira",
				"Candy", "Kum", "Salina", "Artha", "Raghav", "Avan", "Sitara", "Shylah", "Divya", "Varun", "Sona",
				"Shaila", "Kimaya", "Farid", "Kashvi", "Devi", "Charu", "Mihir", "Tulsi", "Anila", "Anala", "Vivan",
				"Amitabh", "Mahika", "Sudhir", "Lata", "Anand", "Akshay" };

		Map<Character, List<String>> map = addName(names);

		System.out.println("The original map is ");
		display(map);

		System.out.println();
		if (searchName(map, "Farid")) {
			System.out.println("Name 'Farid' found in Map");
		} else {
			System.out.println("Name 'Farid' not found in Map");
		}

		System.out.println();
		if (searchName(map, "Harish")) {
			System.out.println("Name 'Harish' found in Map");
		} else {
			System.out.println("Name 'Harish' not found in Map");
		}

		System.out.println();
		if (removeName(map, "Lata")) {
			System.out.println("Name 'lata' removed from Map");
		} else {
			System.out.println("Name 'lata' not in map hence not deleted");
		}

		System.out.println();
		if (removeName(map, "Harish")) {
			System.out.println("Name 'Harish' removed from Map");
		} else {
			System.out.println("Name 'Harish' not in map hence not deleted");
		}

		System.out.println();
		display(map);
	}

}
