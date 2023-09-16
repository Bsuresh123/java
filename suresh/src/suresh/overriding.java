package suresh;

public class overriding {
	overriding()
	{
		System.out.println("hello");
	}
	overriding(int i)
	{
	System.out.println(i);	
	}
	overriding(char a,int i)
	{
		System.out.println(a+"------"+i);
	}

	public static void main(String[] args) 
	{
	overriding a=new overriding();
	overriding a1=new overriding(10);
	overriding a2=new overriding('s',1);
	}

}
