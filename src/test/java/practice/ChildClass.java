package practice;

public class ChildClass extends ParentClass{

	
	String cc = colorofbody;
	public String childd()
	{
		String body = cc;
		return body;
	}
	
	
	public static void main(String[] args) {
		 
	 
		ChildClass v = new ChildClass();
		
		System.out.println(v.childd());
		System.out.println(v.Surname());
	}	
}
