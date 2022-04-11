import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Class46_MenuBar_Frame extends JFrame implements ActionListener{
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	Class46_MenuBar_Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		loadIcon=new ImageIcon("logo.png");
		saveIcon=new ImageIcon("logo2.png");
		exitIcon=new ImageIcon("logo3.png");
		loadIcon.setImage(loadIcon.getImage().getScaledInstance(25, 25, DO_NOTHING_ON_CLOSE));
		
		menuBar=new JMenuBar();
		fileMenu=new JMenu("File");
		editMenu=new JMenu("Edit");
		helpMenu=new JMenu("Help");
		
		loadItem=new JMenuItem("Load");
		saveItem=new JMenuItem("Save");
		exitItem=new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		                 
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		//JMenu預設要Alt
		fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for edit
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for help
		loadItem.setMnemonic(KeyEvent.VK_L); // L for load
		saveItem.setMnemonic(KeyEvent.VK_S); // S for load
		exitItem.setMnemonic(KeyEvent.VK_E); // E for load
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu); //上面主選單
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		this.setJMenuBar(menuBar);	
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==loadItem) {
			System.out.println("beep boop you loaded a file");
		}
		if (e.getSource()==saveItem) {
			System.out.println("beep boop you loaded a file");
		}
		if (e.getSource()==exitItem) {
			System.out.println("beep boop you loaded a file");
		}
	}
}
