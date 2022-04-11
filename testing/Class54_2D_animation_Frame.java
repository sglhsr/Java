import java.awt.*;
import javax.swing.*;
public class Class54_2D_animation_Frame extends JFrame {
	
	Class54_2D_animation_Panel panel=new Class54_2D_animation_Panel();
	Class54_2D_animation_Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.add(panel);
		this.setVisible(true);
	}
}
