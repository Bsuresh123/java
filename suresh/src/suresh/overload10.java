package suresh;

public class overload10 {
	public int method (int x,float y)
	{
	System.out.println("method1");
	return x;
	}
	void method2()
	{
		System.out.println("method 2");
	}
	void method3()
	{
		System.out.println("method 3");
	}
	String method4()
	{
	System.out.println("method4");
	return "java";
	}
	public static void main(String[] args) {
		overload10 f=new overload10();
		f.method(4,12.5f);
		f.method2();
		f.method3();
		f.method4();
		

	}

}
