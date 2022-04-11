import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;
public class Class47_SelectFile_Frame extends JFrame implements ActionListener{
	JButton btn;
	Class47_SelectFile_Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		btn=new JButton("Select File");
		btn.addActionListener(this);
		
		this.add(btn);
		this.pack();
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn) {
			JFileChooser fileChooser=new JFileChooser();
			
			fileChooser.setCurrentDirectory(new File("D:\\"));
//			int response=fileChooser.showOpenDialog(null);
			int response=fileChooser.showSaveDialog(null);
			if (response==JFileChooser.APPROVE_OPTION) {
				File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
			
		}
	}
	

}
