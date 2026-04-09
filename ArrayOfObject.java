class Student implements Cloneable
{
int roll;
String name,course;
public Student(int r,String b,String c)
{
roll=r;
name=b;
course=c;
}
public void display()
{
System.out.println("roll="+roll);
System.out.println("name="+name);
System.out.println("course="+course);
}
protected Object clone()throws CloneNotSupportedException
{
return super.clone();
}
}
class ArrayOfObject
{
public static void main(String arr[])throws CloneNotSupportedException
{
Student s[]=new Student[3];
s[0]=new Student(101,"aman","bca");
s[1]=new Student(103,"alok","bca");
s[2]=new Student(105,"ajay","bca");
System.out.println("records of array of object");
for(int i=0;i<s.length;i++)
s[i].display();
Student s1[]=new Student[3];
for(int i=0;i<s.length;i++)
s1[i]=(Student)s[i].clone();
System.out.println("contents of array of object after cloneing");
for(int i=0;i<s.length;i++)
s1[i].display();
for(int i=0;i<s1.length;i++)
s1[i].roll=s1[i].roll+1;
System.out.println("contents array of object after change");
for(int i=0;i<s.length;i++)
s[i].display();
for(int i=0;i<s1.length;i++)
s1[i].display();
}
}

