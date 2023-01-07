package LaundroMat;
import java.util.*;
import java.io.*;
public class Admin extends UserLogin{
	private String username;
    private String password;
    String getUsername() {
        return username;
    }

    //getter function
    String getPassword() {
        return password;
    }
    Admin(String username, String password) {
//    	while(true)
//    	{
    		if(login(username,password))
    		{
    			launch_frame ob = new launch_frame();
                ob.perform("Login successfull");
    		}

    		else
    		{
//    			Scanner sc=new Scanner(System.in);
//    			System.out.println("enter username again");
//    			username=sc.nextLine();
//    			System.out.println("enter password again");
//    			password=sc.nextLine();
    			System.out.println("Again run the Gui from start !!");
    		}
//    	}
        
    }
    boolean login(String username,String password)
    {
    	this.username="admin";
        this.password="laundropilani";
    	if(username.equals("admin"))
        {
        	if(password.equals("laundropilani"))
        	{
//        		launch_frame ob = new launch_frame();
//                ob.perform("Login successfull");
//        		System.out.println("Login successfull");
        		return true;
        	}
        	else
        	{
        		launch_frame ob = new launch_frame();
                ob.perform("incorrect password");
//        		System.out.println("incorrect password");
        		return false;
        	}
        }
        else
        {
        	launch_frame ob = new launch_frame();
            ob.perform("incorrect username");
//        	System.out.println("incorrect username");
        	return false;
        }
        
    }
}
