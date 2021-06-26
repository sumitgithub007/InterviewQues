package ArraysPrograms;

public class MissingNumber_logic {

	public static void main(String[] args) {
		 
		System.out.println("Enter the array diference");
		int diff = 20;
		int arr[] = {30,50,70,101};
		
		 
	    
		 
		for(int i=0;i<arr.length-1;++i)
		{
		     if(!(arr[i]+diff==arr[i+1]))
		     {
		    	 System.out.println("Elements missing is " +(arr[i]+diff));
		  	         
		     }
		}
	    
	    
		
		
		
	}

}
