package string_prog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class reverseString {

 

	public static void main(String args[]) {

		String str = "sum  it  g";
		
		  char ch[]=str.toCharArray();  
		    String rev="";  
		  
		    for(int i=ch.length-1;i>=0;i--){  
		        rev=rev+ch[i];  
		    }  
		    
		    System.out.println(rev);
	
	}

}