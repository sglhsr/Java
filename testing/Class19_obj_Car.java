
//public class Class19_obj_Car extends Class19_obj_Vehicle 
//繼承Class19_obj_Vehicle  extends後面延展到前面
public class Class19_obj_Car extends Class19_obj_Vehicle{
	int wheels=4;
	int doors=4;
	
	@Override  //覆蓋掉父類別的method
	public void carGo() {
		System.out.println("this car is moving");
	}
}
