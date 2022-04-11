import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Class48_ColorChooser_Frame extends JFrame implements ActionListener {
	JButton btn;
	JButton btn2;
	JLabel label;
	
	Class48_ColorChooser_Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		btn=new JButton("Pick fore color");
		btn2=new JButton("Pick back color");
		label=new JLabel();
		label.setBackground(Color.WHITE);
		label.setText("This is some text :D");
		label.setFont(new Font("Colas",Font.PLAIN,18));
		
		label.setOpaque(true);
		btn.addActionListener(this);
		btn2.addActionListener(this);
		this.add(btn);
		this.add(btn2);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn) {
			JColorChooser colorChooser=new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "pick fore color...I guess",Color.black);
			label.setForeground(color);	

		}
		else if (e.getSource()==btn2) {
			JColorChooser colorChooser=new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "pick back color...I guess",Color.black);
			label.setBackground(color);	
		}
	}
}
