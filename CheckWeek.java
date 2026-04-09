//example of switch case
import java.util.Scanner;
class CheckWeek
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter any integer no");
int n=in.nextInt();
switch(n)
{
case (1):
System.out.println("sunday");
break;
case (2):
System.out.println("monday");
break;
case (3):
System.out.println("tuesday");
break;
case (4):
System.out.println("wednesday");
break;
case (5):
System.out.println("thursday");
break;
case (6):
System.out.print("friday");
break;
case (7):
System.out.println("saturday");
break;
default:
System.out.print("invalid no");
}
}
}