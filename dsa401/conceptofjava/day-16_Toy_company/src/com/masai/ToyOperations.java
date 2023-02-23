package com.masai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToyOperations {
	Map<String, Toy> map = new TreeMap<>();

	private void isToyNumberValid(String toyNumber) throws InvalidToyNumberException, ToyCompanyNotFoundException {
		String toyNumberFormate = "[A-Z]{3}\\d{3}";
		Pattern pattern = Pattern.compile(toyNumberFormate);
		Matcher matcher = pattern.matcher(toyNumber);

		if (!matcher.matches()) {
			throw new InvalidToyNumberException("Invalid Toy Number, not according to format");
		}

		String companyCode = toyNumber.substring(0, 3);
		if (!CompanyNameCode.companyCode.containsKey(companyCode)) {
			throw new ToyCompanyNotFoundException("No Company exists for this toy");
		}
	}

	public boolean addToy(String toyNumber, String toyName, Double price, String category)
			throws InvalidToyNumberException, ToyCompanyNotFoundException {
		isToyNumberValid(toyNumber);
		Toy toy = new Toy(toyNumber, toyName, price, category);
		if (map.containsKey(toyNumber)) {
			return false;
		} else {
			map.put(toyNumber, toy);
			return true;
		}
	}

	public List<String> getToysListToDisplay() throws NoToyException {
		if (map.isEmpty()) {
			throw new NoToyException("no toy in the store");
		}
		List<String> list = new ArrayList<>();
		for (Map.Entry<String, Toy> me : map.entrySet()) {
			list.add(me.getValue().toString());
		}
		return list;
	}

	public Toy getToyByToyNumber(String toyNumber)
			throws InvalidToyNumberException, ToyCompanyNotFoundException, NoToyException {
		if (!map.containsKey(toyNumber)) {
			throw new NoToyException("no toy for this toy nuber");
		}
		return map.get(toyNumber);
	}

	public List<String> getToyListSortedByPrice() throws NoToyException {
		List<String> list = new ArrayList<>();
		if (map.isEmpty()) {
			throw new NoToyException("no toy in store");
		}
		Collection<Toy> collection = map.values();
		List<Toy> toyList = new ArrayList<>(collection);
		Collections.sort(toyList, new SortToyByPrice());
		for (Toy toy : toyList) {
			list.add(toy.toString());
		}
		return list;
	}

	public List<String> getToyListForGivenPriceRange(Double start, Double end) throws NoToyException {
		if (map.isEmpty()) {
			throw new NoToyException("no toy in store");
		}
		Set<Toy> set = new TreeSet<>(new SortToyByCategoryNamePriceToyNumber());
		Collection<Toy> collection = map.values();
		for (Toy toy : collection) {
			if (toy.getPrice() >= start && toy.getPrice() <= end) {
				set.add(toy);
			}
		}
		if (set.isEmpty()) {
			throw new NoToyException("no toy in the given range");
		}
		List<String> list = new ArrayList<>();
		for (Toy toy : set) {
			list.add(toy.toString());
		}
		return list;
	}

}
