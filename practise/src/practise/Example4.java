                             //to fin maxnum and its indexnum in an array
package practise;



import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the arraysize");
		int arraysize=sc.nextInt();
		int a[]=new int[arraysize];
		System.out.println("enter the array values");
		for(int i=0;i<arraysize;i++) {
			a[i]=sc.nextInt();
		}
			System.out.println("arrayvalues="+Arrays.toString(a));
		
			int maxnumber =a[0];
			int index=0;
			for (int i = 0; i < a.length; i++) {
				if(maxnumber<a[i])
				{
					maxnumber=a[i];
					index=i;
				}
			}
				System.out.println("maxnum="+maxnumber);
				System.out.println("index="+index);	
			sc.close();
			}
	}
	

