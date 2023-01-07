package LaundroMat;
import java.util.*;
import java.io.*;
public class Update {
	FileInputStream fi ;
	ObjectInputStream oi ;
	ArrayList<Drop> drops=new ArrayList<>();
	void fill()
	{
		try {
			   fi = new FileInputStream(new File("status.txt"));
	    	   oi = new ObjectInputStream(fi);
	    	   while(true)
				{
					Drop d = (Drop) oi.readObject();
					drops.add(d);
				}
		}
		catch(Exception e)
		{
		}
		finally {
			try {
				oi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void update()
	{
		Drop d = null;
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
	    	   String status;
	    	   
			while(true)
			{
				d = (Drop) oi.readObject();
				if(d.getUserid().equals(id))
				{
					if(d.getDate().equals(date))
  					{
  					System.out.println("Please enter new status");
  				     status=sc.next();
  					d.setStatus(status);
  					break;
  					}
				}
			}
			

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("No more current laundries");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				oi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			change(d);
		}

	}
	void change(Drop d)
	{
		fill();
		File f=new File("status.txt");
		f.delete();
		try
		{
			f.createNewFile();
		}
		catch(Exception e)
		{
			
		}
		try {
		   for(Drop d1:drops)
		    {
			if(d1.getUserid().equals(d.getUserid()))
			{
					FileOutputStream f1 = null;
					f1=new FileOutputStream("status.txt",true);
					if(f.length()==0)
					{
						ObjectOutputStream o = new ObjectOutputStream(f1);
						o.writeObject(d);
						o.close();
					}
					f1.close();

			}
			else
			{
				FileOutputStream f1 = new FileOutputStream(new File("status.txt"));
				ObjectOutputStream o = new ObjectOutputStream(f1);
				o.writeObject(d1);
				o.close();
				f1.close();

			}
		}
	}
		catch(Exception e)
		{
		}
		
	}
}
