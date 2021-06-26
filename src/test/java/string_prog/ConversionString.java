package string_prog;

import java.util.Scanner;

public class ConversionString {

	
	public static void main(String[] args) {
		
		

		 String s= "hgf";
		 
		 char [] ch = s.toCharArray();
		 
		 
		 for(int i=0;i<ch.length;++i)
		 {
			 if(ch[i]>'a' && ch[i]<'z')
			 {
				 
				  ch[i]=   (char) ((int)ch[i] - 32) ;
			 }
			 
			 
		 }
		 
		 System.out.println("string in small letters  " +String.valueOf(ch));
		 
		}
		 
		
	 
		
}

	
