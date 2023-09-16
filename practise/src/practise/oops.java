package practise;
class animal
{
	void eat()
	{
		System.out.println("eating");
	}
}
class dog extends animal
{
	void bark()
	{
		System.out.println("barking");
	}
}
class cat extends animal
{
	void meow()
	{
		System.out.println("meowing");
	}
}
class ram extends animal
{ 
	void run()
	{
		System.out.println("running");
	}
}

class oops
{

public static void main(String[] args) {
	
cat a=new cat();

a.meow();
dog b=new dog();
b.bark();

ram c=new ram();
c.run();
a.eat();


	}

}

