package com.example.demo.day30_06;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
	
		List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hocky");  
        System.out.println("------------Iterating by using lamba expression ---------------");  
       gamesList.forEach(games -> System.out.println(games));
       
       System.out.println("------------Iterating by passing method reference---------------");  
       gamesList.forEach(System.out::println);
       

	}

}
