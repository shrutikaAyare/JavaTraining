package com.example.demo.day1;


@FunctionalInterface  //It is optional  
interface Drawable{  
    public void draw();  
}  

public class drawableDemo {
	
	 public static void main(String[] args) {  
	        int width=10;  
	          
	        //with lambda  
	        Drawable d2=()->{  
	        	System.out.println("Shrutika is saying.....!");  
	        };  
	        d2.draw();  
	    }  

}
