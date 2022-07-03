package com.example.demo.day30_06;
  
import java.util.*;  

/**
 * 
 * @author ShrutikaAyare
 * It allows us to produce a single result from a sequence of elements by repeatedly applying a combining 
 * operation to the elements in the sequence called reducing.
 *
 */
   
class ReduceDemo {   
  
  public static void main(String[] args)   
  {   
       
      List<String> javaTpointStudents = Arrays.asList("Emma Watson", "Paul Walker", "Leesa",   
                                         "James", "Lilly","Shrutika kiran Ayare");   
      // The reduce() method takes the lambda expression that take two string type values and returns a longer string  
      //The Optional data is returned as a result from the reduce() method because the list can be emplty on which reduce() method is called.  
      Optional<String> newString = javaTpointStudents.stream().reduce((firstName, secondName)-> firstName.length() > secondName.length()? firstName : secondName);   
      
      newString.ifPresent(System.out::println);   
  }   
}  