import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Class36_FlowLayout {

	public static void main(String[] args) {
		//FlowLayout= places components in a row, sized at their preferred size.
		//            If the horizontal space in the container is too small
		//            the FlowLayout class uses the next available row.
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.setLayout(new FlowLayout(FlowLayout.LEADING));
		frame.setLayout(new FlowLayout(FlowLayout.TRAILING,15,30));
		
		JPanel panel=new JPanel();
		panel.setPreferredSize(new Dimension(100,250));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new FlowLayout());
		
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		panel.add(new JButton("10"));
		
		frame.add(panel);
		frame.setVisible(true);
		
	}

}
