package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BS {

	
	 public void  Bubble(int A[],int n)
	 {
		 boolean swap = false;
		 
		 for(int i=0;i<n-1;++i)
		 {
			 for(int j=0;j<n-i-1;++j)
			 {
				 if(A[j]>A[j+1])
				 {
					 int temp;
					 
					 temp=A[j];
					 A[j]=A[j+1];
					 A[j+1]=temp;
					 
					 
					 swap = true;
				 }
			 }
			 if(swap=false)
			 {
				 break;
			 }
		 }
		 
		 
		 
	 }
	 
	
	 public static void main(String args[]) {
		
		 
		 int arr[]  ={7,2,3,4,5};
		 
		 BS ob = new BS();
		 
		 ob.Bubble(arr, arr.length);
		 
		 System.out.println("");
		 
		 
		 
	 }
}
