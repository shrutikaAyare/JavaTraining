package javaDemoDay5_24_06;

import java.util.LinkedList;
import java.util.*;  

public class DemoLinkList {
	
	public static void main(String[] args) {
		  
		     LinkedList<String> colourList = new LinkedList<String>();
		  
		     colourList.add("Red");
		     colourList.add("Green");
		     colourList.add("Black");
		     colourList.add("White");
		     colourList.add("Pink");
		      
		     System.out.println("Original linked list:" + colourList);  
		     
		     //-------------------insert the specified element at the specified position in the linked list------
		     
		     colourList.add(1, "Olive");  
	         System.out.println("After invoking add(int index, E element) method: "+colourList);  
	         
	         //----------------insert elements into the linked list at the first and last position----------
	         
	         colourList.addFirst("Yellow");
	         colourList.addLast("lastcolour");
	         
	         System.out.println("Adding colour at first and last position in linkedlist "+ colourList); 
	         
	         //--------------insert the specified element at the front of a linked list--------------
	         
	         colourList.offerFirst("colour at front");
	         colourList.offerLast("colour at ent");
	         
	         System.out.println("Adding colour at front and end in linkedlist "+ colourList); 
	         
	         //------------insert some elements at the specified position into a linked list--------
	         
	         colourList.add(2, "clr at position 3");
	         
	         //----------get the first and last occurrence of the specified elements in a linked list
	         
	         System.out.println("LastIndex of White:"+colourList.lastIndexOf("White"));
	         System.out.println("First Index of White:"+colourList.indexOf("White"));
	         
	         //-------------to display the elements and their positions in a linked list-----------------
	         
	         for(int p=0; p < colourList.size(); p++)
	         {
	            System.out.println("Element at index "+p+": "+colourList.get(p));
	          } 		
		     
		    
		 }	
}
