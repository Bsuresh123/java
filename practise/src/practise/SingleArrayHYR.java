package practise;
import java.util.Scanner;
public class SingleArrayHYR {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int arrsize=sc.nextInt();
		
		int arr[]=new int[arrsize];
		System.out.println("enter the array numbers");
		for(int i=0;i<arrsize;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(arrsize);
		
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
		sc.close();
		
		
		
	}
}