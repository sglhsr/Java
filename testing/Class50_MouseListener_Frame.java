import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Class50_MouseListener_Frame extends JFrame implements MouseListener{
	
	JLabel label;
	JLabel label_pic;
	ImageIcon icon2;
	ImageIcon icon3;
	ImageIcon icon4;
	ImageIcon icon5;
	Class50_MouseListener_Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		
		icon2=new ImageIcon("logo2.png");
		icon3=new ImageIcon("logo3.png");
		icon4=new ImageIcon("logo4.png");
		icon5=new ImageIcon("logo5.jpg");
		
		
		label=new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		label_pic=new JLabel();
		label_pic.setBounds(110,20,100,100);
		label_pic.setIcon(icon2);
//		label.addMouseListener(this);
		label_pic.addMouseListener(this);
		
		this.add(label);
		this.add(label_pic);
		this.setVisible(true);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
//		System.out.println("You click mouse");
	}

	@Override
	public void mousePressed(MouseEvent e) {
//		System.out.println("You pressed mouse");
		label.setBackground(Color.yellow);
		label_pic.setIcon(icon3);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("You released mouse");
		label.setBackground(Color.green);
		label_pic.setIcon(icon4);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("You entered mouse");
		label_pic.setIcon(icon5);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		 System.out.println("You exited mouse");
		
	}

}
