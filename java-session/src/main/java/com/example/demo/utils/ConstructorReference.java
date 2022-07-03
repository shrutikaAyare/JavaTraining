package com.example.demo.utils;

interface Messaging {
    Person getPerson(String pName,Long sal);
}
 
public class ConstructorReference {
 
    public static void main(String[] args) {
      Messaging messaging = Person::new;
      System.out.println(messaging.getPerson("shrutika ayare",1000000l));
    }
 
}
