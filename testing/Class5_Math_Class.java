import java.util.Scanner;

public class Class5_Math_Class {
	private static double Hypotenvse() {
		double x;
		double y;
		double z;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter side x: ");
		x=scanner.nextDouble();
		System.out.println("Enter side y: ");
		y=scanner.nextDouble();
		//a^2+b^2�}�ڸ�=
		return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
	}
	public static void main(String[] args) {
		double x=3.14;
		double y=-2;
		double max=Math.max(x, y);
		double min=Math.min(x, y);
		double abs=Math.abs( y);
		double sqrt=Math.sqrt(16);
		double round=Math.round(3.7142345);
		double ceil=Math.ceil(3.1142345);    //無條件進位
		double floor=Math.floor(3.7142345);  //無條件捨去
	
		
		System.out.println("max "+max);
		System.out.println("min "+min);
		System.out.println("abs "+abs);
		System.out.println("sqrt "+sqrt);
		System.out.println("round "+round);
		System.out.println("ceil "+ceil);
		System.out.println("floor "+floor);
		System.out.println("Hypotenvse "+Hypotenvse());
	}
} 
