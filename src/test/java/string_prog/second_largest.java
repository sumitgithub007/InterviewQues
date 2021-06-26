package string_prog;

public class second_largest {

public static void main(String[] args) {
	
	int a[] = {-4,-3,-2,-1};
	
	 int largest = Integer.MIN_VALUE;
	 int second_largest = Integer.MIN_VALUE;
	 
	  for(int i=0;i<a.length;++i)
	  {
		  if(a[i]>largest)
		  {
			  second_largest = largest;
			  largest=a[i];
		  }
		  
		  else if(a[i]>second_largest && a[i]!=largest)
		  {
			  second_largest = a[i];
		  }
	  }
		 if(second_largest==Integer.MIN_VALUE)
		 {
			 System.out.println("There is no second largest element");
		 }
		 else
		 {
			 System.out.println("second largest is " + second_largest);
		 }
	  }
	 
	 
	 
	
	
}
