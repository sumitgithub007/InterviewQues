package practice;

public class Emp {

 
		int id;  
		String name;  
		Addres address  ;
		  
		public Emp(int id, String name,Addres address) {  
		    this.id = id;  
		    this.name = name;  
		    this.address=address;  
		}  
		  
		void display(){  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
		}  
		  
		public static void main(String[] args) {  
		Addres address1=new Addres("gzb","UP","india");  
		Addres address2=new Addres("gno","UP","india");  
		  
		Emp e=new Emp(111,"varun",address1);  
		Emp e2=new Emp(112,"arun",address2);  
		      
		e.display();  
		e2.display();  
		      
		}  
		 
}
	



  class Addres {  
String city,state,country;  
  
public Addres(String city, String state, String country) {  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  
  
}