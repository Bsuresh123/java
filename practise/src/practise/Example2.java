package practise;

import java.util.Arrays;           //imppppppppppp
import java.util.Scanner;

public class Example2 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array1size");
		int array1size=sc.nextInt();
		String[] a1=new String[array1size];
		System.out.println("enter the array values");
		for(int i=0;i<array1size;i++)
			a1[i]=sc.next();
		System.out.println("enter the array2size");
		int array2size=sc.nextInt();
		String a2[]=new String[array2size];
		System.out.println("enter the array values");
		for(int i=0;i<array2size;i++)
			a2[i]=sc.next();
		{
		System.out.println("array1:"+Arrays.toString(a1));	
		}
		System.out.println("array2="+Arrays.toString(a2));
		
		String a3[]=new String[array1size+array2size];
		for(int i=0;i<array1size;i++)
			a3[i]=a1[i];
		for(int i=0;i<array2size;i++)
			a3[i+a1.length]=a2[i];
		System.out.println("array3="+Arrays.toString(a3));
		sc.close();
	}
	}
