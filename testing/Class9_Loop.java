import java.util.Scanner;
public class Class9_Loop {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		String name="dd";
		//用name==""無法判斷空白 所以用isBlank()
//		while (name.isBlank()){
//			System.out.println("Enter your name");
//			name=scanner.nextLine();
//		}
//		do {
//			System.out.println("Enter your name");
//			name=scanner.nextLine();
//		} while(name.isBlank());
//		
//		System.out.println("Hello "+name);
//		
//		for (int i=10;i>=0;i-=2) {
//			System.out.print(i);
//		}
		
		for (int i=7;i>=1;i--) {
			for (int j=i;j<=7;j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	
	
}
