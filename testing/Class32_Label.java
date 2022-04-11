
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
public class Class32_Label {

	public static void main(String[] args) {
		
		Class31_Frame_Template frame=new Class31_Frame_Template();
		
		Border border=BorderFactory.createLineBorder(Color.BLUE);
		ImageIcon image=new ImageIcon("logo.png");
		image.setImage(image.getImage().getScaledInstance(150,170,Image.SCALE_DEFAULT));
		
		JLabel label=new JLabel();
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(23,154,211));
		label.setFont(new Font("MV Boli",Font.PLAIN,20));
		label.setText("Bro, do you even code?");
		label.setIconTextGap(10);
		label.setBackground(Color.pink);

		label.setOpaque(true);   //有這行背景才能換   
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.TOP);  //set vertical position of icon and text within label
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0,0,250,250);  // label x,y position and size within frame as well as dimension
		
		
//		JFrame frame=new JFrame();
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setVisible(true);
		
//		frame.setLayout();
		frame.add(label);
		frame.setVisible(true);
		frame.pack();  //直接把frame條跟label一樣大小
		
	}	

}
