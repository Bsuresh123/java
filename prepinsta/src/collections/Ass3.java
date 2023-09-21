package collections;


import java.util.List;
import java.util.*;

public class Ass3 {
	public static void main(String[] args) {
		
		List<Integer> a=new Vector<Integer>();
		a.add(4);
		
		a.add(9);
		a.add(8);
		
		List<Integer> a1=new Vector<Integer>();
		a1.add(5);
		a1.add(0);
		a1.add(10);
		a.addAll(a1);
		System.out.println("After merging :"+a);
		
		
		
		
		

}

	
	}
