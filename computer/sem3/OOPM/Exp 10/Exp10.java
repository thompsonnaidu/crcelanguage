import java.util.*;
import java.lang.*;

class Clock
{
 int hh,mm,ss;
 Clock()
 {}
 Clock(int hh,int mm,int ss)
 {
  this.hh=hh;
  this.mm=mm;
  this.ss=ss;
 
 }

}

class Dclock extends Clock
{
	String time;
	Dclock(int hh,int mm,int ss )
	{
		 super(hh,mm,ss);

  		if(hh>12)
		{
			
	 		time="PM";
  		}
		else
		{
  			time="AM";
		}
} 
 
 
 void display()
 {
  System.out.println("TIME= "+hh+":"+mm+":"+ss+":"+time);
 }
}

public class Exp10
{
  public static void main(String []args)
  {
   Scanner sc=new Scanner(System.in);
   int n=0;
   int h,m,s;
   System.out.printf("enter the hours:");
    h=sc.nextInt();
  System.out.printf("enter the mins: ");
   m=sc.nextInt();
  System.out.printf("enter the second:");
    s=sc.nextInt();
    if(s>=60)
    {
    	n=s/60;
	s=s%60;
	m=m+n;
    }
    if(m>=60)
    {
    	n=m/60;
	m=m%60;
	h=h+n;
    }
    Dclock d=new Dclock(h,m,s);
    d.display(); 
    
  }

}
/*
OUTPUT
enter the hours:18
enter the mins: 45
enter the second:4
TIME= 18:45:4:PM
*/