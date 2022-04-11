import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Class40_Frame extends JFrame implements ActionListener{
	JButton btn;
	
	JTextField textField;	
	Class40_Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		btn=new JButton("Submit");
		btn.addActionListener(this);
		textField=new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Consolas",Font.PLAIN,35));
		textField.setForeground(new Color(123,223,1));
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);
		textField.setText("Default text");
		textField.setEditable(false);
		this.add(btn);
		this.add(textField);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn) {
			System.out.println(textField.getText()); 
		}
		
	}

}
