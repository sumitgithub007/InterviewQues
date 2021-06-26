package practice;

import com.sun.tools.javac.code.Attribute.Array;

public class QuickSort {

	
	public int Partition(int A[],int p , int r)
	{
		int x,i,j;
		x=A[r];
		i=p-1; 
		for(j=p;j<=r-1;++j)
		{
			if(A[j]<=x)
			{
				i=i+1;
			         int temp; 	//exchange A[i] with A[j]
			         temp=A[i];
			         A[i]=A[j];
			         A[j]=temp;
			}
		}
		
		//exchange A[i+1] with A[r];
		int temp;
		temp = A[i+1];
		A[i+1] = A[r];
		A[r] = temp;
		
		
		return i+1;
		
	}
	
	
	public void QuickSort_(int A[],int p ,int r)
	{
		
		if(p<r)
		{
		int q=Partition(A,p,r);
		QuickSort_(A,p,q-1);
		QuickSort_(A,q+1,r);
		}
		
		
	}
	
	
	
	public static void main(String args[])
	{
		
		int arr[] = {5,7,3,2,4,0};
		QuickSort obj = new QuickSort();
		obj.QuickSort_(arr,0,arr.length-1);
		
	}
	
}
