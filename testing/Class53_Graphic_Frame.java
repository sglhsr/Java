import java.awt.*;
import javax.swing.*;

public class Class53_Graphic_Frame extends JFrame{
	Class53_Graphic_Panel panel;
	Class53_Graphic_Frame(){
		panel=new Class53_Graphic_Panel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	
}
