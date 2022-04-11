import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Class38_LaunchPage implements ActionListener {
	JFrame frame = new JFrame();
	JButton myButton = new JButton("New Windows");
	
	Class38_LaunchPage(){
		myButton.setBounds(70,160,200,40);  //H padding, V padding, width, height
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		frame.add(myButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==myButton) {
			frame.dispose();
			Class38_NewWindow myWindow=new Class38_NewWindow();
		 
		}
		
	}
	
}
