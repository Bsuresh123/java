package practise;

class A {
	int i=m1();
	A(){
		System.out.println("constructor");
	}
	int m1() {
		System.out.println("m1-method");
		return 20;
	}
	{
		System.out.println("instance block");
	}

	public static void main(String[] args) {
		A obj=new A();
		
		// TODO Auto-generated method stub

	}

}
