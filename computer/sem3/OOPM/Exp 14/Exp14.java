/*User Define Exception for illgeal marks*/
import java.util.*;
class IllegalMarksEnteredException extends Exception
{
   IllegalMarksEnteredException()
    {
        System.out.println("Illegal Marks Entered ");
    }

}

class Checkexception
{
    int marks;
  public void getdata()
  {
    Scanner s=new Scanner(System.in);
    marks=s.nextInt();
  }
  
  public void check()
  {
    while(marks>100 || marks<0)
         {
        	try
        	{
		 throw new IllegalMarksEnteredException();
          	}
        	catch(IllegalMarksEnteredException ime)
        	{
        	System.out.print("enter the marks again: ");
        	getdata();
        	}
         }
  }
  
  public void display()
  {
    if(marks>=40)
         {
             System.out.println("you are passed");
         }
         else
         {
             System.out.println("you are failed");
         }
  
  }
}
public class Exp14
{
    public static void main(String[] args) 
     {
         Checkexception ce=new Checkexception();
         System.out.println("enter the marks");
         ce.getdata();
         ce.check();
         ce.display();
         
     }
}
/*OUTPUT
enter the marks
107
Illegal Marks Entered 
enter the marks again: 48
you are passed
*/