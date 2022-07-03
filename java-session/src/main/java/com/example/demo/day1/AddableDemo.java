package com.example.demo.day1;


interface Addable{
	int add(int a, int b);
}

public class AddableDemo {

	public static void main(String[] args) {
		
		Addable a = (int c, int d)->{
			return (c+d);
		};
		
		 System.out.println(a.add(100,200));  

		 Addable ad1=(x,y)->(x+y);  
	    System.out.println(ad1.add(10,20));  
	}

}
