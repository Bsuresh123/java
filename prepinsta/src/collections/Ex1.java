package collections;
import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		List<String> name=new ArrayList();
		name.add("suresh");
		name.add("suri");
		name.add("santhosh");
		name.add("siva");
		name.add("suresh");
//		System.out.println(name);
//		name.sort(null);
		for (String string : name) {
			System.out.println(string);
			
		}
	}

}
