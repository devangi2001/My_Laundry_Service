package LaundroMat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gui_1 extends JFrame {

	private JPanel contentPane;
	private JTextField jtextfield1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_1 frame = new gui_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public gui_1() {
		setTitle("LaundroMat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter S for Student or L1 for Admin");
		lblNewLabel.setBounds(26, 38, 219, 28);
		contentPane.add(lblNewLabel);
		
		jtextfield1 = new JTextField();
		jtextfield1.setBounds(299, 42, 96, 20);
		contentPane.add(jtextfield1);
		jtextfield1.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			     String x = jtextfield1.getText();
			     		     			    
			     if(x.equals("S"))
			     {
			    	 gui_2 g2 = new gui_2();
			         g2.setVisible(true);
			    	 dispose();
			     }
			     else if(x.equals("L1"))
			     {
			    	 gui_3 g3 = new gui_3();
			         g3.setVisible(true);
			    	 dispose();
			     }
			     else
			    	 jtextfield1.setText("");
			    
			}
		});
		btnNewButton.setBounds(156, 131, 89, 23);
		contentPane.add(btnNewButton);
	}
}
