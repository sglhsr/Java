
public class Class19_Inheritance {
//extends Class19_obj_Vehicle �~�� �᭱���i��e��
//@Override: ���l���O�~�Ӥ����O�ɡA��g�����O�즳����k���e
//�h��k���W�١A�^�ǭȪ���ƫ��A�A�Ѽƫ��A�μƶq�������ۦP
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
