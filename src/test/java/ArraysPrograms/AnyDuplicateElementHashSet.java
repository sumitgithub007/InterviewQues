package ArraysPrograms;

import java.util.HashSet;

public class AnyDuplicateElementHashSet {

	public static void main(String[] args) {

          int a[] =  {2,2,4,3,5,6,77,7,7,8,9};
          
          HashSet<Integer> hs = new  HashSet<Integer>();
          int temp=-1;
          
          for(int i=a.length-1;i>=0;--i)
          {
        	  if(hs.contains(a[i]))
        	  {
        		  temp=i;
        	  }
        	  else
        	  {
        		  hs.add(a[i]);
        	  }
          }
        		  
         if(temp!=-1)
         {
        	 System.out.println("First dupicate element is " +a[temp]);
         }
		 
         else
         {
        	 System.out.println("No duplicate element found");
         }
	}

}
