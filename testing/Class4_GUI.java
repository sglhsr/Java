
import javax.swing.JOptionPane;
public class Class4_GUI {
	public static void main(String[] args) {
		//Graphical User Interface
		String name=JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "Your age is " + age);
		
		double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "Your are " + height+ " tall");
	}
}
