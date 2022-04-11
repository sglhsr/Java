
public class Class11_StringMethod {
	public static void main(String[] args) {
		String name=" Bro ";
		boolean bln=name.equalsIgnoreCase("bro");
		System.out.println(bln);
			
		char cr=name.charAt(3);
		System.out.println(cr);
		
		int index=name.indexOf("r");
		System.out.println(index);
		
		boolean empty=name.isEmpty();
		System.out.println(empty);
		
		String upper=name.toUpperCase();
		System.out.println(upper);
		
		String trim=name.trim();
		System.out.println(trim);
		
		String replace1=name.replace('o', 'z');
		System.out.println(replace1);
	
	}
}
