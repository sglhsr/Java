
public class Class17_Array_Obj {

	public static void main(String[] args) {
		
		obj_Food[] refrigerator = new obj_Food[3];
		obj_Food food1=new obj_Food("Zuchacci");
		obj_Food food2=new obj_Food("curry");
		obj_Food food3=new obj_Food("hamburger");
		refrigerator[0]=food1;
		refrigerator[1]=food2;
		refrigerator[2]=food3;
//		obj_Food[] refrigerator = {food1,food2,food3};
		
		for (int i=0;i<refrigerator.length;i++) {
			System.out.println(refrigerator[i].name);
		}
		
		
		
	}

}
