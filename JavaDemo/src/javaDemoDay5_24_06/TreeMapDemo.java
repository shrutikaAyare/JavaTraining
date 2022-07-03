package javaDemoDay5_24_06;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {


		TreeMap <String,String> treeMap = new TreeMap <String,String> ();

		treeMap.put("C1", "Red");
		treeMap.put("C2", "Green");
		treeMap.put("C3", "Black");
		treeMap.put("C4", "White");

		System.out.println("Orginal TreeMap content: " + treeMap);

		//-----------------to get the first (lowest) key and the last (highest) key currently in a map---------
		System.out.println("Greatest key: " + treeMap.firstKey());
		  System.out.println("Least key: " + treeMap.lastKey());
		
		
		//--------------------to get the first (lowest) key and the last (highest) key currently in a map-----
		
		  System.out.println("First entry: " + treeMap.firstEntry());
		  System.out.println("Last entry: " + treeMap.lastEntry());
		
		//----------------to get a reverse order view of the keys contained in a given map
		
		System.out.println("Reverse order view of the keys: " + treeMap.descendingKeySet());

	}

}
