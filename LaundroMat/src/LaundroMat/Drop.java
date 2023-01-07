package LaundroMat;
import java.util.*;
import java.io.*;
public class Drop implements Serializable{
	Scanner sc;
	PrintWriter pw;
	File f;
	private String userid;
	private String date;
	private String status;
	private double additional_cost;
	private String hostel;
	Drop(String userid)
	{
		this.userid=userid;
		this.date="";
		this.status="";
	}
	Drop(String userid,String date,String status,double additional_cost,String hostel)
	{
		this.userid=userid;
		this.date=date;
		this.status=status;
		this.additional_cost=additional_cost;
		this.hostel=hostel;
	}
	String getUserid()
	{
		return userid;
	}
	String getStatus()
	{
		return status;
	}
	String getHostel()
	{
		return hostel;
	}
	String getDate()
	{
		return date;
	}
	double getAdditionalCost()
	{
		return additional_cost;
	}

	void setStatus(String status)
	{
		this.status=status;
	}
   public boolean dropdetails(Student student)
   {
	   sc=new Scanner(System.in);
	   System.out.println("Please enter kg");
	   double weight=sc.nextInt();
	   System.out.println("Please enter date in dd/mm/yy format");
	   String date1=sc.next();
	   sc.nextLine();
	   System.out.println("Please enter day");
	   String day=sc.next();
	   Drop d;
	   if(correct(day,student.getHostel()))
	   {
		if(weight>6)   
	     {
			double extra=(weight-6)*50;
			System.out.println("you incurred an extra cost of: "+extra);
			d=new Drop(student.getUserId(),date1,"InWash",extra,student.getHostel());
	     
	     }
		else
	      d=new Drop(student.getUserId(),date1,"InWash",0.0,student.getHostel());
	   }
	   else
	   {
		   return false;
	   }
	   try {
			FileOutputStream f = new FileOutputStream(new File("status.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(d);
			o.close();
			f.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		}

	   System.out.println("Success");
	   return true;
	   
	   
   }
   public boolean correct(String day,String hostel)
   {
	   f=new File("schedule.txt");
	   try{
           sc = new Scanner(f);
          }
       catch(Exception e){
           System.out.println(e);
       }
       while(sc.hasNextLine()){
           String s = sc.nextLine();
           StringTokenizer st = new StringTokenizer(s);
           if (st.nextToken().equalsIgnoreCase(hostel))
           {
        	   if (st.nextToken().equals(day))
        		 return true;
        	   else
        	   {
        		   System.out.println("Wrong day sorry");
        		   return false;
        	   }
        			 
           }
       }
       System.out.println("Your hostel is not servicable by laundromat yet,Please contact admin");
	   return false;
   }
     
}
