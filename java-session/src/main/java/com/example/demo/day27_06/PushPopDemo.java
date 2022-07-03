package com.example.demo.day27_06;

import java.io.*;
import java.util.*;

class MyThread1 extends PushPopDemo implements Runnable {
	public void run()
	{ 
		   //push operation
			if(top==10000)  {
				System.out.println("The Stack is full");  
			}else {
				for(i=1;i<=10;i++)
				{
					mystack[++top]= i;
					System.out.println("element pushed into stack " + i);
				}
			}
			
			//pop operation
			if(top<0) { 
				System.out.println("The Stack is Empty");            
			}else 
			{
				for(i=1;i<=10;i++)
				{
					int z = mystack[top--];
					System.out.println("element removed from stack " + z);
				}
			}		
	}
}


//class MyThread2 extends PushPopDemo implements Runnable {
//	public void run()
//	{
//		if(top<0) { 
//			System.out.println("The Stack is Empty");            
//		}else 
//		{
//			for(i=1;i<=5;i++)
//			{
//				i= mystack[top--];
//				System.out.println("element removed from stack " + i);
//			}
//		}
//	}
//}


public class PushPopDemo {

	int i;
	int top= -1;
	int mystack[]=new int[10000];

	public static void main(String[] args) {
		
		Runnable obj1 = new MyThread1();
		//Runnable obj2 = new MyThread2();
		Thread t1 = new Thread(obj1);
		//Thread t2 = new Thread(obj2);
		t1.start();
		//t2.start();
	}

}

