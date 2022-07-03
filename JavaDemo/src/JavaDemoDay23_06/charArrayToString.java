package JavaDemoDay23_06;

//4. Write a Java program to create a new String object with the contents of a character array. 

public class charArrayToString {

	public static void main(String[] args) {
		char [] test = { '1', '2', '3', '4' };

		String str = String.copyValueOf(test, 1, 3);


		System.out.println("\nThe book contains " + str +" pages.\n");

	}

}
