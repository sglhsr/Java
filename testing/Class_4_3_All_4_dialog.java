import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Class_4_3_All_4_dialog {
	JFrame jf=new JFrame("Test msg dialogbox");
	JTextArea jta=new JTextArea(16,30);
	JButton btn_ShowMSG=new JButton(new AbstractAction("彈出showMSG對話") {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(jf,jta.getText());
		}
	});
	JButton btn_Confirmed=new JButton(new AbstractAction("彈出confirm對話") {
		public void actionPerformed(ActionEvent e) {
			int result=JOptionPane.showConfirmDialog(jf,jta.getText(),"確認對話方塊Title",
					JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			if (result==JOptionPane.YES_OPTION) {
				jta.append("\n User click confirm");				
			}
			if (result==JOptionPane.NO_OPTION) {
				jta.append("\n User click No confirm");				
			}
		}
	});
	JButton btn_Input=new JButton(new AbstractAction("彈出input對話") {
		public void actionPerformed(ActionEvent e) {
			Object input =JOptionPane.showInputDialog(jf, "", "輸入對話方塊",JOptionPane.DEFAULT_OPTION,
					null,new String[] {"柳巖", "舒淇", "龔玥菲"},"舒淇");
			if (input!=null) {
				jta.append(input.toString());
			}
		}
	});
	JButton btn_Option =new JButton(new AbstractAction("彈出Option對話") {
		public void actionPerformed(ActionEvent e) {
			int option=JOptionPane.showOptionDialog(jf, "請選擇號碼", "選項對話方塊Title",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,
					new String[] {"Op1","Op2","Op3"},"Op2");
			switch(option) {
				case 0:
					jta.setText("Choice Op1");
					break;
				case 1:
					jta.setText("Choice Op2");
					break;
				case 2:
					jta.setText("Choice Op3");
					break;
			}
		}
	});
	public void init() {
		jf.add(jta);
		jf.add(btn_ShowMSG,BorderLayout.NORTH);
		jf.add(btn_Confirmed,BorderLayout.AFTER_LINE_ENDS);
		jf.add(btn_Input,BorderLayout.AFTER_LAST_LINE);
		jf.add(btn_Option,BorderLayout.WEST);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		new Class_4_3_All_4_dialog().init();
	}
}
