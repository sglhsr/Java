
public class Class1_Variable {
	public static void main(String[] args) {
		/* println=\n,  \t=tab  
		 * 印雙引號"時加斜線\"  印斜線時用兩個\\
		 */
		//單行註解
		
		System.out.println("  I love java");
		System.out.print(" And machine learning also\n");
		System.out .     print("\tlive in\" ho\\me");
		System.out.println();//捷徑語法sysout + Alt /
			
		int x=123;
		System.out.println("x" + x);
		long y=12324356523432435L;  //long超過長度結尾+ L
		System.out.println("long, y"+y);
		
		float z=3.14f;  //float結尾要加f
		System.out.println("float z" + z);
		double z2=3.14;
		System.out.println("double z1"+z2);
		boolean b=true;
		System.out.println("boolean b"+b);
		char symbol='@';   //限定一個字且要加''
		System.out.println("char sysbol"+symbol);
				
	}
}
