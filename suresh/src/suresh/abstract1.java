package suresh;
abstract class sures
{
	double dim1,dim2;
	sures(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
	abstract double area();
}
class sai extends sures
{
	sai (double a,double b)
	{
		super(a,b);
	}
	double area ()
	{
		return dim1*dim2;
	}
}
class jaanu extends sai
{
jaanu (double a,double b)
{
	super(a,b);
}
double area ()
{
	return dim1=dim2;
}
}

public class abstract1 {
	

	public static void main(String[] args) {
		
		sai a=new sai(9,5);
		jaanu b=new jaanu (10,8);
		System.out.println(a.area());
		System.out.println(b.area());
	}

}
