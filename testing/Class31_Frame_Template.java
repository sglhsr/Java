import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Class31_Frame_Template extends JFrame{
	Class31_Frame_Template(){		
		this.setTitle("JFrame title");  //or = =new JFrame("Title")
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(420,420);
		
		this.setVisible(false);
		ImageIcon image=new ImageIcon("logframeo.png");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(Color.darkGray);
		//this.getContentPane().setBackground(new Color(255,0,0));
		//this.getContentPane().setBackground(new Color(0x123456));
//		this.setBackground(Color.red) frame顯示的是奇content,所以改這不會有效果
	}
	


}
