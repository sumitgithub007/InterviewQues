package practice;

import java.util.Scanner;

public class Swap {

	int num1;
	int num2;
	
	public  void swapping(Swap c) {
		
		int temp;
		temp=c.num1;
		c.num1=c.num2;
		c.num2=temp;
		
		 
	}
	
	public static void main(String[] args) {
		 
		Swap object = new Swap();
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the first number");
		object.num1= sc.nextInt();
		
		
		
		System.out.println("Enter the second number");
		object.num2= sc.nextInt();
		
		object.swapping(object);
		
		 
		System.out.println("After swapping :" + "First number is " +object.num1 + "Second number  is :" +object.num2 );
		
		
	}

	

}
