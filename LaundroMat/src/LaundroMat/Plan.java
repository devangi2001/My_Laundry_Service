package LaundroMat;
import java.util.*;
import java.io.*;
public class Plan implements Serializable{
	int washes;
	int rate;
	boolean iron;
	Plan()
	{
		washes=0;
		rate=0;
		iron=false;
	}
	Plan(int washes,int rate,boolean iron)
	{
		this.washes=washes;
		this.rate=rate;
		this.iron=iron;
	}
	public String toString()
	{
		return washes+" "+rate+" "+iron;
	}
	public static void display()
	{
		System.out.println("1.Washes=7 Iron=No Rate=1000");
		System.out.println("2.Washes=7 Iron=Yes Rate=1500");
		System.out.println("3.Washes=10 Iron=No Rate=1700");
		System.out.println("4.Washes=10 Iron=Yes Rate=2000");
		System.out.println("5.Washes=15 Iron=No Rate=2500");
		System.out.println("6.Washes=15 Iron=Yes Rate=3000");
		System.out.println("Please enter plan number you want to select:");
	}
	public static Plan select(int x)
	{
		Plan p;
		if(x==1)
		{
			p=new Plan(7,1000,false);
			return p;
		}
	    if(x==2)
		{
			p=new Plan(7,1500,true);
			return p;
		}
		if(x==3)
		{
			p=new Plan(10,1700,false);
			return p;
		}
		if(x==4)
		{
			p=new Plan(10,2000,true);
			return p;
		}
		if(x==5)
		{
			p=new Plan(15,2500,false);
			return p;
		}
		if(x==6)
		{
			p=new Plan(15,3000,true);
			return p;
		}
		p=new Plan();
		return p;
		
	}
}
