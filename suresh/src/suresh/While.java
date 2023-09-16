package suresh;

public class While {
	int a;
	public void display()
	{
		a=1;
		while(a<=10)
		{
			System.out.println(a);
			a++;
		}
	}

	public static void main(String[] args) {
		While a=new While();
		a.display();
		
	}

}
