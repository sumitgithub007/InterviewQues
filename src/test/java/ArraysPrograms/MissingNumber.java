package ArraysPrograms;

public class MissingNumber {

	public static void main(String[] args) {
		 
		
		int arr[] = {1,2,3,4,5,7};
		
		int expected_no_elements = arr.length+1;
		
		int total_sum =  expected_no_elements*(expected_no_elements+1)/2;
		
		int sum=0;
		for(int i=0;i<arr.length;++i)
		{
			sum=sum+arr[i];
		}
	   
		System.out.println("Missing num is  "+(total_sum-sum));
		
		
		
		
		
		
		
		
		
	}

}
