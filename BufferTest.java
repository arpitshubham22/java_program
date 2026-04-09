import java.io.*;
class Buffer
{
BufferedReader b;
public Buffer()
{
b=new BufferedReader(new InputStreamReader(System.in));
}
public String readData(String s)
{
System.out.println(s);
try
{
return b.readLine();
}
catch(Exception e)
{
throw e;
}
}
}
class BufferTest
{
public static void main(String arr[])throws Exception
{
Buffer b=new Buffer();
String name=b.readData("enter your name");
System.out.println("user name="+name);
String email=b.readData("enter your email-id");
System.out.println("email-id="+email);
}
}

