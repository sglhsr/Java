import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Class33_Panels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JFrame frame = new JFrame();
		Class31_Frame_Template frame=new Class31_Frame_Template();
		JLabel label =new JLabel();
		label.setText("Hixxxxfdgdfx");
		label.setFont(new Font("MV Boli",Font.PLAIN,20));
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(100,100,75,75);
		
		JPanel redPanel=new JPanel();
		redPanel.setBackground(Color.RED);
		redPanel.setBounds(0,0,250,250);
//		redPanel.setLayout(new FlowLayout());
		redPanel.setLayout(new BorderLayout());
//		redPanel.setLayout(null);
		
		JPanel bluePanel=new JPanel();
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setBounds(250,0,250,250);
//		bluePanel.setLayout(new FlowLayout());
		bluePanel.setLayout(new BorderLayout());
//		bluePanel.setLayout(null);
		
		JPanel greenPanel=new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setBounds(0,250,500,250);
//		greenPanel.setLayout(new FlowLayout());
		greenPanel.setLayout(new BorderLayout());
		//greenPanel.setLayout(null);
		/*FlowLayout simply places components one after the other.
		  BorderLayout places components in specific sections of the window such as top(NORTH), bottom(SOUTH), left(WEST), right(EAST) and center(CENTER).
		  GridBagLayout is another Layout Manager that gives the developer more precise rendering of components.
		*/
		ImageIcon icon=new ImageIcon("logo2.png");
		icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));

	
		label.setIcon(icon);

	//	label.setBounds(0,0,100,100);  // label x,y position and size within frame as well as dimension
		
	

	

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);  //null 就是完全透過setBounds管理
		frame.setSize(750,750);
		frame.setVisible(true);
		
		greenPanel.add(label);
		
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
	}

}
