package ArraysPrograms;

import java.util.HashSet;
import java.util.Set;

public class check {
 
	
	public static void main(String[] args) {
	
		int arr[] = new int [] {4,4,5,6,7,7,99,99,1,1};
		
		int fr[] = new int [arr.length];
		int visited =-1;
		
		for(int i=0;i<arr.length;++i)
		{
			int count=1;
			for(int j=i+1;j<arr.length;++j)
			{
				if(arr[i]==arr[j])
				{
					count++;
					fr[j]=visited;
					
				}
			}
			if(fr[i]!=visited)
			{
				fr[i]=count;
			}
		}
		
		System.out.println("Element | Frequency");
		
		for(int i=0;i<fr.length;++i)
		{
			if(fr[i]!=visited)
			{
				System.out.println(arr[i]  +  "      ->     "  + fr[i]);
			}
			
			
		}
		
		
	 
		
		
}

	
	
}