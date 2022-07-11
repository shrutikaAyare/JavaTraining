package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long>{

	@Query(value="SELECT * FROM department WHERE department_name = ?1", nativeQuery=true)
	Department getDepartmentByName(String name);

}
