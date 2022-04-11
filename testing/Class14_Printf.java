
public class Class14_Printf {

	public static void main(String[] args) {
		// printf()- an optional method to control, format, and display text to the console window
		//           two arguments - format string (object/variable/value)
		//           % [flags][precision][width][conversion-character]
		
		System.out.printf("This is a format string %d",123);
		System.out.printf("%dThis is a format string",123);//%d
		System.out.printf("\n");
		boolean MyBoolean =true;
		char MyChar='@';
		String MyString="Bro";
		int MyInt=50;
		double myDouble=1000.23;
		System.out.printf("%b",MyBoolean);
		System.out.printf("%c",MyChar);
		System.out.printf("%s",MyString);
		System.out.printf("%d",MyInt);
		System.out.printf("%f",myDouble);
		System.out.printf("Hello %10s\n",MyString); //10個空白
		
		//[precision]
		//sets number of digits of precision when outputing floating point values
		System.out.printf("You have this much money %.2f\n",myDouble); //2位小數
		System.out.printf("You have this much money %20f\n",myDouble); //空到20個空格
		System.out.printf("You have this much money %+f\n",myDouble); //顯示+
		System.out.printf("You have this much money %020f\n",myDouble); //空白補0
		//[flags]
		//adds an effect to output based on the flag added to format specifier
		//- left-justify
		//+ output a plus (+) or minus(-) sign for a numeric value
		//0 numeric values are zero-padded
		//, comma grouping seperator if numbers>1000
	}
	/*

	 */

}
