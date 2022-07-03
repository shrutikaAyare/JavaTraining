package com.example.demo.day30_06;

import java.util.Arrays;
import java.util.stream.Stream;

public class ToArrayDemo {
	
	//Stream toArray() returns an array containing the elements of this stream.

	public static void main(String[] args) {
		
		Stream <String> stremData = Stream.of("shrutika","java","session","bdo india");
		
		Object streamArray[] = stremData.toArray();
		
		System.out.println(Arrays.toString(streamArray));

	}

}
