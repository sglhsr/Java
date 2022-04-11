
public class Class20_Suepr {
//this 當下類別物件
//super 可以當作父類別
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
//    super.value();      /另一種/呼叫父類的方法 super.value()抓父類別的資料
//    System.out.println(name);
//    System.out.println(super.name);
}
