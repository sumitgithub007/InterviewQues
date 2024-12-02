package testCase;

import java.util.ArrayList;
import java.io.*;
public class TestClass {

	https://www.geeksforgeeks.org/java-program-for-array-rotation/
	 
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


	// Java Implementation of Right Rotation 
// of an Array K number of times
import java.util.*;
import java.lang.*;
import java.io.*;

class Array_Rotation
{

// Function to rightRotate array
static void RightRotate(int a[], 
                        int n, int k)
{
    
    // If rotation is greater 
    // than size of array
    k=k%n;

    for(int i = 0; i < n; i++)
    {
        if(i<k)
        {
            // Printing rightmost 
            // kth elements
            System.out.print(a[n + i - k] 
                             + " ");
        }
        else
        {
            // Prints array after
            // 'k' elements
            System.out.print(a[i - k] 
                             + " ");
        }
    }
    System.out.println();
}
    
// Driver program right rotate
public static void main(String args[])
{
    int Array[] = {1, 2, 3, 4, 5};
    int N = Array.length;

    int K = 2;
    RightRotate(Array, N, K);

}
}
// This code is contributed by M Vamshi Krishna


public static void  rotate1(int arr[],int p)
	{
		p=p%arr.length;
		while(p>0)
		{
			int last = arr[arr.length-1];
			for(int i=arr.length-1;i>0;--i)
			{
				arr[i]=arr[i-1];
			}
			--p;
			arr[0]=last;
		}
		System.out.println(Arrays.toString(arr));
		 	 
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
