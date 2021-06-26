package practice;

public class FirstClass {

	 
	
	
	
	
	public static void main(String args[])
	{
	  // B obj-b  = new B();
	   B obj = new B();
		// System.out.println(obj.i);
		 //obj.print();
		
	 
		
	}
	
}

class A
{
	final int i=33;
	A()
	{
		System.out.println("hello a");
	}
	 
}


class B extends A

{
	 int i =77;
	 B()
	 {
		 System.out.println(i);
	 }
	
}

