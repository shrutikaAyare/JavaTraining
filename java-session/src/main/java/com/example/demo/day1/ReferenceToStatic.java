package com.example.demo.day1;


interface SayableReftoStatic{  
    void say();  
}  

public class ReferenceToStatic {

	 public static void saySomething(){  
	        System.out.println("shrutika executing static reference method");  
	    }  
	    public static void main(String[] args) {  
	         
	    	SayableReftoStatic sayable = ReferenceToStatic::saySomething;  
	       
	        sayable.say();  
	    }  

}
