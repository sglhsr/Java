
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Class_4_2_ColorChooser {
	//先宣告三個元件jFrame,JTextArea,JButton, 在init裡add進來
	JFrame jFrame=new JFrame("testing color chooser");
	JTextArea jta = new JTextArea("I love JAVA",25,40);
	JButton button = new JButton(new AbstractAction("change color") {
		//button 都固定要new AbstractAction, 這是跟acftionPerformed(ActionEvent e)相連
		public void actionPerformed(ActionEvent e) {                     //選擇器預設白色
			Color result=JColorChooser.showDialog(jFrame, "color chooser", Color.WHITE);
			jta.setBackground(result);
		}
	});
	public void init() {
		jFrame.add(jta);
		jFrame.add(button,BorderLayout.SOUTH);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.pack();
		jFrame.setVisible(true);
	}
	public static void main(String[] args) {
		new Class_4_2_ColorChooser().init();
	}
}
