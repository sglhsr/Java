import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Class49_KeyListener_Frame extends JFrame implements KeyListener {
	JLabel label;
	ImageIcon icon;
	Class49_KeyListener_Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		icon=new ImageIcon("logo2.png");
		
		
		label=new JLabel();
		label.setBounds(0,0,100,100);
		label.setIcon(icon);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		this.getContentPane().setBackground(Color.black);
		this.add(label);
		this.setVisible(true);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//KeyType: Invoked when a key is typed, uses keyChar char output
		switch(e.getKeyChar()) {
		case 'a': 
			label.setLocation(label.getX()-1,label.getY());
			break;
		case 'w': 
			label.setLocation(label.getX(),label.getY()-1);
			break;
		case 'd': 
			label.setLocation(label.getX()+1,label.getY());
			break;
		case 's': 
			label.setLocation(label.getX(),label.getY()+1);
			break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//KeyPressed= Invoked when a physical key is pressed down, uses KeyCode, int output
		switch(e.getKeyCode()) {
		case 37: 
			label.setLocation(label.getX()-5,label.getY());
			break;
		case 38: 
			label.setLocation(label.getX(),label.getY()-5);
			break;
		case 39: 
			label.setLocation(label.getX()+5,label.getY());
			break;
		case 40: 
			label.setLocation(label.getX(),label.getY()+5);
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//KeyReleased= called whenever a button is released
		System.out.println("You released key char: "+ e.getKeyChar());
		System.out.println("             key code: "+ e.getKeyCode());
	}
}
