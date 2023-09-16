package practise;
 public class Insta1 
{
static int tally=0;
public void put(int a,int b) {
	for (;a<10; ++a) 
		++b;
		tally+=b;
		}
}
class Trial extends Insta1
{
	public static void main(String[] args) {
		int m=2,n=4;
		Trial a=new Trial();
		a.put(m, n);
		System.out.println(Insta1.tally);
	}
}
