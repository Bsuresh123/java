package suresh;

public class Multithreading2 extends Thread {
	public void run()
	{
	System.out.println("Run method");	
	}
	public static void main(String[] args) 
	{
		Multithreading2 a=new Multithreading2();
		Multithreading2 a1=new Multithreading2();
		Multithreading2 a2=new Multithreading2();
		
		System.out.println(a.getName());
		System.out.println(a1.getName());
		System.out.println(a2.getName());
		
		a.setName("suresh");
		a1.setName("hello");
		a2.setName("mister");
		
		System.out.println(a.getName());
		System.out.println(a1.getName());
		System.out.println(a2.getName());
		
		System.out.println(MIN_PRIORITY);
		System.out.println(MAX_PRIORITY);
		System.out.println(NORM_PRIORITY);
		
		System.out.println(a.getPriority());
		System.out.println(a1.getPriority());
		System.out.println(a2.getPriority());
		
		a1.setPriority(MAX_PRIORITY);
		System.out.println(a1.getPriority());
	}

	

	
		
		
	}


