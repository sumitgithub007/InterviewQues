package practice;

public class MergeSort {

	public void merge(int A[],int p,int q,int r)
	{
	
		int n1 = q-p+1;
	int n2 = r-q;
	int i,j,k;
	
	  /* Create temp arrays */
    int L[] = new int [n1+1]; 
    int R[] = new int [n2+1]; 
	
 


 for(i=0;i<n1;++i)
	{

	L[i]=A[p+i];

	}

	for(j=0;j<n2;++j)
	{
	 R[j]= A[q+j+1];

	}

	L[n1] = Integer.MAX_VALUE;
	R[n2]= Integer.MAX_VALUE;

	i=0; //again setting to 1
	j=0; //again setting to 1


	for(k=p;k<=r;++k)
	{
	 if(L[i]<=R[j])
	 {
	  A[k]=L[i];
	  i=i+1;

	 }

	 else
	 {
	  A[k]=R[j];
	  j=j+1;
	 }


	}



	}

	public void display(int arr[],int length)
	{
		for(int i=0;i<length;++i)
		{
			System.out.println(arr[i]);
			
		}
		
	}
	
	public void merge_sort(int A[], int p,int r)
	{
	  if(p<r)
	  {
	   int q =   (p+r)/2;
	   merge_sort(A,p,q);
	   merge_sort(A,q+1,r);
	   merge(A,p,q,r);
	  }

	}

	// Driver method
	public static void main(String args[]) 
    { 
        int arr[] = {9,6,5,0,8,2}; 
      
  
        MergeSort ob = new MergeSort(); 
        ob.merge_sort(arr, 0, arr.length-1); 
        ob.display(arr, arr.length-1);
        
        
    }
}
/* This code is contributed by Rajat Mishra */
