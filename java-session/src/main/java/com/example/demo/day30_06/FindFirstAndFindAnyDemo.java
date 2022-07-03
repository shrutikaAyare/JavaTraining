package com.example.demo.day30_06;


import java.util.*;

public class FindFirstAndFindAnyDemo {
  
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
  
        // Using Stream findAny() to return
        // an Optional describing some element
        // of the stream
        Optional<Integer> answer = list.stream().findAny();
  
        if (answer.isPresent()) {
            System.out.println(answer.get());
        }
        else {
            System.out.println("no value");
        }
        
        //----------------------findfirstDemo----------------------------------------------
        
        Optional<Integer> answer1 = list.stream().findFirst();
        
        // if the stream is empty, an empty
        // Optional is returned.
        if (answer1.isPresent()) {
            System.out.println(answer1.get());
        }
        else {
            System.out.println("no value");
        }
    }
}
