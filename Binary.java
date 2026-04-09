//example of while loop
import java.util.Scanner;
class Binary
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter any integer no");
int n=in.nextInt();
int r;
int j=1;
int s=0;
while (n!=0)
{
r=(n%10);
r=r*j;
s=s+r;
j=j*2;
n=n/10;
}
System.out.println("binary to decimal="+s);
}
}