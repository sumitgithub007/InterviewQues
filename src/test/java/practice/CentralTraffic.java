package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CentralTraffic {

	public static String reverse(String str)

	{
		if (str == null || str.isEmpty())

		{
			return str;
		}

		
		char[] characters = str.toCharArray();
           
		int i = 0;
		int j = characters.length - 1;

		while (i < j)

		{
			swap(characters, i, j);
			i++;
			j--;
		}
		   String s = String.valueOf(characters); 
			
		return new String(s);
	}

	/**
	 * * Java method to swap two numbers in given array * @param str * @param i
	 * * @param j
	 */
	private static void swap(char[] str, int i, int j) {
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}

	public static void main(String args[]) {

		
		
		CentralTraffic c  = new CentralTraffic();
		System.out.println(c.reverse("sumit"));
	
	
	}

}