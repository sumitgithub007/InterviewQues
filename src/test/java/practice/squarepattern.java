package practice;

import java.util.Scanner;

public  class squarepattern {

 
	 public static void main(String args[])
	 {

        int sp=0;
	 
	  int a=5;
	  int space =6;
	  for(int i=1;i<=5;++i)
	  {
		 
		  for(int j=1;j<=a;++j)
		  {
		   
		    if(i>1&&i<5&&j>1&&j<=a-1)
		    {
			  
		 	System.out.print ("   ");
		    }
		    
		    else
		    {
		    	System.out.print("  *");
		    }
		 	  
		  

	  }
		 System.out.println();
	  } 
			 
		 
		 
			

	  }
	 }