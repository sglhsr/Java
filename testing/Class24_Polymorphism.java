
public class Class24_Polymorphism {

	public static void main(String[] args) {
		// polymorphism- many shapes/forms
		// polymorphism- greek word for poly-"many", morph-"form"
		//               The ability of an object to identify as more then one type
		//不同型態物件宣告成同一個Vehicle, 因為有繼承了
		Class24_obj_Car car=new Class24_obj_Car();
		Class24_obj_Bike bike=new Class24_obj_Bike();
		Class24_obj_Boat boat=new Class24_obj_Boat();
		//可以用被繼承的父類別當陣列物件
		Class24_obj_Vehicle[] racers = {car,bike,boat};
		
		for (Class24_obj_Vehicle x :racers) {
			x.go();
		}
		
	}

}
