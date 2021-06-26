package ArraysPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateHashSet {

	public static void main(String args[])
	{
		
		int arr[] = {2,2,3,4,5,6,6,6,7,7,8,9};
		
		HashMap<Integer,Integer> charCountMap = new HashMap<Integer,Integer>();
		
		for(int no : arr)
		{
		    
	            if(charCountMap.containsKey(no))
	            {
	                //If char 'c' is present in charCountMap, incrementing it's count by 1
	 
	                charCountMap.put(no, charCountMap.get(no)+1);
	            }
	            else
	            {
	                //If char 'c' is not present in charCountMap,
	                //putting 'c' into charCountMap with 1 as it's value
	 
	                charCountMap.put(no, 1);
	            }
	        }
	        
		   Set<Map.Entry<Integer,Integer>> es = charCountMap.entrySet();
			
		   System.out.println("Duplicate elements are ");
		   
		   for(Map.Entry<Integer,Integer> hm : es)
		   {
			   if(hm.getValue()>1)
			   {
				   System.out.println(hm.getKey()+ "  ");
				   //break; use  break for first duplicate element in array
			   }
		   }
		   
		}
		
		
	
	
}
