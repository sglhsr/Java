package Package2;

import Package1.*;

public class Class22_Package_Asub extends Class22_Package_A {
	public static void main(String[] args) {
		Class22_Package_Asub asub=new Class22_Package_Asub();
		System.out.println(asub.protectMSG); //protected subclass也能讀
		
		Class22_Package_C c=new Class22_Package_C();
//		System.out.println(c.privateMSG);  private只能該class裡讀
	}


}
