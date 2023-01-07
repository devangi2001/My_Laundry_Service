package LaundroMat;
import java.util.*;
import java.io.*;
public class Schedule {
   Scanner sc;
   PrintWriter pw;
   File f;
   public void set()
   {
	   sc=new Scanner(System.in);
	   System.out.println("Please enter Hostel name");
	   String hostel=sc.next();
	   System.out.println("Please enter Day");
	   String day=sc.next();
	   System.out.println("Please enter Time");
	   String time=sc.next();
	   f=new File("schedule.txt");
	   try {
		   pw = new PrintWriter(new FileOutputStream(f, true));
		   sc=new Scanner(f);
		   
	   }
	   catch(FileNotFoundException e)
	   {
		   e.printStackTrace();
	   }
	   int x=0;
	   while(sc.hasNextLine())
   	{
   		StringTokenizer st = new StringTokenizer(sc.nextLine());
   		if (st.nextToken().equalsIgnoreCase(hostel)){
   			System.out.println("You have already set schedule for it on "+st.nextToken()+" at "+st.nextToken() );
   			x=1;
   		}
   }
	   if(x==0)
	   {
		   pw.append(hostel+ " " + day +" " +time+"\n");
	   }
	   sc.close();
	   pw.close();
}
  
   
}