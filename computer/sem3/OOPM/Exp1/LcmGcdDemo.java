import java.util.Scanner;
public class LcmGcdDemo {
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number:");
    int a = sc.nextInt();
    System.out.println("Enter second number:");
    int b = sc.nextInt();
    System.out.println("GCD = "+ getGcd(a,b));
    System.out.println("LCM = "+(a*b)/getGcd(a,b) );
}    
public static int getGcd(int x, int y) {
    if (x == y) return x;
    else if (x>y) 
        return getGcd(x-y,y);
    else  
        return getGcd(y-x,x);
} 
}
/*
OUTPUT
Enter first number:
5
Enter second number:
6
GCD = 1
LCM = 30
*/