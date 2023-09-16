package practise;

import java.util.Scanner;

public class greateamong4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		System.out.println("enter c value");
		int c=sc.nextInt();
		System.out.println("enter d value");
		int d=sc.nextInt();
		System.out.println("enter e value");
		int e=sc.nextInt();
		
		
		String result=a>b&&a>c&&a>d&&a>e? a+" a is greater":
			b>c&&b>d&&b>e?b+" b is greater":
				c>d&&c>e?c+" c is greater":
					d>e?d+" d is greater":e+"e is greater";
		System.out.println(result);

	}

}
