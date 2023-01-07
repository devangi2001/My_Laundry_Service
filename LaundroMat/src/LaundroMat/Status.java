package LaundroMat;
import java.util.*;
import java.io.*;
public class Status {
	FileInputStream fi ;
	ObjectInputStream oi ;
	public void getstatus(Student student)
	{
		try {

			 fi = new FileInputStream(new File("status.txt"));
			 oi = new ObjectInputStream(fi);

			// Read objects
			while(true)
			{
				Drop d = (Drop) oi.readObject();
				if(d.getUserid().equals(student.getUserId()))
				{
					if(d.getStatus().equalsIgnoreCase("delivered"))
						continue;
					else	
					   {System.out.println("Your laundro of date "+d.getDate()+" is currently: "+d.getStatus());
					   break;
					   }
				}
			}
			

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("No more current laundry");
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
		}

	}

}
