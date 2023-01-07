package LaundroMat;
import java.util.*;
import java.io.*;
public class StudentList {
	FileInputStream fi ;
	ObjectInputStream oi ;
   public static void slist()
   {
	   File f=null;
	   Scanner sc=null;
	   try
	   {
		   f=new File("students.txt");
		   sc=new Scanner(f);
		   int i=0;
		   while(sc.hasNext())
		   {
			   i++;
			   String s=sc.nextLine();
			   StringTokenizer st = new StringTokenizer(s);
			   System.out.println(i+". "+st.nextToken()+" password= "+st.nextToken()+" hostel= "+st.nextToken());
		   }
	   }
	   catch (Exception ex) {
           System.out.println(ex);
       }
   }
   public boolean studentDetail()
   {
	   while(true)
	   {
		   try {
			   Scanner sc=new Scanner(System.in);
	           System.out.println("Please enter id of student");
	           String id=sc.next();
	           System.out.println("Please enter date");
	           String date=sc.next();
	           sc.nextLine();
	  		   fi = new FileInputStream(new File("status.txt"));
	  		   oi = new ObjectInputStream(fi);
	  			// Read objects
	  			while(true)
	  			{
	  				Drop d = (Drop) oi.readObject();
	  				if(d.getUserid().equals(id))
	  				{
	  					if(d.getDate().equals(date))
	  					{
	  					System.out.println("Your laundro is currently: "+d.getStatus());
	  					return true;}
	  					
	  				}
	  			}
	  			

	  		} catch (FileNotFoundException e) {
	  			System.out.println("File not found");
		   }
		   catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		   catch (IOException e) {
				System.out.println("No current laundry");
				return false;
		   }
		   finally {
				try {
					oi.close();
				} catch (IOException e) {
					
				}
				try {
					fi.close();
				} catch (IOException e) {
					
				}
			}
}
}}
