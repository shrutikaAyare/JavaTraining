package com.example.demo.utils;

@FunctionalInterface
public interface IAddable<T> {
	public T performOperation(T t1, T t2);

}
