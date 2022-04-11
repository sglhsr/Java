import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.*;

public class Class53_Graphic_Panel extends JPanel {
	
	Image image;
	
	Class53_Graphic_Panel(){
		image=new ImageIcon("logo2.png").getImage();
		this.setPreferredSize(new Dimension(500,500));
	}
	
	public void paint(Graphics g) {
		Graphics2D g2D =(Graphics2D) g;
		
		g2D.setPaint(Color.blue);
		g2D.setStroke(new BasicStroke(15));  //�ʲ�
//		g2D.drawLine(0,0, 500, 500); // (0,0) �e�� (500,500)	
//		g2D.drawRect(0,0,100,200);
//		g2D.fillRect(0,0,100,200);
		
		
//		g2D.drawOval(0, 0, 300, 500); //���  �e��
//		g2D.fillOval(0,0,300,200);
//		g2D.drawArc(0, 0, 100, 100, 0, 70); //�e������
//		g2D.fillArc(0, 0, 100, 100, 0, -70); //�e������  0=3�I����V
		
//		int[] xPoints= {150,250,350,20};
//		int[] yPoints= {300,150,300,20};
		
//		g2D.drawPolygon(xPoints,yPoints,4);  //array�e�u
//		g2D.fillPolygon(xPoints,yPoints,4);  //array�e�u
		
//		g2D.setFont(new Font("Coloas",Font.BOLD,30));
//		g2D.drawString("U R A WINNER:" ,50,40);  //�eString
		
		g2D.drawImage(image, 0,0,null);
	}
}
