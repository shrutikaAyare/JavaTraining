package com.demo.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Department;
import com.demo.repository.DepartmentRepository;
import com.demo.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired DepartmentRepository departmentRepository;

	@Override
	public Department createDepartment(Department department) {
		Department d = departmentRepository.save(department);
		return d;
	}

	@Override
	public Department getDepartmentById(long id) {
		Department d = departmentRepository.findById(id).get();
		return d;
	}

	@Override
	public List<Department> getListOfDepartment() {
		List<Department> deptList = departmentRepository.findAll();
		return deptList;
	}


	@Override
	public void updatedDepartmentById(Department department, long id) {
		Department deptToUpdate = departmentRepository.findById(id).get();
		deptToUpdate.setDepartment_Name(department.getDepartment_Name());
		deptToUpdate.setCategory(department.getCategory());
		departmentRepository.save(deptToUpdate);
	}


	@Override
	public void deleteDepartmentById(long id) {
		departmentRepository.deleteById(id);
	}

	@Override
	public void deleteAllDepartmentList() {
		departmentRepository.deleteAll();
	}

	@Override
	public Department searchDepartmentByName(String name) {
		Department d = departmentRepository.getDepartmentByName(name);
		return d;
	}
}
