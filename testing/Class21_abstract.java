
public class Class21_abstract {

	public static void main(String[] args) {
		// abstract - abstract classes cannot be instantiated but they can have a subclass
		//            abstract method are declared without an implementation
		// abstract 限制Class只能繼承,不能生成物件
//		Class21_obj_vechle vehicle =new Class21_obj_vechle();
		Class21_obj_Car car = new Class21_obj_Car();
		car.go();
	}

}
