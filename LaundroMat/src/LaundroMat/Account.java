package LaundroMat;
import java.util.*;
import java.io.*;
public class Account implements Serializable{
    private Plan p;
    private int cost;
    private int total_cost;
    private File f;
    private String hostel ;
    PrintWriter pw;
    Scanner sc;
    Plan getPlan()
    {
    	return p;
    }
    int getCost()
    {
    	return cost;
    }
    int getTotalCost()
    {
    	return total_cost;
    }
    Account()
    {
    	p=new Plan();
    	cost=0;
    	total_cost=0;
    	f=new File("accounts.txt");
    	try
    	{
    		pw = new PrintWriter(new FileOutputStream(f, true));
            sc = new Scanner(f);
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
    public void get(String userid,String hostel)
    {
    	try {
            sc = new Scanner(f);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        };
    	while(sc.hasNextLine())
    	{
    		StringTokenizer st = new StringTokenizer(sc.nextLine());
    		if (st.nextToken().equals(userid)){
    			this.total_cost=Integer.parseInt(st.nextToken());
    			this.p=new Plan(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Boolean.parseBoolean(st.nextToken()));
    		    this.cost=p.rate;
    		    this.hostel=hostel;
    		}
    	}
    }
    public void add(String userid,String hostel)
    {
        sc=new Scanner(System.in);
        int x=0;
    	while(true)
    	{
        Plan.display();
        x=sc.nextInt();
        if(x==1 || x==2 || x==3 || x==4 || x==5|| x==6)
        	break;
    	}	
    	this.p=Plan.select(x);
    	this.cost=p.rate;
    	this.total_cost=p.rate;
    	this.hostel=hostel;
        try {
            sc = new Scanner(f);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        };
    	if (confirm(userid)) {
    		System.out.println(userid+" total cost "+total_cost+" "+p);
        }
    	else
    	{
    		System.out.println("You already have a plan");
    	}
    	sc.close();
    }
    public boolean confirm(String userid)
    {
    	while(sc.hasNextLine())
    	{
    		StringTokenizer st = new StringTokenizer(sc.nextLine());
    		if (st.nextToken().equals(userid)){
                sc.close();
                try {
                    sc = new Scanner(f);
                } catch (FileNotFoundException e) {
                    System.out.println(e);
                };
                return false;
            }
    	}
    	try {
            pw.append(userid + " " + total_cost +" "+p+" "+hostel+"\n");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        finally{
            pw.close();
            sc.close();
        }
        return true;
    }
    
    
}
