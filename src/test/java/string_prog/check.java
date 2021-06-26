package string_prog;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class check {

	public static void main(String args[]) {
 
		
		
		String s = "sumit goyal";
		
		String [] text = s.split(" ");
		
		for(int k=0;k<text.length;++k)
		{
			
		}
		
		
		
		
		
		
		char[]c = s.toCharArray();
		
		int j = c.length-1;
		
		for(int i=0;i<c.length;++i)
		{
			 char temp;
			 temp=c[i];
			 c[i]=c[j];
			 c[j]=temp;
		     
			 --j;
			 
			  if(i>=j)
			  {
				  break;
			  }
		
		}
		
		String value = new String(c);
		
		System.out.println(value);
		
		
		
		
		
		

}

}