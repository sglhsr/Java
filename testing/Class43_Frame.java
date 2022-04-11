import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;


public class Class43_Frame  extends JFrame implements ActionListener{
	JComboBox comboBox;
	Class43_Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
//		Integer[] animals= {1,2,3};
		Double[] animals= {1.,2.,3.};
		//String[] animals= {"dog","cat","bird"};
		
		comboBox=new JComboBox(animals);
		comboBox.addActionListener(this);
		comboBox.setEditable(true);
		System.out.println(comboBox.getItemCount());
		
//		comboBox.addItem("Horse");
//		comboBox.insertItemAt("pig", 1);
		comboBox.setSelectedIndex(2);
//		comboBox.removeItem("bird");
//		comboBox.removeItemAt(0);
//		comboBox.removeAll()
//		comboBox.removeAllItems();
		System.out.println(comboBox.getItemCount());
		this.add(comboBox);
		
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem()+" "+ comboBox.getSelectedIndex());
		}
		
	}
	

}
