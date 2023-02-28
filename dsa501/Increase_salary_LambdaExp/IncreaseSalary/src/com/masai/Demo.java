package com.masai;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Hoshiyar Singh", "Jaipur",9000));
        list.add(new Employee(2, "Ramesh Kumar", "Kolkata",8500));
        list.add(new Employee(3, "Rahul Singh", "Jaipur",8000));
        list.add(new Employee(4, "Rohan Singh", "Mumbai",4000));
        list.add(new Employee(5, "Raju", "Jaipur",2000));
        list.add(new Employee(6, "Mohan", "Jaipur",1000));
        list.add(new Employee(7, "Ravi", "Delhi",1500));
        list.add(new Employee(8, "Mamta", "Jaipur",7000));
        list.add(new Employee(9, "pinky", "pune",3000));
        list.add(new Employee(10, "Riya", "Goa",9900));
        list.forEach(employee -> {
            if(employee.getSalary()<5000) {
                employee.setSalary(employee.getSalary()+1000);
            } 
        });
        System.out.println(list);
	}

}
