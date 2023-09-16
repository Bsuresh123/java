package suresh;
class student
{
	int no=100;
	void putdata()
	{
		System.out.println("no="+no);
	}
}
class books extends student
{ 
	int sub=5;

	void getdata()
	
	{
		System.out.println("sub="+sub);
	}
}
class pencil extends books
{
	int sum;
	void suri()
	

	{
	System.out.println("sum="+(no+sub));
}
}


public class singleinheritance {
	

	public static void main(String[] args) {
		pencil r=new pencil();
		r.putdata();
		r.getdata();
		r.suri();
		
		

	}

}
