package collections;


import java.util.*;

public class Example8 {
public static void main(String[] args) {
		
		List<Integer> a=new LinkedList<Integer>();
		a.add(4);
		a.add(9);
		a.add(8);
		a.add(5);
		
		List<Integer> a1=new LinkedList<Integer>();
		a1.add(1);
		a1.add(8);
		a1.add(0);
		a1.add(5);
		a1.add(1);
		a1.add(6);
		List<Integer> same=new LinkedList<>();
		for (int i = 0; i <a.size(); i++) 
		{
			for (int j = 0; j < a1.size(); j++) 
				{
					if(a.get(i)==a1.get(j))
					{
						same.add(a.get(i));
					}
				}
			}
		System.out.println(same);
		}
			
		}
		


