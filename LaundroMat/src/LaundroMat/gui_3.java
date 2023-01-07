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

public class gui_3 extends JFrame {

	private JPanel contentPane;
	private JTextField jtextfield1;
	private JTextField jtextfield2;
	Scanner sc = new Scanner(System.in);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_3 frame = new gui_3();
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
	public gui_3() {
		setTitle("LaundroMat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterYourUsername = new JLabel("Enter your username : ");
		lblEnterYourUsername.setBounds(53, 30, 136, 22);
		contentPane.add(lblEnterYourUsername);
		
		jtextfield1 = new JTextField();
		jtextfield1.setColumns(10);
		jtextfield1.setBounds(267, 31, 96, 20);
		contentPane.add(jtextfield1);
		
		jtextfield2 = new JTextField();
		jtextfield2.setColumns(10);
		jtextfield2.setBounds(267, 78, 96, 20);
		contentPane.add(jtextfield2);
		
		JLabel lblEnterPassword = new JLabel("Enter password:");
		lblEnterPassword.setBounds(53, 77, 136, 22);
		contentPane.add(lblEnterPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				     String username = jtextfield1.getText();
				   String password = jtextfield2.getText();
				   Admin admin = new Admin(username, password);
				   String z;
				   while(true)
		            {
		            	System.out.println("Enter AC to see students list");
		            	System.out.println("Enter SA to set schedule");
		            	System.out.println("Enter T to check student status");
		            	System.out.println("Enter U to update student status");
		            	System.out.println("Enter RA to see revenue");
		            	System.out.println("Enter L2 to exit");
		            	z=sc.next();
		            	 if(z.equals("AC"))
		 	            {
		 	            	StudentList.slist();
		 	            }
		 	            if(z.equals("T"))
		 	            {
		 	            	StudentList s=new StudentList();
		 	            	s.studentDetail();
		 	            }
		 	            if(z.equals("SA"))
		 	            {
		 	            	Schedule sch=new Schedule();
		 	            	sch.set();
		 	            }
		 	            if(z.equals("U"))
		 	            {
		 	            	Update u=new Update();
		 	            	u.update();
		 	            }
		 	           if(z.equals("RA"))
		 	            {
		 	            	Revenue r=new Revenue();
		 	            	r.revenue();
		 	            }
		 	            if(z.equals("L2"))
		 	            	break;

		            }
			
			
			}
		});
		btnNewButton.setBounds(154, 156, 89, 23);
		contentPane.add(btnNewButton);
	}
}
