package suresh;
import java.util.*;
public class studentdetails {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name");
	String str=sc.next();
	System.out.println("enter your gender");
	char ch=sc.next().charAt(0);
	System.out.println("enter your number");
	long number=sc.nextLong();
	System.out.println("Name----->"+str);
	System.out.println("Gender--->"+ch);
	System.out.println("Number--->"+number);

	}

}
