package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Department;
import com.demo.repository.DepartmentRepository;
import com.demo.entity.Department;
import com.demo.service.DepartmentService;


@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService DepartmentService;

	@PostMapping(value = "/addDepartment")
	Department addDepartment(@RequestBody Department dept) {
		Department d = DepartmentService.createDepartment(dept);
		return d;
	}
	
	@GetMapping(value="/getlistofDepartments") 
	List<Department> getListOfDepartments(){   //throws ProductNotfoundException{

		List<Department> resutedlist = DepartmentService.getListOfDepartment();
		return resutedlist;

	}
	
	@GetMapping(value="/getDepartmentbyid/{id}") 
	Department getDepartmentById(@PathVariable long id) {// throws ProductNotfoundException{
		Department d = DepartmentService.getDepartmentById(id);
		return d;
	}
	

	@PutMapping(value="/updateDepartmentById/{id}") 
	public String updateDepartmentById(@RequestBody Department department, @PathVariable long id) {// throws ProductNotfoundException{

		DepartmentService.updatedDepartmentById(department, id);
		return "Department updated successfully";
	}
	
	@DeleteMapping(value="/deleteDepartmentById/{id}") 
	public String deleteDepartmentById( @PathVariable long id) {// throws ProductNotfoundException{

		DepartmentService.deleteDepartmentById(id);
		return "deleted the Department successfully";
	}
	
	@DeleteMapping(value="/deleteAllDepartments") 
	public String deleteAllDepartments() {// throws ProductNotfoundException{

		DepartmentService.deleteAllDepartmentList();
		return "deleted all the Departments successfully";
	}
	
	@GetMapping(value="/getDepartmentByName/{name}") 
	Department getDepartmentByName(@PathVariable String name) {// throws ProductNotfoundException{
		Department d = DepartmentService.searchDepartmentByName(name);
		return d;
	}

}
