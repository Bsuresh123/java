package practise;
import java.util.*;

public class totalavg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a marks");
		int a=sc.nextInt();
		System.out.println("enter b marks");
		int b=sc.nextInt();
		System.out.println("enter c marks");
		int c=sc.nextInt();
		System.out.println(a+b+c);
		float d=a+b+c%3;
		System.out.println(d);

	}

}
