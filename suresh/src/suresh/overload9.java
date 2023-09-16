package suresh;

public class overload9 {
	void add(int a)
	{
		System.out.println("single argument");
	}
	void add(double x,float f)
	{
		System.out.println("double arguments");
	}
	void add(Float y)
	{
		System.out.println("type of arguments");
	}

	public static void main(String[] args) {
		overload9 g=new overload9();
		g.add(12);
		g.add(12.4f);
		g.add(12345,12.5f);
		

	}

}
