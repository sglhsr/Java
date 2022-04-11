
public class Class7_If_Switch {
	public static void main(String[] args) {
		int age=75;
		if (age>=75) {
			System.out.println("A Boomer");
		}
		else if(age>=18) {
			System.out.println("You are an adult");
		}
		else if(age>=13) {
			System.out.println("You are a teenager");
		}
		else {
			System.out.println("You are not an adult");
		}
		int day=2;
		switch(day) {
			case 1:
				System.out.println("switch 1 "+day);
				break;
			case 2:
				System.out.println("switch 2 "+day);
				break;
			case 3:
				System.out.println("switch 3 "+day);
				break;
			case 4:
				System.out.println("switch 4 "+day);
				break;
		}
	}
}
