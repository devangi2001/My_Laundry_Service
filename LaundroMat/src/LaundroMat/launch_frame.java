package LaundroMat;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class launch_frame 
{
     JOptionPane optionpane = new JOptionPane();
     String msg;
     
     
	public void perform(String str) 
	{
		JOptionPane.showMessageDialog(null, str);
		optionpane.setBounds(0,0,150,700);
		optionpane.setFont(new Font(null,Font.PLAIN,12));	
	}
	

}
