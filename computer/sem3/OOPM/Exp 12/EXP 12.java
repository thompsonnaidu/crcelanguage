//---------------------------Valencia Dias 7368----------------------//
abstract class Account  {

	protected int id;
	protected float bal;
	
	Account ()
	{
		id = 345678;
		bal = 10000;
	}
	Account(int id, float bal )
	{
		this.id = id;
		this.bal = bal;
	}		
	
	public abstract boolean withdraw (float amt);
	public void deposit(float amt)
	{
		bal += amt;
	}	
	public float getBal()  
		{ return bal;  }
	public int getId()
		{  return id;  }
}

class SavAcc extends Account implements Iloan {
	
	SavAcc (int id, float bal)
	{
		super(id, bal);
	}
	public boolean withdraw (float amt)
	{
		if(amt > bal)
			return false;
		else  {
			bal -= 	amt;
			return true;
	    }
	 }
	 public void calInt(int loan, int years)   
	 {
	 	float interest = bal * years* 0.08f;
	 	System.out.println("Interest is" + interest );
	 }
	 	
}	
class CurrAcc extends Account implements Iloan {
	final int minbal = 1000;
	final int pen = 100;
	
	CurrAcc  (int id, float bal)
	{
		super(id, bal);
	}
	public boolean withdraw (float amt)
	{
		if(bal >= amt)
			{
			bal -= amt;
			if(bal < minbal)
				bal -= pen;
			return true;	
			}
		else { System.out.println("Less Balance");	return false;  }	
	}
	public void calInt(int loan, int years)
	{
		float intr = bal * years * 0.15f;
		System.out.println("Interest is "+intr+ loan/years + 100);
	}
}
interface Iloan  {
	public void calInt(int loan , int years);
}
public class AccountDemo {
	public static void main(String[] args)
	{
	SavAcc SA = new SavAcc(76788,50000);
	CurrAcc CA = new CurrAcc (346321, 70000);
	
	SA.deposit(10000);
	CA.deposit(10000);
	
	SA.withdraw (30000);
	
	System.out.println("Balance of SA is "+ SA.getBal());
	System.out.println("Balance of SA is "+ CA.getBal());	
	
	SA.calInt(8000,3);
	CA.calInt(6000,1);
	}	
}	
/*OUTPUT
Balance of SA is 30000.0
Balance of SA is 80000.0
Interest is7200.0
Interest is 12000.06000100
*/
