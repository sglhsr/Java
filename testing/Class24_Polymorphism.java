
public class Class24_Polymorphism {

	public static void main(String[] args) {
		// polymorphism- many shapes/forms
		// polymorphism- greek word for poly-"many", morph-"form"
		//               The ability of an object to identify as more then one type
		//���P���A����ŧi���P�@��Vehicle, �]�����~�ӤF
		Class24_obj_Car car=new Class24_obj_Car();
		Class24_obj_Bike bike=new Class24_obj_Bike();
		Class24_obj_Boat boat=new Class24_obj_Boat();
		//�i�H�γQ�~�Ӫ������O��}�C����
		Class24_obj_Vehicle[] racers = {car,bike,boat};
		
		for (Class24_obj_Vehicle x :racers) {
			x.go();
		}
		
	}

}
