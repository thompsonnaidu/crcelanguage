
import java.util.Scanner;

class Fibo implements Runnable
{ 
    int m;
 Fibo(int m)
 {
     this.m=m;
 }
 public void run()
 {
        int prev, next, sum,i;
	prev=next=1;
	try{
        for(i=1;i<=m;i++)
	{
	System.out.println(prev);
	sum=prev+next;
	prev=next;
	next=sum;
        Thread.sleep(1000);
	}
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread interrupted");
            System.exit(0);
        }
 }
}

class Multi extends Thread
{
int n;
Multi(int n)
{
 this.n=n;
}
public void run()
{
   try{ 
       for(int i=1;i>=0;i++)
    {
        System.out.println(n*i);
        Thread.sleep(1000);
    }
   }
   catch(InterruptedException ie)
        {
            System.out.println("Thread interrupted");
            System.exit(0);
        }
}
}
public class Exp15 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n and m");
        int fp=sc.nextInt();
        int sp=sc.nextInt();
        Fibo fi=new Fibo(fp);
        Multi mu=new Multi(sp);
        Thread t1=new Thread(fi);
        mu.start();
        t1.start();
    }
}
/*OUTPUT
Enter the value of n and m
4 85
1
85
1
170
255
2
340
3
425
510
595
680
765
850
935
1020
1105
...
*/