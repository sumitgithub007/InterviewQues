package string_prog;

import java.util.Arrays;

public class findCounts {

	public static void findCounts(int arr[], int n)
	{
	     
	    // Hashmap
	    int hash[] = new int[n];
	    Arrays.fill(hash, 0);
	     
	    // Traverse all array elements
	    int i = 0;
	     
	    while (i < n)
	    {
	         
	        // Update the frequency of array[i]
	        hash[arr[i] - 1]++;
	         
	        // Increase the index
	        i++;
	    }
	    System.out.println("\nBelow are counts " + 
	                       "of all elements");
	    for(i = 0; i < n; i++)
	    {
	        System.out.println((i + 1) + " -> " + 
	                           hash[i]);
	    }
	}
	 
	// Driver code
	public static void main(String []args)
	{
	    int arr[] = {10,9,8,8,7,6,5,4,3,2,99 };
	    findCounts(arr, arr.length);
	     
	    
	}
	}
	 
	
