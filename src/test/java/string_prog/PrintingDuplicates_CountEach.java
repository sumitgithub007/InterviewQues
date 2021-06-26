package string_prog;

import java.util.HashMap;
import java.util.Map;

public class PrintingDuplicates_CountEach {

	
	 public static void main(String[] args)
	    {
			Map<String,Integer> hm = new 	HashMap<String,Integer>();
			
			String s = "fgubjhgjhjhjh";
			
			char[] ch= s.toCharArray(); 
			 
			
			for(int i=0;i<ch.length;++i)
			{
			String value = String.valueOf(ch[i]);
				
			int count = s.length()-s.replace(value, "").length();
			/*
			 * if(count>1) { System.out.println("First repeated  char is "+ch[i]); break; }
			 */
			hm.put(value, count) ;
			
			}
			
		   
			
			System.out.println(hm);
			
			//printing duplicates only
			 for (Map.Entry<String,Integer> mapElement : hm.entrySet()) { 
		          
				 String key = mapElement.getKey(); 
		  
		            
		            int value =  mapElement.getValue() ;
		  
		             if(value>1)
		             {
		            	  System.out.println(key + " : " + value); 
		            	  
		             }
		            
		           
		        } 
			
			
		 	    }
}
