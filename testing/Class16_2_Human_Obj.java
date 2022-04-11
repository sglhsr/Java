
public class Class16_2_Human_Obj {
	String name;
	int age=55;
	double weights;
	Class16_2_Human_Obj(String str_Name){
		name="test"+str_Name;
	}
	Class16_2_Human_Obj(String str_name,int int_age){
		age=int_age*2;
	}
	Class16_2_Human_Obj(String str_name,int int_age,double Weights){
		//age=int_age*3;
		name=str_name;
		this.age=int_age;  //THIS是抓呼叫的那個物件 不是上面的age
		weights=Weights+30;
		this.weights=weights+4;
		System.out.println(age);
	}
	void drink() {
		System.out.println(name + " drink");
	}
	public String toString() {
		return "Try to string method";
	}
}

