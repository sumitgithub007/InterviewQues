package ArraysPrograms;

import java.util.HashSet;

public class DuplicateremovedUnsorted {

	public static void main(String[] args) {
		 
		
		int a[] = {1,2,3,4,5,5,5,6,7,7};
				
				HashSet<Integer> hs  = new HashSet<Integer>();
	     
				for (int num : a) {
					
					hs.add(num);
				}
	 
	     
				for (int num : hs) {
					
					System.out.println(num);
				}
	
	}
	}
 
