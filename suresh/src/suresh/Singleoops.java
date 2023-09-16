package suresh;

class sice
{
	public void m1()
	{
		System.out.println("suresh");
	}
	public void m2()
	{
		System.out.println("fan of prabhas");
	}
}
class suresh1 extends sice
{
	public void m3()
	{
		System.out.println("salaar");
	}
}
public class Singleoops
{
	public static void main(String[] args) {
	suresh1 c=new suresh1();
	c.m1();
	c.m2 ();
	c.m3();

	}

}
