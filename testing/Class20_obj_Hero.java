
public class Class20_obj_Hero extends Class20_obj_Person {
	String power;
	Class20_obj_Hero(String name,int age, String power){
		super(name,age); //�����O��constructor 	Class20_obj_Person(String name,int age){
//		this.name=name;
//		this.age=age;
		this.power=power;
	}
	public String tostring() {
		return super.tostring()+this.power; //��super�I�s�����O��tostring()
	}
}
