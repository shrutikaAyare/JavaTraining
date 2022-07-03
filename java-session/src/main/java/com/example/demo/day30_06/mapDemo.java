package com.example.demo.day30_06;

import java.util.Arrays;
import java.util.List;

//Stream map(Function mapper) returns a stream consisting of the results of 
//applying the given function to the elements of this stream.


class mapDemo {
  
    public static void main(String[] args)
    {
  
        System.out.println("The stream after applying "
                           + "the function is : ");
  
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
  
        list.stream().map(number -> number * 3).forEach(System.out::println);
    }
}
