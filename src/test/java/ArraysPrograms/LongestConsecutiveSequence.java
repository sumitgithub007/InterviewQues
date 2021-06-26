package ArraysPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LongestConsecutiveSequence {
 //Longest contiguous subsequence
	public static void main(String[] args) {
	 
		int a[] = {9,4,5,4,11,1,1};
		
 
		HashSet<Integer> hs = new HashSet<Integer>();
	
		int long_length =0;
		for(int i=0;i<a.length;++i)
		{
			hs.add(a[i]);
		}
		
		for(int i=0;i<a.length;++i)
		{
		     
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			if(!hs.contains(a[i]-1))
			{
				int no = a[i];
				
				
				
				while(hs.contains(no))
				{
				  
					list.add(no);
					no++;
					
				}
		 				
				System.out.print(list );
				System.out.println(  " =  " +list.size());
				
				
				if(long_length<no-a[i])
				{
					long_length=no-a[i];
				}
			}
		}
		
		System.out.println("Longest subsequence is " +long_length);
		
	}

}
