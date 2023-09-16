package suresh;
class sam
{
	static int x=1;
	void display()
	{
		x++;
		System.out.println("X="+x);
	}
	
}

public class loadstatic {

	public static void main(String[] args) {
		sam b=new sam();
		b.display();
		sam b1=new sam();
		b1.display();
		sam b2=new sam();
		b2.display();
		sam b3=new sam();
		b3.display();
		
	}

}
