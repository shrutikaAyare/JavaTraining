package com.demo.service;

import java.util.List;

import com.demo.entity.Department;

public interface DepartmentService {
	
	Department createDepartment(Department department) ;

	void updatedDepartmentById(Department department,long id) ;

	Department getDepartmentById(long id);

	List<Department> getListOfDepartment();

	void deleteDepartmentById(long id);

	void deleteAllDepartmentList();
	
	Department searchDepartmentByName(String name) ;
	
	

	//Integer Otplogin(int number);

}
