import java.util.*;

class Employee  {

private int id;
private float sal;
static int count = 0;

Employee()
{
	count++;
	this.id = count;
	this.sal = 0;
}
Employee(float sal)
{
    count++;
	this.id = count;
	this.sal = sal;
}
public boolean Compare(Employee e)
{
	if (this.sal > e.sal)
	return true;
	else
	return false;
}
public int getId()  { return id;  }
public float  getSal() { return sal;  }
}
public class EmployeeDemo  {
	public static void main(String args[])
	{
	float temp_sal;
    System.out.println("Enter no of employees!");
    
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	Employee e [] = new Employee[n];
	Employee temp;
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter salary for employee "+(i+1));
		temp_sal = sc.nextFloat();
		e[i] = new Employee (temp_sal);
	}
	for( int i=0;i<n;i++)
		for(int j=0;j<n-1;j++)
		{
			if (e[j].Compare(e[j+1]) == true)
				{
				temp = e[j];
				e[j] = e[j+1];
				e[j+1] = temp;
				}
		}		
	for (int i=0;i<n;i++)
	
      System.out.println("Employee ID = "+e[i].getId() + "Salary " + e[i].getSal() );
	}	
}				
/*
OUTPUT
Enter no of employees!
4
Enter salary for employee 1
50000
Enter salary for employee 2
40000
Enter salary for employee 3
20000
Enter salary for employee 4
70000
Employee ID = 3Salary 20000.0
Employee ID = 2Salary 40000.0
Employee ID = 1Salary 50000.0
Employee ID = 4Salary 70000.0
BUILD SUCCESSFUL (total time: 11 seconds)

*/

