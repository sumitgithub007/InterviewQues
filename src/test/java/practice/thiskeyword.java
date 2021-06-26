package practice;

public class thiskeyword {

	
	int a=3;
	public void getdata()
	{
		int a =2;
		int b = this.a;
		System.out.println(a+b);
		
	}
	
	public static void main(String args[])
	{
		
		thiskeyword bb = new thiskeyword();
		bb.getdata();
		
		
	}
	
}
