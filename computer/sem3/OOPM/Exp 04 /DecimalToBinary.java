import java.util.*;

class Decimal  {
private int dec;

Decimal()
{
	dec = 0;
}
Decimal(int dec)
{
	this.dec = dec;
}

public int convert_to_binary()
{
	int dec2= dec, i=0, rem, sum =0;
	while (dec2 != 0)
	{
		rem = dec2 % 2;
		dec2 /= 2;
		sum += rem * Math.pow(10.0,(double)i);
		i++;
	}
	return sum;	
}
}	

public class DecimalToBinary   {
	public static void main(String args[])
	{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the number");
	int t = sc.nextInt();
	Decimal decimal = new Decimal(t);
	
	System.out.println (t + " in decimal is " + decimal.convert_to_binary() + " 5in binary");
	}
}	
/*
OUTPUT
Enter the number
5
5 in decimal is 101 in binary
*/
