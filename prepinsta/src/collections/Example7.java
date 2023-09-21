package collections;

import java.util.LinkedList;
import java.util.*;

public class Example7 {

	

	public static void main(String[] args) {
		List<Integer> a1=new LinkedList<Integer>();
		a1.add(4);
		a1.add(1);
		a1.add(9);
		a1.add(4);
		a1.add(8);
		a1.add(0);
		a1.add(5);
		a1.add(1);
		a1.add(8);
		a1.add(6);
		System.out.println(a1);
		Set<Integer> a2=new HashSet<>(a1);
		System.out.println(a2);

	}

}
