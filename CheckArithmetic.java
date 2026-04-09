//example of switch case
import java.util.Scanner;
class CheckArithmetic
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter any integer no");
int a=in.nextInt();
int b=in.nextInt();
System.out.println("enter any arithmetic operator");
char op=in.next().charAt(0);
switch(op)
{
case '+':
System.out.println("sum="+(a+b));
break;
case '-':
System.out.println("subtract="+(a-b));
break;
case '*':
System.out.println("multiply="+(a*b));
break;
case '/':
System.out.println("division="+(a/b));
break;
case '%':
System.out.println("remainder="+(a%b));
break;
default:
System.out.print("wrong arithmetic operator");
}
}
}