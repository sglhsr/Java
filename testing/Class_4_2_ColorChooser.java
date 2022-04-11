
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Class_4_2_ColorChooser {
	//���ŧi�T�Ӥ���jFrame,JTextArea,JButton, �binit��add�i��
	JFrame jFrame=new JFrame("testing color chooser");
	JTextArea jta = new JTextArea("I love JAVA",25,40);
	JButton button = new JButton(new AbstractAction("change color") {
		//button ���T�w�nnew AbstractAction, �o�O��acftionPerformed(ActionEvent e)�۳s
		public void actionPerformed(ActionEvent e) {                     //��ܾ��w�]�զ�
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
