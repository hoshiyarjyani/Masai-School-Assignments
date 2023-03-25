package jyani.hoshiyar.dao;

import java.util.Scanner;

import jyani.hoshiyar.dto.Department;
import jyani.hoshiyar.dto.Employee;
import jyani.hoshiyar.exception.SomethingWentWrongException;

public interface EmployeeDAO {
public void AddEmployee(Employee emp) throws SomethingWentWrongException;

}
