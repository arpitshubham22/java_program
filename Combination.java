import java.util.Scanner;
class Combination
{
static int fact(int n)
{
int f=1;
int i=1;
while (i<=n)
{
f=f*i;
i++;
}
return f;
}
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter value of n and r");
int n=in.nextInt();
int r=in.nextInt();
int  res;
res=fact(n)/fact(r)*fact(n-r);
System.out.print("combination="+res);
}
}

