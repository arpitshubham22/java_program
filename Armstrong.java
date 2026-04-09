//example of while loop
import java.util.Scanner;
class Armstrong
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter any integer no");
int n=in.nextInt();
int r;
int s=0;
int n1;
n1=n;
while (n!=0)
{
r=n%10;
s=s+r*r*r;
n=n/10;
}
if (n1==s)
System.out.print("armstrong no");
else
System.out.print(" not armstrong no");
}
}