import java.util.*;
public class StringFreq
{
	public static void main(String[] args)
	{	int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		char[] ch= new char[s.length()];
		ch= s.toCharArray();
		for(int i=0;i<s.length();i++)
		{	
			c=1;
			if(ch[i]!='$')
			{
				for(int j=i+1;j<s.length();j++)
				{
					
					if(ch[i]==ch[j])
					{
						c++;
						ch[j]='$';
					}
				}
				System.out.print(ch[i]);
				System.out.println(c);
			}
		}
	}
}
/* OUTPUT
Enter the string
Hello World 1234 %^$#
H1
e1
l3
o2
 3
W1
r1
d1
11
21
31
41
%1
^1
#1
BUILD SUCCESSFUL (total time: 18 seconds)

*/
