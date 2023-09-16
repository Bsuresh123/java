package practise;

import java.util.Scanner;

public class greatamo3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		System.out.println("enter c value");
		int c=sc.nextInt();
		String result=a<b&&a<c? a+" is small":b<c?b+"is small":c+" is small";
		System.out.println(result);

	}

}
