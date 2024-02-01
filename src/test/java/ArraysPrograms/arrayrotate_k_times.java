package testCase;

import java.util.ArrayList;
import java.io.*;
public class TestClass {

	 
	public void shift(int arr[],int k,int n)
	{
	 k=k%n;
	
	 for(int i=0;i<n;++i)
	 {
		 if (i < n - k) {
	            System.out.print(arr[i + k] + " ");
	        } else
	        {
	            System.out.print(arr[i - (n - k)] + " ");
	        }
//		 if(i<k)
//		 {
//			
//			 System.out.print(arr[n+i-k]+" ");
//		 }
//		 else {
//			 
//			
//			 System.out.print(arr[i-k]+" ");
//		 }
		 
		 System.out.println();
	 }
	}

	
	
		public static void main(String args[])
		{
			int Array[] = {1, 2, 3, 4, 5};
		    int N = Array.length;
		   TestClass test= new TestClass();
		    int k = 2;
		    test.shift(Array, k, N);

}

}
