import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Class54_2D_animation_Panel extends JPanel implements ActionListener{
	
	final int Panel_Width=300;
	final int Panel_Height=300;
	
	Image enemy;
	Image backgroundImage;
	Timer timer;
	int xVelocity=1;
	int yVelocity=1;		
	int x=50;
	int y=100;
	Class54_2D_animation_Panel(){
		this.setPreferredSize(new Dimension(Panel_Width,Panel_Height));
		this.setBackground(Color.black);
		
		enemy=new ImageIcon("logo4.png").getImage();
		backgroundImage=new ImageIcon("background1.png").getImage();

		
		timer=new Timer(10,this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		
		super.paint(g); //有這個setBackground才會顯示
		
		Graphics2D g2D=(Graphics2D) g;
		g2D.drawImage(backgroundImage, 0,0,300,300, null);
		g2D.drawImage(enemy, x, y, null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {  //每次timer執行的
		if (x>=Panel_Width-enemy.getWidth(null) *1.5 || x<0) {
			System.out.println(enemy.getWidth(null));
			System.out.println(Panel_Width);
			System.out.println(x);
			
			System.out.println( Panel_Width-enemy.getWidth(null));
			xVelocity=xVelocity*-1;
		}
		x=x+xVelocity;
		if (y>=Panel_Height-enemy.getHeight(null)*2 || y<0) {
			yVelocity=yVelocity*-1;
		}
		y=y+yVelocity;
		repaint();
	}
}
