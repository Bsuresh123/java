package suresh;
class suman4
{
	int i,j;
	void suresh()
	{
		System.out.println(i+"-----"+j);
	}
}
class mahesh extends suman4
{
	int k;
	void jeevan()
	{
		System.out.println(k);
	}
	void sum()
	{
		System.out.println(i+j+k);
}
}
public class prac2
{
	

	public static void main(String[] args) {
		
		
         mahesh b=new mahesh();
         b.jeevan();
         b.sum();
	}
}

