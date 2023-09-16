package practise;
import java.util.Arrays;
import java.util.Scanner;
public class Example6 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the arraysize");
		int arraysize=sc.nextInt();
		boolean a[]=new boolean[arraysize];
		System.out.println("enter the array values");
		for(int i=0;i<arraysize;i++) {
			a[i]=sc.nextBoolean();
		}
			System.out.println("arrayvalues="+Arrays.toString(a));
			boolean[]reva=new boolean[a.length];
			for (int i = 0; i < a.length; i++) {
				reva[a.length-i-1]=a[i];
				}
			System.out.println("arrayvalues="+Arrays.toString(reva));
			
			
		sc.close();
	}

}
