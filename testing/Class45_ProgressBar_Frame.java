import java.awt.*;
import javax.swing.*;


public class Class45_ProgressBar_Frame {
	JFrame frame=new JFrame();
	JProgressBar bar=new JProgressBar();
	
	Class45_ProgressBar_Frame(){
		bar.setValue(100);
		bar.setBounds(0,50,420,50);  // ¦ì¸m ¤j¤p
//		bar.setMaximum(100);
		bar.setStringPainted(true);
		bar.setFont(new Font("Consolas",Font.BOLD,25));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	public void fill() {
		int Counter=100;
		while (Counter>0) {
			bar.setValue(Counter);
			try {
				Thread.sleep(50);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			Counter--;
		}
		bar.setString("Done!");
	}
}
