package suresh;
 class Inheritance3
 {
	 int id=11;
	 String name="suri";
	 public void display()
	 {
		 System.out.println("display ()");
	 }
	 protected void show()
	 {
		 System.out.println("show ()");
	 }
	 public void dog()
	 {
		 System.out.println("dog()");
	 }
 }
 
	 class kittu extends Inheritance3
	 {
	public void animal()
	{
		String city ="mpl";
		String country="bharath";
		{
		System.out.println("animal()"+id+" "+name+" "+city+" "+country);
		}
	 }
	 
 
public static void main(String[] args) {
	Inheritance3 r=new Inheritance3();
		
		r.display();
		r.show();
		r.dog();
		
	}
	 }		

	


