
public class Class20_Suepr {
//this ��U���O����
//super �i�H��@�����O
	public static void main(String[] args) {
		// super - keyword refers to the superclass (parent) of an object
		//         very similar to the "this" keyword
		Class20_obj_Hero hero1=new Class20_obj_Hero("Batman",42,"$$$");
		Class20_obj_Hero hero2=new Class20_obj_Hero("Superman",32,"everything");
		System.out.println(hero1.name);
		System.out.println(hero1.age);
		System.out.println(hero1.power);

		System.out.println(hero2.tostring());
	}
//    super.value();      /�t�@��/�I�s��������k super.value()������O�����
//    System.out.println(name);
//    System.out.println(super.name);
}
