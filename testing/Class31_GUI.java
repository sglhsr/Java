import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.ImageIcon;
public class Class31_GUI {

	public static void main(String[] args) {
		//load Class31_Frame_Template這個樣板檔
		//Class31_Frame_Template 樣板檔繼承extends JFrame
		Class31_Frame_Template myframe=new Class31_Frame_Template();
		myframe.setTitle("Sub fram title");
		
		//JFrame frame=new JFrame();
//		frame.setTitle("JFrame title");  //or = =new JFrame("Title")
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setResizable(false);
//		frame.setSize(420,420);
//		
//		frame.setVisible(true);
//		ImageIcon image=new ImageIcon("logframeo.png");
//		frame.setIconImage(image.getImage());
//		//frame.getContentPane().setBackground(Color.cyan);
//		//frame.getContentPane().setBackground(new Color(255,0,0));
//		frame.getContentPane().setBackground(new Color(0x123456));
////		frame.setBackground(Color.red) frame顯示的是奇content,所以改這不會有效果
	}

}
