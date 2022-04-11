import java.util.Random;


public class Class6_Random {
	public static void main(String[] args) {
		Random random=new Random();
		int x=random.nextInt(6);  //0~5
		int y=random.nextInt(6)+1;  //1~6
		double z=random.nextDouble();
		boolean bln=random.nextBoolean();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(bln);
	}
}
