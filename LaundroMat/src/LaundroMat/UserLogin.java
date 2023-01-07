package LaundroMat;
import java.io.*;
import java.util.*;
public class UserLogin implements Serializable{
    private String userid,username;
    private File file;
    Scanner sc;
    PrintWriter pw;
    private String studentDetails;
    // no parameter constructor 
    public UserLogin()
    {
    	username="";
    	userid="";
    	file=null;
    	sc=null;
    	pw=null;
    	studentDetails="";
    }
    // parameterized constructor
    public UserLogin(File f)
    {
    	file=f;
    	try{
            pw = new PrintWriter(new FileOutputStream(file, true));
            sc = new Scanner(file);
           }
        catch(Exception e){
            System.out.println(e);
        }
    }
    boolean signIn(String userid,String username,String hostel)
    {
    	while(sc.hasNextLine())
    	{
    		StringTokenizer st = new StringTokenizer(sc.nextLine());
    		if (st.nextToken().equals(userid)){
                sc.close();
                try {
                    sc = new Scanner(file);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                };
                return false;
            }
    	}
    	try {
            pw.append(userid + " " + username +" " +hostel+"\n");
//            System.out.println("Signup complete");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        finally{
            pw.close();
            sc.close();
        }
        return true;
    }
    boolean login(String userid, String username){
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            if (st.nextToken().equals(userid)){
                if (st.nextToken().equals(username)){
                    studentDetails = s.substring(userid.length()+username.length()+2);
                    return true;
                }
            }
        }

        sc.close();
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        };
        return false;
    }

    //function to get user details from database
    String getDetails(){
        return studentDetails;
    }
    	
    }
	


