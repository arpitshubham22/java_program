class Complex
{
int real,imagi;
public Complex(int x,int y)
{
real=x;
imagi=y;
}
public Complex()
{}
void display()
{
System.out.println(real+"+i"+imagi);
}
Complex div(Complex c2)
{
Complex c3=new Complex();
c3.real=real*c2.real+imagi*c2.imagi/real*c2.real+c2.imagi*imagi;
c3.imagi=imagi*c2.real+real*c2.imagi/real*c2.real+c2.imagi*imagi;
return c3;
}
}
class ComplexDiv
{
public static void main(String arr[])
{
Complex c1=new Complex(3,4);
Complex c2=new Complex(5,6);
System.out.println("first complex no");
c1.display();
System.out.println("second complex no");
c2.display();
Complex c3=c1.div(c2);
System.out.println("complex no after Division");
c3.display();
}
}

