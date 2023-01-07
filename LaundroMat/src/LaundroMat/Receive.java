package LaundroMat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
public class Receive {
	FileInputStream fi ;
	ObjectInputStream oi ;
	public void display(Student student)
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
		  					System.out.println("userid= "+d.getUserid()+" date= "+d.getDate()+" status= "+d.getStatus()+" extra cost= "+d.getAdditionalCost());
		  				}
		  			}
		  		} catch (FileNotFoundException e) {
		  			System.out.println("File not found");
			   }
			   catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			   catch (IOException e) {
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
		public void receive(Student student)
		{
			Drop d = null;
				   try {
					   Scanner sc=new Scanner(System.in);
			           System.out.println("Please enter date");
			           String date=sc.next();
			           sc.nextLine();
			  		   fi = new FileInputStream(new File("status.txt"));
			  		   oi = new ObjectInputStream(fi);
			  			// Read objects
			  			while(true)
			  			{
			  				d = (Drop) oi.readObject();
			  				if(d.getUserid().equals(student.getUserId()))
			  				{
			  					if(d.getDate().equals(date))
			  					{
			  						if(d.getStatus().equalsIgnoreCase("ondelivery"))
			  						{
			  							d.setStatus("Delivered");
			  							throw new IOException();
			  						}
			  						else
			  						{
			  							System.out.println("Not out for delivery yet");
			  						}
			  							
			  					}
			  					
			  				}
			  			}
			  		} catch (FileNotFoundException e) {
			  			System.out.println("File not found");
				   }
				   catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				   catch (IOException e) {
						
						
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
						Update u=new Update();
						u.change(d);
					}
		}
}
