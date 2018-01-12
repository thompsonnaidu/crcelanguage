import java.util.Scanner;
public class StringFreq2  {

public static void main(String args[])
{
  int vowel_count = 0;  
  int cons_count = 0;
  int special_count = 0;
  int digit_count = 0;
  int space_count = 0;
  
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter a String!");
  String s = sc.nextLine();
  String s1 = s.toLowerCase();
  
  for(int i=0;i<s1.length();i++)
  {
     switch(s1.charAt(i))
     {
        case 'a' :
        case 'e' :
        case 'i' :
        case 'o' :
        case 'u' :
           vowel_count++;
           break;
        case 'b' :
        case 'c' :
        case 'd' :
        case 'f' :
        case 'g' :
        case 'h' :
        case 'j' :
        case 'k' :
        case 'l' :
        case 'm' :
        case 'n' :
        case 'p' :
        case 'q' :
        case 'r' :
        case 's' :
        case 't' :
        case 'v' :
        case 'w' :
        case 'x' :
        case 'y' :
        case 'z' :
          cons_count++;
          break;
        case '1' :
        case '2' :
        case '3' :
        case '4' :
        case '5' :
        case '6' :
        case '7' :
        case '8' :
        case '9' :
        case '0' :
          digit_count++;
          break;
        case ' ':
          space_count++;
          break;
        default:
          special_count++;
          break;
       }
    }   
       System.out.println("Vowel count = " + vowel_count); 
       System.out.println("Consonant count = " + cons_count);
       System.out.println("Digit count = " + digit_count);
       System.out.println("Special count = " + special_count);
       System.out.println("Space count = " + space_count);
   } 
}         
/* OUTPUT
Enter a String!
HeLlo WoRLd 23571 #$^!5
Vowel count = 3
Consonant count = 7
Digit count = 6
Special count = 4
Space count = 3
*/
