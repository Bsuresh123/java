package practise;

import java.util.Scanner;

public class pension {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome for pension");
		System.out.println("enter the name");
		String name =sc.next();
		System.out.println("enter the age");
		int age=sc.nextInt();
		if (age>=60)
		{
			System.out.println("eligible");
		}
		else
		{
			System.out.println("not eligible");
		}
		sc.close();

	}

}
