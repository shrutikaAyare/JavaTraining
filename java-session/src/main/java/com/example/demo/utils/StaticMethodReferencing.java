package com.example.demo.utils;

public class StaticMethodReferencing {

	  public static void saySomething() {
	        System.out.println("Good Morning");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Messageable messageable = StaticMethodReferencing::saySomething;
		messageable.msg();
	}

}


