import java.util.Scanner;
class Bitwise
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter any integer nos");
int a=in.nextInt();
int b=in.nextInt();
System.out.println("BitwiseAND>"+(a&b));
System.out.println("BitwiseOR="+(a|b));
System.out.println("BitwiseX-OR="+(a^b));
System.out.println("Bitwise left shift="+(a<<3));
System.out.println("Bitwise right shift="+(a>>2));
System.out.println("Bitwise unsigned right shift="+(a>>>2));
}
}