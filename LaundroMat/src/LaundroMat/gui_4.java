package LaundroMat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class gui_4 extends JFrame {

	private JPanel contentPane;
	private JTextField jtextfiedl1;
	private JTextField jtextfiedl2;
	private JTextField jtextfiedl3;
	Scanner sc = new Scanner(System.in);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_4 frame = new gui_4();
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
	public gui_4() {
		setTitle("LaundroMat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter your ID: ");
		lblNewLabel.setBounds(34, 26, 136, 22);
		contentPane.add(lblNewLabel);
		
		jtextfiedl1 = new JTextField();
		jtextfiedl1.setBounds(248, 27, 96, 20);
		contentPane.add(jtextfiedl1);
		jtextfiedl1.setColumns(10);
		
		JLabel lblEnterName = new JLabel("Enter name: ");
		lblEnterName.setBounds(34, 73, 136, 22);
		contentPane.add(lblEnterName);
		
		jtextfiedl2 = new JTextField();
		jtextfiedl2.setColumns(10);
		jtextfiedl2.setBounds(248, 74, 96, 20);
		contentPane.add(jtextfiedl2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter your hostel ");
		lblNewLabel_1_1.setBounds(34, 121, 136, 22);
		contentPane.add(lblNewLabel_1_1);
		
		jtextfiedl3 = new JTextField();
		jtextfiedl3.setColumns(10);
		jtextfiedl3.setBounds(248, 122, 96, 20);
		contentPane.add(jtextfiedl3);
		
		JButton btnNewButton = new JButton("SignUp");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			   String userid = jtextfiedl1.getText();
			   String username = jtextfiedl2.getText();
			   String hostel = jtextfiedl3.getText();
			   Student student = new Student(hostel, userid, username);

			}
		});
		btnNewButton.setBounds(142, 189, 89, 23);
		contentPane.add(btnNewButton);
	}
}
