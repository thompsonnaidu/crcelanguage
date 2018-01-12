import java.util.*;
class Matrix
{
	int r,c;
	int a[][];
	Matrix()
	{ 
		Scanner sc= new Scanner(System.in);
		r=0;
		c=0;
	}
	Matrix (int r,int c)
	{
	  this.r=r;
          this.c=c;
	  a=new int[r][c];
	}
	
	public void Element()
	{
	  Scanner sc=new Scanner (System.in);
	  for(int i=0;i<a.length;i++)
	 
	  for(int j=0;j<a[i].length;j++)
	  a[i][j]=sc.nextInt();
	 
	 
	}
	
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{	for(int j=0;j<a[i].length;j++)
			{    
			     System.out.println(a[i][j]);
		             System.out.println();
	}	}	}		   
		
	public Matrix Multiply(Matrix m)
	{
		Matrix temp=new Matrix (this.r,m.c);
		for(int i=0;i<temp.r;i++)
		for(int j=0;j<temp.c;j++)
		{
		temp.a[i][j]=0;
		for(int k=0;k<c;k++)
		temp.a[i][j]=temp.a[i][j]+a[i][j]*m.a[i][j];

		}
		return temp;
	}
	public boolean Sym()
	{
	if(r!=c) return false;
	for(int i=0;i<r;i++)
	  for(int j=0;j<c;j++)
	    if(a[i][j]!=a[j][i])
	     return false;
	return true;
	}
	public void Transpose()
	{
		for(int i=0;i<a.length;i++)
		  for(int j=0;j<a[i].length;j++)
		  {
	            System.out.println(a[j][i]);
		    System.out.println();
	}         }		
}	
public	class MatrixDemo
	{
		public static void main(String[] args)
		{
		     Scanner sc=new Scanner(System.in);
			 System.out.println("Enter rows and columns for M1");
			 
			 int r1= sc.nextInt();
			 int c1= sc.nextInt();
			 
			 Matrix m1= new Matrix(r1,c1);
			 System.out.println("Enter Elements");
			 
			 m1.Element();
			 
			 System.out.println("Enter rows and columns for M2");
			 int r2= sc.nextInt();
			 int c2= sc.nextInt();
			 
			 Matrix m2= new Matrix(r2,c2);
			 System.out.println("enter elements");
			 m2.Element();
			 
			 Matrix m3 = m1.Multiply(m2);
			 System.out.println(" multiplication matrix");
			 m3.display();
			 
			 System.out.println("Transpose of M1");
			 m1.Transpose();
			 System.out.println("Transpose of M2");
			 m2.Transpose();
			 
			 if(m1.Sym()==true)
			 	System.out.println("Symmetric");
			 else
			 	System.out.println("Unsymmetric");
		}
	}	
/* OUTPUT
Enter rows and columns for M1
2
2
Enter Elements
1
2
3
4
Enter rows and columns for M2
2
2
enter elements
5
6
7
8
 multiplication matrix
10

24

42

64

Transpose of M1
1

3

2

4

Transpose of M2
5

7

6

8

Unsymmetric
BUILD SUCCESSFUL (total time: 25 seconds)

*/
			 
			 					
				
								
		
