import java.util.Scanner;

public class Class2_Input {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("What's your name");
		String name=scanner.nextLine();
		System.out.println("How old are you?");
		int age=scanner.nextInt();
		System.out.println("What's your favorite food?");
		scanner.nextLine();  //�W����age��enter�N�|��\n�F,�S�o�ӴN�|���\n
		String food=scanner.nextLine();
		
		//String food=scanner.next();
		
		System.out.println("Hello "+name);
		System.out.println("You are "+ age + " years old");
		System.out.println("Your favorite food is " + food);
		scanner.close() ; //remeber to close scanner
	}
}
