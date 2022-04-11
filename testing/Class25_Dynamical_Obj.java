import java.util.Scanner;

public class Class25_Dynamical_Obj {

	public static void main(String[] args) {
		// polymorphism - many shapes/forms
		// dynamic - after compilation (during runtime)
		//先宣告父物件 之後再改子類別
		Scanner scanner=new Scanner(System.in);
		Class25_obj_Animal animal;
		System.out.println("What animal do you want?");
		System.out.println("1=dog, 2=cat");
		int choice=scanner.nextInt();
		if (choice==1) {
			animal=new Class25_obj_Dog();
			animal.speak();
		}
		else if (choice==2) {
			animal=new Class25_obj_Cat();
			animal.speak();
		}
		else {
			animal=new Class25_obj_Animal();
			System.out.println("That choice was invalid");
			animal.speak();
		}
		scanner.close();
	}

}
