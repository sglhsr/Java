
public class Class15_Object {

	public static void main(String[] args) {
		Class15_2_Object_Car myCar=new Class15_2_Object_Car();
		System.out.println(myCar.make);
//		System.out.println(myCar.model);
		myCar.make="Toyota";
		System.out.println(myCar.make);
		myCar.drive();
	}

}
