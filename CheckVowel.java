//example of switch case
import java.util.Scanner;
class CheckVowel
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter any alphabet");
char c=in.next().charAt(0);
switch(c)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
System.out.print("vowel");
break;
default:
System.out.print("consonant");
}
}
}