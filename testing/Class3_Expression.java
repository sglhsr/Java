
public class Class3_Expression {
	public static void main(String[] args) {
		/** + addition
		 *  - subtraction
		 *  * multiplication
		 *  / division
		 */
		int friends=10;
		friends=friends+1;
		System.out.println(friends);
		friends=friends * 2+1;
		System.out.println(friends);
		
		friends=friends / 4 ; //無條件捨去
		System.out.println(friends);
		
		friends=friends % 3 ;
		System.out.println(friends);
		
		friends++ ;
		System.out.println(friends);
		
		double change_type = (double)friends/2 ;  //轉換型別
		System.out.println(change_type);
	}
	
}
