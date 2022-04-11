import java.util.Scanner;
public class Class8_Logical_Operators {
	public static void main(String[] args) {
		/* && = And
		 * || = or
		 * !=   (not)  reverse boolean
		 */
		int temp=25;
		if (temp>=20 && temp<=30) {
			System.out.println("OK");
		}
		else {
			System.out.println("No");
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Plz keyin a word");
		String r =scanner.next();
		
		if (r.equals("q") || r.equals("Q")) {
		//if (!r.equals("q")  && !r.equals("Q")) {	
			System.out.println("it's q or Q "+r);
		}
		else {
			System.out.println("Not q "+r);
		}
		/*
		 * ==check address or string pool
		 * .equal check value
		 String s1 = "HELLO";
	     String s2 = "HELLO";
	     String s3 =  new String("HELLO");
	 
	     System.out.println(s1 == s2); // true
	     System.out.println(s1 == s3); // false
	     System.out.println(s1.equals(s2)); // true
	     System.out.println(s1.equals(s3)); // true
	     */
	}
}
