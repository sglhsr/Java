import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Class44_Slider_Frame implements ChangeListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	Class44_Slider_Frame(){
		frame=new JFrame("Slider Demo");
		panel=new JPanel();
		label=new JLabel();
		slider=new JSlider(0,100,50);
		
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTicks(true);  //��ܨ��
		slider.setMinorTickSpacing(10); //��׶��Z
		
		slider.setPaintTrack(true);  //�u
		slider.setMajorTickSpacing(40); //Label��׶��Z0 40 80
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("Consolas",Font.PLAIN,15));
		
		slider.setOrientation(SwingConstants.VERTICAL);
//		slider.setOrientation(SwingConstants.HORIZONTAL);
		slider.addChangeListener(this);
		label.setText(".C= " + slider.getValue());
		
		panel.add(slider);

		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText(".C= " + slider.getValue());
		
	}
}
