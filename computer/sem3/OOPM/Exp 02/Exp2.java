
import java.util.Scanner;

class Cal
{
    double x,rs;int n;
    Cal(double x,int n)
    {
     this.n=n;
     this.x=x;
    }
    public void calcos()
    {
     rs=1;
     boolean sign=false;
     System.out.print("cos("+x+")=1");
     for(int i=2;i<=n;i+=2)
     {
         if(sign==false)
         {
            rs=rs-(Math.pow(x,i)/fact(i));
            sign=true;System.out.print("-("+(Math.pow(x,i))+"/"+fact(i)+")");
         }
         else
         {
             rs=rs+(Math.pow(x,i)/fact(i));
             sign=false;System.out.print("+("+(Math.pow(x,i))+"/"+fact(i)+")");
         }
     }
     System.out.println("");
    }
    
    public double fact(double a)
    {
        for(double i=a;i>1;i--)
        {
            a=a*(i-1);
        }
        return a;
    }
    
    public void display()
    {
     System.out.println("cos("+x+")="+rs);
    }
}
public class Exp2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of degree and nuber of term");
        double x=sc.nextDouble();
        int n=sc.nextInt();
        Cal c=new Cal(x,n);
        c.calcos();
        c.display();
    }
}
/*OUTPUT 
Enter the value of degree and nuber of term
45 5
cos(45.0)=1-(2025.0/2.0)+(4100625.0/24.0)
cos(45.0)=169847.875
*/