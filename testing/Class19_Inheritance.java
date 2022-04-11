
public class Class19_Inheritance {
//extends Class19_obj_Vehicle 繼承 後面延展到前面
//@Override: 指子類別繼承父類別時，改寫父類別原有的方法內容
//則方法的名稱，回傳值的資料型態，參數型態及數量都必須相同
	public static void main(String[] args) {
   	    Class19_obj_Car car=new Class19_obj_Car();
		Class19_obj_Bicyle bike = new Class19_obj_Bicyle();
		
		System.out.println(car.doors);
		System.out.println(bike.pedals);
		bike.carGo();
		car.carGo();
		bike.carGo();

	}
	

}
