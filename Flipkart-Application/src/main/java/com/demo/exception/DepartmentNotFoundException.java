package com.demo.exception;

public class DepartmentNotFoundException extends RuntimeException {

	DepartmentNotFoundException (String exceptionmessage){
		super(String.format(" your department not found"+exceptionmessage));
	}


}
