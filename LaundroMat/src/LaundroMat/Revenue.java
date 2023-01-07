package LaundroMat;
import java.util.*;
import java.io.*;
public class Revenue {
Scanner sc;
File f;
FileInputStream fi ;
ObjectInputStream oi ;
	public void revenue()
	{
		double Vyas = 0;
		double Shankar=0;
		double Meera=0;
		double Ram=0;
		double Buddh=0;
		double Krishna=0;
		double Gandhi=0;
		double SR=0;
		double Malviya=0;
		f=new File("accounts.txt");
		try {
            sc = new Scanner(f);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        };
    	while(sc.hasNextLine())
    	{
    		StringTokenizer st = new StringTokenizer(sc.nextLine());
    		st.nextToken();
    		int cost=Integer.parseInt(st.nextToken());
    		st.nextToken();
    		st.nextToken();
    		st.nextToken();
    		String hostel=st.nextToken();
    		if(hostel.equalsIgnoreCase("vyas"))
    			Vyas+=cost;
    		if(hostel.equalsIgnoreCase("shankar"))
    			Shankar+=cost;
    		if(hostel.equalsIgnoreCase("meera"))
    			Meera+=cost;
    		if(hostel.equalsIgnoreCase("ram"))
    			Ram+=cost;
    		if(hostel.equalsIgnoreCase("buddh"))
    			Buddh+=cost;
    		if(hostel.equalsIgnoreCase("krishna"))
    			Krishna+=cost;
    		if(hostel.equalsIgnoreCase("gandhi"))
    			Gandhi+=cost;
    		if(hostel.equalsIgnoreCase("sr"))
    			SR+=cost;
    		if(hostel.equalsIgnoreCase("malviya"))
    			Malviya+=cost;
    	}
    	sc.close();
    	try {

			 fi = new FileInputStream(new File("status.txt"));
			 oi = new ObjectInputStream(fi);
             // Read objects
			while(true)
			{
				Drop d = (Drop) oi.readObject();
                String hostel=d.getHostel();
                double cost=d.getAdditionalCost();
                if(hostel.equalsIgnoreCase("vyas"))
        			Vyas+=cost;
        		if(hostel.equalsIgnoreCase("shankar"))
        			Shankar+=cost;
        		if(hostel.equalsIgnoreCase("meera"))
        			Meera+=cost;
        		if(hostel.equalsIgnoreCase("ram"))
        			Ram+=cost;
        		if(hostel.equalsIgnoreCase("buddh"))
        			Buddh+=cost;
        		if(hostel.equalsIgnoreCase("krishna"))
        			Krishna+=cost;
        		if(hostel.equalsIgnoreCase("gandhi"))
        			Gandhi+=cost;
        		if(hostel.equalsIgnoreCase("sr"))
        			SR+=cost;
        		if(hostel.equalsIgnoreCase("malviya"))
        			Malviya+=cost;
        	}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			
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
    	System.out.println("Vyas="+Vyas);
    	System.out.println("Shankar="+Shankar);
    	System.out.println("Meera="+Meera);
    	System.out.println("Ram="+Ram);
    	System.out.println("Buddh="+Buddh);
    	System.out.println("Krishna="+Krishna);
    	System.out.println("Gandhi="+Gandhi);
    	System.out.println("SR="+SR);    	
	}
}
