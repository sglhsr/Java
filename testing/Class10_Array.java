
public class Class10_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] car= {"a","b","c","D"};
		System.out.println(car[2]);
		
		String[] cars=new String[3];
		cars[0]="1";
		cars[1]="2";
		cars[2]="3";
		for (int i=0;i<cars.length;i++) {
			System.out.print(cars[i]);
		}
		
		String[][] car2=new String[3][5];
		car2[0][0]="a";
		System.out.println("\n"+car2.length);
		
		String[][] car3= {
				{"a","b","c","d"},
				{"a1","b1","c1","d1"},
				{"a2","b2","c2","d2"},
				{"a3","b3","c3","d3"}
				};
		System.out.println("\n"+car3.length);
		System.out.println("\n"+car3[2].length);
	}

}
