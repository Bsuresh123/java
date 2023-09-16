package suresh;
class suresh 
{
	int a,b;
	void suri()
	{
		System.out.println("a+b="+(a+b));
	}
}
class ram extends suresh{
	int c;
	void kittu()
	{
		System.out.println("c="+c);
	}
	void sum ()
	{
		System.out.println(("a+b+c="+(a+b+c)));
	}
	
}

public class inheritance1 {
	

	public static void main(String[] args) {
		
		ram r=new ram();
		
		System.out.println();
		r.a=5;
		r.b=10;
		r.c=15;
		System.out.println("singleclassessum");
		r.kittu();
		r.suri();
		System.out.println();
		System.out.println("sum");
		r.sum();
		
		

	}

}
