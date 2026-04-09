import java .util.Scanner;
class Check
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter age of person");
int a=in.nextInt();
String s=a>=12?"person able to covid vaccine":"person not able to covid vaccine";
System.out.println(s);
}
}
