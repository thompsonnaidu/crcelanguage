
abstract  class Person  
{
	protected String name;
	protected String contact_no = "5298345643";
	
	public void setName(String name)  { this.name = name;  }
	public String getName()  { return name; }
	
	public void display()
	{
		System.out.println(name);
		System.out.println(contact_no);
	}
}

class Employee extends Person
{
	protected int id;
	protected float sal;

	public void setSal(float s)
	{
		sal = s;
	}	
	public float getSal()
	{
		return sal;
	}	
	public void setId(int id)
	{
		this.id = id;
	}	
	public void display()
	{
		super.display();
		System.out.println("Sal ="+ sal);
	}	 
}
class Manager extends Employee   {

	protected float allowance;
	
	public float getAllowance()
	{
		return allowance;
	}	
	public void setAll(float all)
	{
		allowance = all;
	}	
	public void display()
	{
		super.display();
		System.out.println("Allowance =" + allowance);
	}	 
}		
public class Exp11  {
	public static void main (String args[])
	{
		Manager m = new Manager();
		Employee e = new Employee();
		
		e.setId(3489);
		e.setName("THOMPSON"); //YOLO
		e.setSal(500000);
		m.setSal(700000);
		m.setAll(60000);
		m.setName("DAVID");
		m.setId(2346);
		
		e.display();
		m.display();
	}
}		 
/* OUTPUT
THOMPSON
5298345643
Sal =500000.0
DAVID
5298345643
Sal =700000.0
Allowance =60000.0

*/