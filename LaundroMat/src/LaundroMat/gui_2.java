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

public class gui_2 extends JFrame 
{
	private JPanel contentPane;
	private JTextField jtextfield1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_2 frame = new gui_2();
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
	public gui_2() {
		setTitle("LaundroMat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter 1 for SignUp and 2 for Login: ");
		lblNewLabel.setBounds(29, 38, 217, 19);
		contentPane.add(lblNewLabel);
		
		jtextfield1 = new JTextField();
		jtextfield1.setBounds(275, 37, 96, 20);
		contentPane.add(jtextfield1);
		jtextfield1.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int y = Integer.parseInt(jtextfield1.getText());
		
				if(y == 1) 
				{
					gui_4 g4 = new gui_4();
					g4.setVisible(true);
					dispose();
				}
				else if( y == 2)
				{
					gui_5 g5 = new gui_5();
					g5.setVisible(true);
					dispose();
				}
				else
					jtextfield1.setText("");
			
			}
		});
		btnNewButton.setBounds(149, 107, 89, 23);
		contentPane.add(btnNewButton);
	}
}
