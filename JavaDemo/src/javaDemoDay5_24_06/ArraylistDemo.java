package javaDemoDay5_24_06;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Purple");
		al.add("Orange");
		al.add("Black");
		al.add("White");
		al.add("Red");
		al.add("Yellow");
		al.add("Blue");
		
		//-------------------------printing arraylist---------------
		System.out.println(al);
		
		//----------------------------Iterating over the arraylist-------------
		for(String colours:al) {
			System.out.println("Iterating through arraylist " + colours);
		}
		
		//-------------------------add element in first position----------------------------
		al.add(0,"Pink");
		System.out.println(al);
		
		//------------------------- to retrieve an element (at a specified index)-------------
		
		System.out.println("The element at index 3 in the ArrayList is: " + al.get(3));
		
		//-------------------------to update specific array element by given element----------
		
		al.set(5, "Violet");
		System.out.println(al);
		
		//--------------------------to remove the third element from a array list---------------
		
		al.remove(2);
		System.out.println(al);
		
		//---------------------------to search an element in a array list-------------------------
		
		Integer index = al.indexOf("Black");
	      if(index == -1)
	         System.out.println("The colour Black is not in the ArrayList");
	      else
	         System.out.println("The colour Black is in the ArrayList at index " + index);
		

	}

}
