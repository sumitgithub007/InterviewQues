package string_prog;

import java.util.Scanner;

public class removewhitespace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * \\s+� Vs �\\s� : Both of these strings, when passed to replaceAll() method,
		 * produce the same result with almost same performance. But, when the number of
		 * consecutive spaces increases, �\\s+� is slightly faster than �\\s�. Because,
		 * it replaces set of consecutive multiple spaces
		 * 
		 */

	/*	System.out.println("Enter input string to be cleaned from white spaces...!");

		String inputString = sc.nextLine();

		String stringWithoutSpaces = inputString.replaceAll("\\s", "");

		System.out.println("Input String : " + inputString);

		System.out.println("Input String Without Spaces : " + stringWithoutSpaces);

		sc.close();*/
		
		
		 
         
	        System.out.println("Enter input string to be cleaned from white spaces...!");
	         
	        String inputString = sc.nextLine();
	         
	        char[] charArray = inputString.toCharArray();
	         
	        String stringWithoutSpaces = "";
	         
	        for (int i = 0; i < charArray.length; i++) 
	        {
	            if ( (charArray[i] != ' ') && (charArray[i] != '\t') )
	            {
	                stringWithoutSpaces = stringWithoutSpaces + charArray[i];
	            }
	        }
	         
	        System.out.println("Input String : "+inputString);
	         
	        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
	         
	        sc.close();
		
		
		
		
		
		
		
		
		
	}
}
