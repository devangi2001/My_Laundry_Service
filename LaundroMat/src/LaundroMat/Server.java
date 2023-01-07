package LaundroMat;
import java.util.*;
import java.io.*;
public class Server {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        String x;
	        do{
	            System.out.print("Enter S for Student or L1 for Admin");
	            x = sc.next();
	        }while (!x.equals("S") && !x.equals("L1"));
	        Student student = null;
	        Admin admin = null;
	        if (x.equals("S"))
	        {
	            int y = 0;
	            do{
	            	
	                System.out.print("Enter 1 for SignUp and 2 for Login: ");
	                y = sc.nextInt();

	            }while (y != 1 && y != 2);
	            System.out.print("Enter your ID: ");
	            String userid = sc.next();
	            sc.nextLine();
	            System.out.print("Enter name: ");
	            String username = sc.nextLine();
	            if (y == 1)
	            {
	                System.out.print("Enter your hostel ");
	                String hostel = sc.next();
	                student = new Student(hostel, userid, username);
	                userid = student.getUserId();
	                username = student.getUserName();
	            }
	            else 
	            {
	                student = new Student(userid, username);
	                userid = student.getUserId();
	                username = student.getUserName();
	            }
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
	            
	        
	        else
	        {
	            System.out.print("Enter your username: ");
	            String username = sc.next();
	            sc.nextLine();
	            System.out.print("Enter password: ");
	            String password = sc.nextLine();
	            admin = new Admin(username, password);
	            username = admin.getUsername();
	            password = admin.getPassword();
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
}
}