package suresh;

public class Multithreading1 extends Thread 
{
	public void run()
	{
		for(int i=0;i<5;i++) {
		
		System.out.println("hello suresh");
		}
	}
public static void main(String[] args) 
{
Multithreading1 a=new Multithreading1();
a.start();
for(int i=0;i<5;i++)
{
	System.out.println("suresh");
}
System.out.println("-----------");
}
}
