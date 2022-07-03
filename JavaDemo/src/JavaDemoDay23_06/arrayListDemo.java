package JavaDemoDay23_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayListDemo {

	public static void main(String[] args) {

		ArrayList <Integer> demo = new ArrayList <Integer>();
		demo.add(10);
		demo.add(20);
		demo.add(30);
		demo.add(40);
		demo.add(50);
		demo.add(60);
		demo.add(70);
		
		//----------------------------getting size of array-------------
		System.out.println("size of arraylist is :" + demo.size());
		
		//----------------------------sorting the array----------------
		Collections.sort(demo);  
		System.out.println("After Sorting: "+ demo); 
		
		//---------------------------clone arraylist--------------
		
		ArrayList copyList = (ArrayList) demo.clone();
		
        System.out.println("Second ArrayList is: "+ copyList);
        
        //-------------------------contains method----------------
        
        boolean ans = demo.contains(30);
        
        if (ans)
            System.out.println("The list contains 30");
        else
            System.out.println("The list does not contains 30");
        
        //--------------------------Ensure Capacity--------------------------------
        
        demo.ensureCapacity(20);
        
        System.out.println("ArrayList can now" + " surely store upto"  + " 20 elements.");
        
        //--------------------------isEmpty()---------------------------------
        
        boolean result = demo.isEmpty();
        if (result == true)
            System.out.println("The ArrayList is empty");
        else
            System.out.println("The ArrayList is not empty");
        
        //-----------------------------------indexOf-------------------------------------
        
        int pos =demo.indexOf(50);
          
        System.out.println("\nThe element 50 is at index : " + pos);
        
        
       

	}

}