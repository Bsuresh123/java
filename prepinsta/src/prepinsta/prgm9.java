package prepinsta;

public class prgm9 {
	public static void main (String[]args){
	
		
		String num="1234567890876543290876543";
		System.out.println(getSum(num));
	}
	static int getSum(String num)
	{
		int sum=0;
		for (int i=0;i<num.length();i++)
		{
			sum=sum+num.charAt(i)-48;
		}
		return sum;
		}
	
	}

