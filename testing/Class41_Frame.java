import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Class41_Frame extends JFrame implements ActionListener {
	JButton btn=new JButton();
	JCheckBox checkBox=new JCheckBox();
	ImageIcon image =new ImageIcon();
	ImageIcon checkIcon =new ImageIcon();
	Class41_Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		image=new ImageIcon("logo.png");
		image.setImage(image.getImage().getScaledInstance(150,170,Image.SCALE_DEFAULT));
		checkIcon=new ImageIcon("logo2.png");
		
		btn.setText("Submit");
		btn.addActionListener(this);

		checkBox.setText("I am not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
		checkBox.setIcon(image);
		checkBox.setSelectedIcon(checkIcon); //check之後的圖
		this.add(btn);
		this.add(checkBox);
				
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn) {
			
			System.out.println(checkBox.isSelected());
		}
		
	}

}
