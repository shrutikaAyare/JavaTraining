package com.example.demo.day30_06;

import java.util.Arrays;
import java.util.List;

public class DistinctDemo {
	
	// Driver code
    public static void main(String[] args)
    {
  
        // Creating a list of integers
        List<Integer> list = Arrays.asList(1, 2, 6, 1, 4, 6, 5, 5);
  
        System.out.println("The distinct elements are :");
  
        // Displaying the distinct elements in the list
        // using Stream.distinct() method
        list.stream().distinct().forEach(System.out::println);
        
        System.out.println("The sorted elements are :");
        
        list.stream().sorted().forEach(System.out::println);
        
        System.out.println("Using limit function :");
        list.stream().limit(3).forEach(System.out::println);
    }

}

