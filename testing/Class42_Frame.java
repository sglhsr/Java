import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Class42_Frame extends JFrame implements ActionListener {
	JRadioButton pizzaBtn=new JRadioButton("pizza");
	JRadioButton hamburgerBtn=new JRadioButton("hamburger");
	JRadioButton hotdogBtn=new JRadioButton("hotdog");
	ImageIcon pizzaIcon;
	ImageIcon hamburgerIcone;
	ImageIcon hotdogIcone;
	Class42_Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaIcon=new ImageIcon("logo.png");
		hamburgerIcone=new ImageIcon("logo2.png");
		hotdogIcone=new ImageIcon("logo3.png");
		pizzaIcon.setImage(pizzaIcon.getImage().getScaledInstance(80, 120, DISPOSE_ON_CLOSE));
		
		ButtonGroup group=new ButtonGroup(); //只能選一個要建buttonGroup
		group.add(pizzaBtn);
		group.add(hamburgerBtn);
		group.add(hotdogBtn);
		
		pizzaBtn.addActionListener(this);
		hamburgerBtn.addActionListener(this);
		hotdogBtn.addActionListener(this);
		pizzaBtn.setIcon(pizzaIcon);
		hamburgerBtn.setIcon(hamburgerIcone);
		hotdogBtn.setIcon(hotdogIcone);
		
		this.add(pizzaBtn);
		this.add(hamburgerBtn);
		this.add(hotdogBtn);
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==pizzaBtn) {
			System.out.println("You ordered pizza ");
		}
		else if(e.getSource()==hamburgerBtn) {
			System.out.println("You ordered hamburger!");
		}
		else if(e.getSource()==hotdogBtn) {
			System.out.println("You ordered hotdog!");
		}
	}
}
