package com.example.demo.day30_06;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class MinMaxDemo {

	
	public static void main(String[] args)
	{
		String[] dataArray = {"nhja", "zebra", "apple", "parax",
				"GeeksQuiz","zerox" };
		
		List<String> dataList = Arrays.asList("abc", "apple", "banana", "mango",
                "grapes", "Anjir");
		
		//----------------------Min Function---------------

		// The Comparator compares the strings
		// based on their last characters and returns
		// the minimum value accordingly.
		Optional<String> MIN = Arrays.stream(dataArray).min((str1, str2) -> 
		Character.compare(str1.charAt(str1.length() - 1), 
				str2.charAt(str2.length() - 1)));
	
		if (MIN.isPresent()) 
			System.out.println(MIN.get()); 
		else
			System.out.println("-1"); 
		
		//---------------------------Max Function---------------

		Optional<String> MAX = Arrays.stream(dataArray).max((str1, str2) ->  
		Character.compare(str1.charAt(str1.length() - 1), 
				str2.charAt(str2.length() - 1)));

		if (MAX.isPresent()) 
			System.out.println(MAX.get());        
		else 
			System.out.println("-1");    
		
		//----------------------Count function----------------------
		long total = dataList.stream().distinct().count();
		  
        // Displaying the number of elements
        System.out.println(total);
	}


}
