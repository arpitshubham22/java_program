abstract class Figure
{
double r;
public Figure(double x)
{
r=x;
}
void display()
{
System.out.println("radius="+r);
}
abstract double vol();
}
class Sphere extends Figure
{
public Sphere(double x)
{
super(x);
}
double vol()
{
return 4*3.141*r*r*r/3;
}
}
class Cone extends Figure
{
double h;
public Cone(double a,double b)
{
super(a);
h=b;
}
void display()
{
super.display(); 
System.out.println("height="+h);
}
double vol()
{
return 3.141*r*r*h/3;
}
}
class AbstractMethod
{
public static void main(String arr[])
{
Sphere s=new Sphere(4.5);
s.display();
System.out.println("volume of a sphere="+s.vol());
Cone c=new Cone(5.6,3.9);
c.display();
System.out.println("volume of a cone="+c.vol());
c.vol();
}
}
