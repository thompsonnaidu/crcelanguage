import java.util.*;

class Complex  {
private float real;
private float img;

Complex()
 {
  real = img = 0;
 }
Complex (float real, float img)
 {
  this.real = real;
  this.img = img;
 }

public float getReal()
 {
  return real;
 }
public float getImg ()
 {
  return img;
 }
public Complex add (Complex c)
 {
  return new Complex(this.real + c.real , this.img + c.img);
 }
}
public class DemoComplex   {
	public static void main (String args[]) {
	
	float real_1, img_1, real_2, img_2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first complex number!");
	System.out.println("Real part");
	real_1 = sc.nextFloat(); 
	System.out.println("Imaginary part");
	img_1 = sc.nextFloat();
    
    System.out.println("Enter second complex number!");
	System.out.println("Real part");
	real_2 = sc.nextFloat(); 
	System.out.println("Imaginary part");
	img_2 = sc.nextFloat();
	
	Complex c1 = new Complex(real_1,img_1);
    Complex c2 = new Complex(real_2,img_2);
    
    Complex c3 = c1.add(c2) ;
        
    System.out.println ("Sum is"+c3.getReal() + "+ " + c3.getImg() + "i");
    }
 }       
/*
OUTPUT
Enter first complex number!
Real part
6
Imaginary part
3
Enter second complex number!
Real part
89
Imaginary part
5
Sum is95.0+ 8.0i
BUILD SUCCESSFUL (total time: 8 seconds)

*/