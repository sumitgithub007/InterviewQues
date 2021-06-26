package practice;

import java.util.Scanner;

//Demonstrating call by value
public class Operation{  
	 
public static void main(String[] args) {
	//sumit goyal -> timus layog
	
   String s = "sumit goyal";
   String split [] = s.split(" ");
   String rev="";
  
	String finaloutput = "";
    
    for(int k=0;k<split.length;++k)
    {
    	String val = split[k];  
    	  char ch[] = val.toCharArray();
    	
        for(int  i= ch.length-1;i>=0;--i)
        {
        	 
        	rev = rev + ch[i];
        }
    	finaloutput = finaloutput+" "+rev;
    	rev="";
    	
    }
   
    
  
    System.out.println("reverse of "+s + "is = "+finaloutput);
}
	
	
}
	
	
	
	