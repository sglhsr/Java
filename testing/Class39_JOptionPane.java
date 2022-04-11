import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Class39_JOptionPane {

	public static void main(String[] args) {
		//JOptionPane- pop up a standard dialog box that prompts users for a value
		//             or informs them of something
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.QUESTION_MESSAGE);
//		while(true) {
//			JOptionPane.showMessageDialog(null, "You're computer has a virus", "title", JOptionPane.WARNING_MESSAGE);	
//		}		
//		JOptionPane.showMessageDialog(null, "Call tech support", "title", JOptionPane.ERROR_MESSAGE);
//		int answer=JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
//		System.out.println(answer);
//		
//		String result=JOptionPane.showInputDialog("Keyin your data");
//		System.out.println(result);
		String[] responses= {"No, you're awesome!","thank you!","blush"};
		ImageIcon icon=new ImageIcon("logo2.png");
		JOptionPane.showOptionDialog(null, 
				"You are awesome", "Secret",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, 
				icon, responses, 0);
	}

}
