package practice;

public class Overlodaing {

	
	public static void main(String args[])
	{
		Test obj = new Test();
		System.out.println(obj.Add(4, 6));
		System.out.println(obj.Add(4, 6,2));
		System.out.println(obj.Add(1f,1.2f));
	}
	
}


class Test
{
	
	public float Add(float a,float b)
	{
		float sum=a+b;
		return sum;
	}
	
	
	
	public int Add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	
	
	public int Add(int a,int b,int c)
	{
		int sum=a+b+c;
		return sum;
	}
	
}