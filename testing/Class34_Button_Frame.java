import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//也可參考Class_ColorChooser
public class Class34_Button_Frame extends JFrame implements ActionListener { //方法1 implements ActionListener
	JButton button;
	JLabel label;
	Class34_Button_Frame(){
		ImageIcon icon =new ImageIcon("logo2.png");
		ImageIcon icon2 =new ImageIcon("logo3.png");
		
		label=new JLabel();
		label.setIcon(icon2);
		label.setBounds(150,250,150,150);
		label.setVisible(false);
		button=new JButton();
		button.setBounds(200,100,150,180);;
		
		button.setText("TestButton");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);;
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Harlow Solid",Font.BOLD,15));
		button.setIconTextGap(-5);
		button.setForeground(Color.RED);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		button.addActionListener(this);
	//	button.addActionListener(e->System.out.println("poo"));  //方法1 this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}
	//方法1
	 @Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			System.out.println("poo");
			//System.out.println(!label.isVisible());
			//button.setEnabled(false);
			label.setVisible(!label.isVisible());
		}
		
	}
}
