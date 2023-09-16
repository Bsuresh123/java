package practise;

import java.util.Arrays;
import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the arraysize");
		int arraysize=sc.nextInt();
		String a[]=new String[arraysize];
		System.out.println("enter the array values");
		for(int i=0;i<arraysize;i++) {
			a[i]=sc.next();
		}
			System.out.println("arrayvalues="+Arrays.toString(a));
	
	String minlength=a[0];
	int minindex=0;
	for (int i=0;i<arraysize;i++) {
		if (a[i].length()<minlength.length())
	{
		minlength=a[i];
		minindex=i;
	}
	}
	System.out.println(minlength);
	System.out.println(minindex);
sc.close();
}

	private static String minlength() {
		// TODO Auto-generated method stub
		return null;
	}
}