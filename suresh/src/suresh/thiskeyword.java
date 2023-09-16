package suresh;
public class thiskeyword
{
	int a=100,b=200;
}

class samanta extends thiskeyword {
	int a=10;
	int b=20;
	void add(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(this. a+this.b);
		 
	}

	public static void main(String[] args) {
		samanta a=new samanta();
		a.add(10, 20);
 
	}

}
