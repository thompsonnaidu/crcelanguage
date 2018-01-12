
public class Max3Demo {
public static void main (String args[])
{
    int a,b,c;  int max ,mid ,min;
	max = mid = min =0;
    a = Integer.parseInt(args[0]);
    b = Integer.parseInt(args[1]);
    c = Integer.parseInt(args[2]);
    if (a>b && a>c)
        max = a;
    else if (b>a && b>c)
        max = b;
    else if (c>a && c>b)
        max = c;
    if (a<b && a<c)
        min = a;
    else if (b<a && b<c)
        min = b;
    else if (c<a && c<b)
        min = c;
    if (a<max && a>min)
        mid = a;
    else if (b<max && b>min)
        mid = b;
    else if (c<max && c>min)
        mid = c;
    System.out.println(min + " "+mid + " "+max);
    
}
}
