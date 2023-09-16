package suresh;

public class static2 {
	static int atmpin=8080;
	static int pincode=517319;
	static void display()
	{
		System.out.println(pincode);
		static2 obj=new static2();
		System.out.println(obj . atmpin);
	}

	void show ()
	{
		System.out.println(atmpin);
		
		System.out.println(static2.pincode);	
	}

public static void main(String args[])
{
	static2 c=new static2();
	c.show();
	c.display();
}	
}
