package com.example.demo.utils;

import java.util.Objects;

public class Person {
	private String name;
	private Long salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public Person(String name, Long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	

}
