
public class Class21_obj_Car extends Class21_obj_vechle {
	//A concrete class extending an abstract class should
	// override all the abstract methods
	//在Parent中定義了一個抽象的方法，當有人繼承Parent時，
	//就必須要完成這個方法，這個動作叫做實作(Implement)
	@Override
	void go() {
		System.out.println("The driver is driving the car");
	}
}
