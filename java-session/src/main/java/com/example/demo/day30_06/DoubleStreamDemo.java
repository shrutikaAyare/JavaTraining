package com.example.demo.day30_06;

import java.util.stream.DoubleStream;
/**
 * DoubleStream of(double… values) returns a sequential ordered stream whose elements are the specified values.
 * @author ShrutikaAyare
 *
 */
public class DoubleStreamDemo {

	public static void main(String[] args)
    {
        // Creating an DoubleStream
        DoubleStream stream = DoubleStream.of(8.2, 5.6, 4.1);
  
        // Displaying the sequential ordered stream
        stream.forEach(System.out::println);
    }
}


