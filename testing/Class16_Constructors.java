
public class Class16_Constructors {

	public static void main(String[] args) {
		Class16_2_Human_Obj human=new Class16_2_Human_Obj("Hat",3,5.4);
		Class16_2_Human_Obj human2=new Class16_2_Human_Obj("Tim",22,5.4);
		//System.out.println(human.age);
		System.out.println(human.age);
		System.out.println(human2.age);
		human.drink();
		human2.drink();
		Class16_2_Human_Obj human3=new Class16_2_Human_Obj("aaa");
		System.out.println(human3.age);
		System.out.println(human2.toString());
		System.out.println("22".toString());
	}

}
