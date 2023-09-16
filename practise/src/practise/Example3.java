package practise;
import java.util.*;
public class Example3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the arraysize");
		int arraysize=sc.nextInt();
		int a[]=new int[arraysize];
		System.out.println("enter the array values");
		for(int i=0;i<arraysize;i++)
			a[i]=sc.nextInt();
		{
		System.out.println(arraysize);	
		}
		int sum=0;
		for(int i=0;i<a.length;i++)                    //impppppppp
		{
			sum+=a[i];
		}
		System.out.println(sum);
		System.out.println(sum/arraysize);
		sc.close();
	}

}
