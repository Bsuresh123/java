package suresh;

class oop {
	int no;
	public void getstudent(int a)
	{
		no=a;
	}
	void putdata()
	{
		System.out.println("no");
	}
}
class tes extends oop
{
	int m1,m2;
	void accept(int x,int y)
	{
		m1=x;
		m2=y;
	}
	void display()
	{
		System.out.println(m1+"------"+m2);
	}
}
class resul extends tes
{
	int total;
	void putresult()
	{
		total=m1+m2;
	}
	{
		System.out.println(total);
	}
}
public class oops3
{
	
	

	public static void main(String[] args) {
		resul n=new resul();
		n.getstudent(19);
		n.accept(12, 2);
		n.putdata();
		n.putresult();
		n.display();
		}

}
