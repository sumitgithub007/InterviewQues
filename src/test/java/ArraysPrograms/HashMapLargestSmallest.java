package testCase;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
////Even numbers at even index and odd numbers at odd index
//two string anagram
//permutations
//reverse each individual string
//kadens algo
//rotate array by one
//rotate string by 2
//reverse first and last letter
//two array are rotation
//missing number
//majority element
//kaden's algorithm
//factorial of very largeNo
public class Solution {

   
  
	public static void main(String[] args) {
	 
		 int a[] = new int[]{2,2,2,2,5,5,2,3,3,1}; 
		 
		 HashMap<Integer,Integer>  hmap = new HashMap<Integer,Integer>();
		 
		 for(int i=0;i<a.length;++i)
		 {
			if(hmap.containsKey(a[i]))
			{
				hmap.put(a[i], hmap.get(a[i])+1);
			}
			else {
			
				hmap.put(a[i],1);
				
			}
			
			 
			 
		 }
		 Map.Entry<Integer, Integer> minEntry = hmap.entrySet()
	                .stream()
	                .max(Map.Entry.comparingByValue())
	                .orElse(null);

	        if (minEntry != null) {
	            System.out.println("Smallest value: " + minEntry.getValue());
	            System.out.println("Corresponding key: " + minEntry.getKey());
	        } else {
	            System.out.println("HashMap is empty");
	        }
		  
    	
    	
    }
		
		
		
}	
		
		

		
		
		
//		
//		 
//		int num =812394,power;
//		int last_digit = num%10;
//		power = (int)Math.log10(num);
//		 
//		int first_digit = num / (int)Math.pow(10, power);
//		 int a = first_digit * (int)Math.pow(10, power);
//		 System.out.println(a);
//		 //remove first and last digit
//		 int b = num%a ;
//		 num = b/10;
//		 
//		
//		 num= last_digit * (int)Math.pow(10, power) + num*10 + first_digit;
//		System.out.println(num);
//	}
//	
	


