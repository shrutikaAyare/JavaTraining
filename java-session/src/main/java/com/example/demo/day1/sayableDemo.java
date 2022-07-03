package com.example.demo.day1;

interface Sayable{
	public String say();
}


public class sayableDemo {
	
	public static void main(String args[]) {
		Sayable s = () ->{
			return "shrutika";
		};
		
		 System.out.println(s.say());  
	}

}
