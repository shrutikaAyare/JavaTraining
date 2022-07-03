package com.example.demo.utils;

import com.example.demo.utils.DemoInterface;

public class sampleInterface implements DemoInterface{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sampleInterface s = new sampleInterface();
		//String result=DemoInterface.producer(); //if method in interfafce is static
		String result= s.producer();				//if method in interface is default then we have to instantiate class
		//String another = DemoInterface.greeting();
		String another = s.greeting();
		System.out.println("Final Result : "+another);

	}
}
