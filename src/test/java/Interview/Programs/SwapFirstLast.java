package testCase;

import java.util.ArrayList;
import java.util.List;
////Even numbers at even index and odd numbers at odd index
//two string anagram
//permutations
//reverse each individual string
//kadens algo
//rotate array by one
//rotate string by 2
//reverse first and last letter
//two array are rotation
public class Solution {

	 
	public static void main(String[] args) {
		
		 
		int num =812394,power;
		int last_digit = num%10;
		power = (int)Math.log10(num);
		 
		int first_digit = num / (int)Math.pow(10, power);
		 int a = first_digit * (int)Math.pow(10, power);
		 System.out.println(a);
		 //remove first and last digit
		 int b = num%a ;
		 num = b/10;
		 
		
		 num= last_digit * (int)Math.pow(10, power) + num*10 + first_digit;
		System.out.println(num);
	}
	
	
}


