import java.awt.Color;
//import java.awt.Desktop.Action;
import java.awt.event.*;
//import javax.swing.AbstractAction;
import javax.swing.*;
public class Class52_key_Blindings_Game {
	
	JFrame frame;
	JLabel label; 
	Action upAction;
	Action downAction;
	Action leftAction;
	Action rightAction;
	
	Class52_key_Blindings_Game(){
		frame=new JFrame("KeyBinding demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		
		label=new JLabel();
		label.setBackground(Color.red);
		label.setBounds(100,100,100,100);
		label.setOpaque(true);
		
		upAction=new UpAction();
		downAction=new DownAction();
		leftAction=new LeftAction();
		rightAction=new RightAction();
		
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "goUp");
		label.getActionMap().put("goUp", upAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "goDown");
		label.getActionMap().put("goDown", downAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "goLeft");
		label.getActionMap().put("goLeft", leftAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "goRight");
		label.getActionMap().put("goRight", rightAction);
		
		frame.add(label);
		frame.setVisible(true);
	}
	
	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(),label.getY()-15);			
		}
		
	}
	public class DownAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(),label.getY()+15);
		}
		
	}
	public class LeftAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX()-15,label.getY());
		}
		
	}
	public class RightAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX()+15,label.getY());
		}
		
	}
}
