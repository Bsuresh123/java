package suresh;
class  section
{
int a;
public void putdata()
{
	System.out.println();
}
}
class test extends section
{
int x,y;
public void accept(int a,int b)
{
	x=a;
	x=b;
}
public void display()
{
	System.out.println(x+"-----"+y);
}
}
class result extends test
{
	int total;
	public void putresult()
	{
		total=x+y;
		System.out.println(total);
	}
}
public class Multinheritance {

	public static void main(String[] args) {
		result r=new result();
		r.putdata();
		r.display();
		r.putresult();
		
		
		

	}

}
