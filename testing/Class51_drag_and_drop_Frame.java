import javax.swing.JFrame;

public class Class51_drag_and_drop_Frame extends JFrame {
	
	Class51_drag_and_drop_DragPanel dragPanel=new Class51_drag_and_drop_DragPanel();
	
	
	Class51_drag_and_drop_Frame(){
		this.add(dragPanel);
		this.setTitle("Drag & Drop title demo");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
