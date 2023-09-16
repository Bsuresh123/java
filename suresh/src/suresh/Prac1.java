package suresh;

class Pramod 
{
	public void a()
	{
		System.out.println("mom");
	}
	public void b()
	{
		System.out.println("dad");
	}
}
class suri extends Pramod
{
	public void c()
	{
		System.out.println("son");
	}
}
public class Prac1
{

  public static void main(String[] args) {
	  Pramod y=new Pramod();
	  y.a();
	  y.b();
	  suri x=new suri();
	  
	  x.c();
	  
	

	}

}
