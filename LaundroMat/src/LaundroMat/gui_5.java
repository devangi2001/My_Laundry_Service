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

public class gui_5 extends JFrame {

	private JPanel contentPane;
	private JTextField jtextfiedl1;
	private JTextField jtextfield2;
	Scanner sc = new Scanner(System.in);

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_5 frame = new gui_5();
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
	public gui_5() {
		setTitle("LaundroMat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter your ID: ");
		lblNewLabel.setBounds(50, 29, 136, 22);
		contentPane.add(lblNewLabel);
		
		jtextfiedl1 = new JTextField();
		jtextfiedl1.setColumns(10);
		jtextfiedl1.setBounds(264, 30, 96, 20);
		contentPane.add(jtextfiedl1);
		
		jtextfield2 = new JTextField();
		jtextfield2.setColumns(10);
		jtextfield2.setBounds(264, 77, 96, 20);
		contentPane.add(jtextfield2);
		
		JLabel lblEnterName = new JLabel("Enter name: ");
		lblEnterName.setBounds(50, 76, 136, 22);
		contentPane.add(lblEnterName);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				     String userid = jtextfiedl1.getText();
				   String username = jtextfield2.getText();
				   Student student = new Student(userid, username);
				   
		            String z;
		            while(true)
		            {
		            	System.out.println("Enter D to drop laundro");
		            	System.out.println("Enter C to see current laundro status");
		            	System.out.println("Enter B to see all washes details");
		            	System.out.println("Enter R to receive a laundro");
		            	System.out.println("Enter 0 to exit");
		            	sc=new Scanner(System.in);
		                z=sc.next();
		                sc.nextLine();
		                if(z.equals("D"))
		                	{Drop d=new Drop(student.getUserId());
		                	d.dropdetails(student);}
		                if(z.equals("C"))
	                	{Status d=new Status();
	                	d.getstatus(student);}
		                if(z.equals("B"))
		                {
		                   Receive r=new Receive();
		                   r.display(student);   		   
		                }
		                if(z.equals("R"))
		                {
		                   Receive r=new Receive();
		                   r.receive(student);   		   
		                }
		            	if(z.equals("0"))
		            		break;
		            }
			}
		});
		btnNewButton.setBounds(151, 155, 89, 23);
		contentPane.add(btnNewButton);
	}

}
