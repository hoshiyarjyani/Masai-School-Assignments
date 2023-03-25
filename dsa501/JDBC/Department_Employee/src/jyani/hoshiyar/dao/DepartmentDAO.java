package jyani.hoshiyar.dao;

import java.util.List;

import jyani.hoshiyar.dto.Department;
import jyani.hoshiyar.dto.DepartmentImpl;
import jyani.hoshiyar.exception.NoRecordFoundException;
import jyani.hoshiyar.exception.SomethingWentWrongException;

public interface DepartmentDAO {
	void AddDepartment(Department dept) throws SomethingWentWrongException;
	void DeleteDepartmentByDidUI(String did) throws SomethingWentWrongException;
	public List<DepartmentImpl> PrintDepartmentByEmployeeLocationUI()
			throws SomethingWentWrongException, NoRecordFoundException ;
}




