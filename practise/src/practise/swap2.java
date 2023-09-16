package practise;

public class swap2 {

	public static void main(String[] args) {
	int a=20;
	int b=15;
	System.out.println("before swap a="+a+" b ="+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swap a="+a+" b ="+b);
	}

}
