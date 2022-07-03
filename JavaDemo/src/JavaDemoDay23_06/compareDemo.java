package JavaDemoDay23_06;

//2. Write a Java program to compare a given string to the specified character sequence.

public class compareDemo {

	public static void main(String[] args) {
		String a = "shrutika ayare";
		String b = "shrutika aayare";
		
		CharSequence cs = "shrutika ayare";
		
		
	     System.out.println("Comparing "+a+" and "+cs+": " + a.contentEquals(cs));
	      System.out.println("Comparing "+a+" and "+cs+": " + b.contentEquals(cs));

	}

}
