abstract class First
{
abstract void display();
}
class One extends First
{
int x;
public One(int a)
{
x=a;
}
void display()
{
System.out.println("a="+x);
}
}
class Two extends First
{
String name;
public Two  (String s)
{
name=s;
}
void display()
{
System.out.println("name="+name);
}
}
class AbstractTest
{
public static void main(String arr[])
{
First f;
f=new One(5);
f.display();
f=new Two("RAMAN");
f.display();
}
}
