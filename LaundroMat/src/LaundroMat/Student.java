package LaundroMat;
import java.io.*;
import java.util.*;
public class Student extends UserLogin implements Runnable{
	 private String userid;
	 private String username; 
	 private String hostel;
	 private Account ac;
	 private double login=0;
	 Scanner sc;
	 Student()
	 {
		 username="";
		 userid="";
	 }
	    //username getter function
	    String getUserId() {
	        return userid;
	    }

	    //password getter function
	    String getUserName() {
	        return username;
	    }
	    String getHostel()
	    {
	    	return hostel;
	    }
	    Account getAccount()
	    {
	    	return ac;
	    }
	    
	    Student(String hostel, String userid, String username) {
	        super(new File("students.txt"));
	        sc = new Scanner(System.in);
	        this.hostel = hostel;
	        this.username = username;
	        this.userid = userid;
	        this.ac=new Account();
	        Thread t=new Thread(this);
	        t.start();
	        try {
	        	t.join();
	        }catch(Exception e)
	        {
	        	
	        }
	        }
	    Student(String userid, String username){
	        super(new File("students.txt"));
	        sc = new Scanner(System.in);
	        this.username = username;
	        this.userid = userid;
	        this.login=1;
	        Thread t=new Thread(this);
	        t.start();
	        try {
	        	t.join();
	        }catch(Exception e)
	        {
	        	
	        }
	        this.ac=new Account();
	        ac.get(userid,hostel);
	        }
	    public void run(){
	    	if(this.login==1)
	    	{
	    		this.studentLogin();
	    	}
	    	else
	    	{
	        while (true) {
	            if (signIn(userid,username,hostel)) {
	               obtaininfo();
	               File f=new File("schedule.txt");
	         	   try{
	                    sc = new Scanner(f);
	                   }
	                catch(Exception e){
	                    System.out.println(e);
	                }
	                while(sc.hasNextLine()){
	                    String s = sc.nextLine();
	                    StringTokenizer st = new StringTokenizer(s);
	                    if (st.nextToken().equals(hostel))
	                    {
	                    	System.out.println("Your alloted day is "+st.nextToken());
	                    }
	                }
	                ac.add(userid,hostel);
	                
	                break;
	            }
	            System.out.println("The userid already exists, please try again");
	            System.out.print("Enter id: ");
	            userid = sc.next();
	            sc.nextLine();
	            System.out.print("Enter name: ");
	            username = sc.nextLine();
	        }}
	    }
	    public void studentLogin(){
	        while(true){
	            if (login(userid, username)){
	                hostel= getDetails();
	                obtaininfo();
	                break;
	            }
	            int choice;
	            System.out.print("Wrong info, enter 1 to try again, 2 to go to signUp: ");
	            while(true) {
	                choice = sc.nextInt();
	                if(choice == 1 || choice == 2)
	                    break;
	                else
	                    System.out.print("Enter 1 to login or enter 2 to signup: ");
	            }
	            sc.nextLine();
	            System.out.print("Enter id: ");
	            userid = sc.next();
	            sc.nextLine();
	            System.out.print("Enter name: ");
	            username = sc.nextLine();
	            if (choice == 2){
	                System.out.print("Enter phone number ");
	                hostel=sc.next();
	                this.run();
	                break;
	            }
	            
	        }
	    }
	    public void obtaininfo() {
	    	System.out.println("Welcome, " + username);
	    }
}
