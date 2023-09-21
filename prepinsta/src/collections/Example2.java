package collections;
import java.util.*;

public class Example2 {
	public static void main(String[] args) {
		List<Integer> a=new Vector<Integer>();
		a.add(4);
		a.add(5);
		a.add(0);
		a.add(9);
		a.add(8);
		a.add(10);
		System.out.println(a);
		int sum=0;
		for(int i=0;i<a.size();i++)
		{
			sum+=a.get(i);
		}
		System.out.println(sum);
		System.out.println(sum/a.size());
	}
	

}
