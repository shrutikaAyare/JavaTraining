package com.example.demo.day1;

interface Sayableref{  
    void say();  
}  
public class InstanceMethodReference {  
    public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
    public static void main(String[] args) {  
        InstanceMethodReference methodReference = new InstanceMethodReference(); 
        Sayableref sayable = methodReference::saySomething;  
       
            sayable.say();  
          
            Sayableref sayable2 = new InstanceMethodReference()::saySomething; 
          
            sayable2.say();  
    }  
}  