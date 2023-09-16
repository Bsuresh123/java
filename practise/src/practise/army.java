package practise;

import java.util.Scanner;

public class army {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome for army");
		System.out.println("enter the age");
		int age=sc.nextInt();
		System.out.println("enter the weight");
		int weight=sc.nextInt();
		System.out.println("enter the height");
		float height =sc.nextFloat();
		if (age>18&&height>=5.8&&weight>=60)
		{
			System.out.println("eligible");
		}
		else
		{
			System.out.println("not eligible");
		}
	}

}
