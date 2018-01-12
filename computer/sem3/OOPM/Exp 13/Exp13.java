
import java.util.Scanner;

interface Stackdemo
{
  public void push(long j);
   public long pop();
   public void peek();
  public boolean isEmpty();
   public boolean isfull();
}
class Stackimp implements Stackdemo
{
   int maxSize;
   long[] stackArray;
   int top;
  Stackimp(int s)
  {
      maxSize = s;
      stackArray = new long[maxSize];
      top = -1;
  }
  
  public void push(long j)
  {
    stackArray[++top] = j;
  }

    public long pop() {
        return stackArray[top--];
    }
    public void peek() 
    {
        System.out.println(stackArray[top]); ;
    }
    public boolean isEmpty()
    {
      return (top == -1);
    }
    public boolean isfull()
    {
        return (top == maxSize - 1);
    }
  
}
public class Exp13 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Stack");
        int s=sc.nextInt();
        Stackimp sta=new Stackimp(s);
        while(true)
        {
            System.out.println("1.push \n 2.pop \n 3.display top \n 4.exit");
            s=sc.nextInt();
            switch(s)
            {
                case 1:System.out.println("enter the one element");
                       s=sc.nextInt();
                       sta.push(s);
                       break;
                
                case 2:sta.pop();
                        System.out.println("top of the stack  poped");
                        break;
                
                case 3:sta.peek();
                       break;
                    
                case 4:System.exit(0);
                       break;
                    
                default: System.out.println("wrong choice");
            
            }
            System.out.println("enter your choice");
        }
    }
}
/*OUTPUT
Enter the size of the Stack
75
1.push 
 2.pop 
 3.display top 
 4.exit
1
enter the one element
45
enter your choice
1.push 
 2.pop 
 3.display top 
 4.exit
1
enter the one element
57
enter your choice
1.push 
 2.pop 
 3.display top 
 4.exit
1457
wrong choice
enter your choice
1.push 
 2.pop 
 3.display top 
 4.exit
1
enter the one element
154
enter your choice
1.push 
 2.pop 
 3.display top 
 4.exit
2
top of the stack  poped
enter your choice
1.push 
 2.pop 
 3.display top 
 4.exit
3
57
enter your choice
1.push 
 2.pop 
 3.display top 
 4.exit
3
57
enter your choice
1.push 
 2.pop 
 3.display top 
 4.exit
2
top of the stack  poped
enter your choice
1.push 
 2.pop 
 3.display top 
 4.exit
3
45
enter your choice
1.push 
 2.pop 
 3.display top 
 4.exit
4*/