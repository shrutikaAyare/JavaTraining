package com.demo.exception;

public class ProductNotFoundException extends RuntimeException {

	ProductNotFoundException (String exceptionmessage){
		super(String.format(" your product not found"+exceptionmessage));
	}


}


