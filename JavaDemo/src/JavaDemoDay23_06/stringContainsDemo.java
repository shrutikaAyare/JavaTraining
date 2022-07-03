package JavaDemoDay23_06;

//1. Write a Java program to test if a given string contains the specified sequence of char values. 

public class stringContainsDemo {

	public static void main(String[] args) {
		String a = "we are learning java basics";
		String b = "are";

		if(a.contains(b)) {
			System.out.println("a contains b");
		}else {
		System.out.println("a not contains b");
		}


	}
}
