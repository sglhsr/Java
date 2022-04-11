import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class Class51_drag_and_drop_DragPanel extends JPanel {
	
	ImageIcon image=new ImageIcon("logo2.png");
	final int width=image.getIconWidth();
	final int height=image.getIconHeight();
	Point imageCorner;
	Point PrevPt;
	
	Class51_drag_and_drop_DragPanel(){
		imageCorner=new Point(0,0);
		ClickListener clickListener=new ClickListener();
		DragListener dragListener=new DragListener();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
	}
	
	public void paintComponent(Graphics g) {  //繪圖 沒這個圖不會顯示
		super.paintComponent(g);
		image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
	}
	
	private class ClickListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			PrevPt=e.getPoint();
		}
	}
	
	private class DragListener extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e) {
			Point currentPt=e.getPoint();
			imageCorner.translate(  //座標移動多少距離
					(int)(currentPt.getX()-PrevPt.getX()),
					(int)(currentPt.getY()-PrevPt.getY())
					
					);
			PrevPt=currentPt;
			repaint();
		}
	}
}
