import java.util.*;
class ArrayListDemo
{
public static void main(String arr[])
{
ArrayList al=new ArrayList();
al.add("ANIL");
al.add("SURESH");
al.add("RAMESH");
al.add("SUMAN");
al.add(1,"ANKIT");
al.add("AJAY");
System.out.println("no of elements in arraylist="+al.size());
System.out.println("displaying elements of arraylist in forward direction");
Iterator itr=al.iterator();
while (itr.hasNext())
System.out.println(itr.next());
System.out.println("displaying elements of arraylist in backward direction");
ListIterator itr1=al.ListIterator(al.size());
while (itr1.hasPrevious())
System.out.println(itr1.previous());
System.out.println("result of searching SACHIN in arraylist="+al.contains("SUMAN"));
System.out.println("result of searching AJAY in arraylist="+al.contains("AJAY"));
al.remove(2);
al.remove("ANKIT");
System.out.println("result of indexOf method="+al.indexOf("SUMAN"));
System.out.println("result of lastIndexOf method="+al.lastIndexOf("SUMAN"));
}
}



