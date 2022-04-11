
import java.util.InputMismatchException;
import java.util.Scanner;
public class Class26_Exception {

	public static void main(String[] args) {
		// exception- an event that occurs during the execution of a program that.
		//            disrupts the normal flow of instructions
		Scanner scanner=new Scanner(System.in);
		try {
			
			System.out.println("Enter a whole number to drive: ");
			int x=scanner.nextInt();
			System.out.println("Enter a whole number to drive by: ");
			int y=scanner.nextInt();
			
			int z=x/y;
			System.out.println("result:"+z);
			
		}
		catch(ArithmeticException e) {
			System.out.println("You can't divide by zero ! IDIOT!");
		}
		catch(InputMismatchException e) {  // Scanner§ì¨ì¿ù
			System.out.println("Plz enter a number OMFG!!");
		}
		catch(Exception e) {
			System.out.println("Somthing went wrong");
		}
		finally {  //¥Ã»·°õ¦æ
			scanner.close();
			System.out.println("This will always print.");
			
		}
	}

}
