package suresh;
import java.io.DataInputStream;
public class datainputstream {

	public static void main(String[] args) 
	{
	int a,b,sub;
	DataInputStream r=new DataInputStream (System.in);
	try
	{
		System.out.println("enter a value");
		a=Integer.parseInt(r.readLine());
		System.out.println("enter b value");
		b=Integer.parseInt(r.readLine());
		sub=a-b;
		System.out.println("sub="+sub);
	}
	catch (Exception e)
	{
				
	}
	}

}
