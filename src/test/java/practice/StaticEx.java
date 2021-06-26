package practice;

public class StaticEx {

	String name; //instance var because these var dependent on instance
	static String address="C-4"; //static or class var belongds to class not an individual object
	static String city;
	  static int i;
	 
	 static
	 {
		i=0;
		 
	 }
	
	public  StaticEx(String Name,String City)
	{
		name = Name;
		city=City;
		i++;
		System.out.println(i);
		
		//address=Address;
	}
	
	public void getAddress()
	{
		
		System.out.println(name +city +address );
	}
	
	public static void main(String args[])
	{
		//StaticEx.i=8;
		StaticEx obj1 = new StaticEx("sumit","Gwalior" );
		StaticEx obj2 = new StaticEx("ankit","jahnsj" );
		obj1.getAddress();
		obj2.getAddress();
		
	}
}
