class First implements Cloneable
{
int a,b;
public First(int x,int y)
{
a=x;
b=y;
}
public void display()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
protected Object clone()throws CloneNotSupportedException
{
return super.clone();
}
}
class ClonningTest
{
public static void main(String arr[])throws CloneNotSupportedException
{
First f=new First(5,6);
f.display();
First f1=(First)f.clone();
f1.display();
System.out.println(f==f1);
f1.a=f1.a+5;
f1.b=f1.b+5;
System.out.println("object contents after change");
f.display();
f1.display();
}
}


