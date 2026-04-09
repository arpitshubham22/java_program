class Buffer
{
int x;
public synchronized void write(int a)
{
x=a;
System.out.println(a+"is written");
}
public synchronized void read()
{
System.out.println(x+"is read");
}
}
class WriterThread extends Thread
{
Buffer b;
public WriterThread(Buffer b)
{
this.b=b;
}
public void run()
{
System.out.println("writer thread is started");
for(int i=1;i<=10;i++)
b.write(i);
}
}
class ReaderThread extends Thread
{
Buffer b;
public ReaderThread(Buffer b)
{
this.b=b;
}
public void run()
{
System.out.println("writer thread is started");
for(int i=1;i<=10;i++)
b.read();
}
}
class BufferTestOne
{
public static void main(String arr[])
{
System.out.println("mainthread is started");
System.out.println("creating and starting writer and reader thread");
Buffer b=new Buffer();
WriterThread w=new WriterThread(b);
ReaderThread r=new ReaderThread(b);
w.start();
r.start();
}
}



