
public class PatternDemo {
public static void main(String args[]) {
	int i, j=5, k, x;
	for (i=1;i<=5;i++) {
		for (k=1;k<=j;k++) {
			System.out.print(" ");
		}
		for (x=1;x<=i;x++) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.print("\n");
		j--;
	}
	
}
}
/*OUTPUT
     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
*/
