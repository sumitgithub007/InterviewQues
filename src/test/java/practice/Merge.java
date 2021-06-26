package practice;

public class Merge {

	public void merging(int A[],int p,int q,int r) {

		int n1,n2,i,j,k;
		
       n1=q-p+1;
       n2=r-q;
       
       int L[] = new int[n1+1];
       int R[] = new int[n2+1];
       
       for(i=0;i<n1;++i)
       {
    	   L[i] = A[p+i];
       }
		
       for(j=0;j<n2;++j)
       {
    	   R[j] = A[q+j+1];
       }
		
		L[n1]=Integer.MAX_VALUE;
		R[n2]=Integer.MAX_VALUE;
		
		
		//
		i=0;
		j=0;
		
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

	public void merge_sort(int A[],int p,int r)
   {
	  
	   if(p<r)
	   {
		 int q = (p+r)/2;
	   merge_sort(A,p,q);
	   merge_sort(A,q+1,r);
	   merging(A,p,q,r);
	   }
   }

	public static void main(String[] args) {

		int arr[] = { 9, 7, 6, 5, 4, 3, 2, 1 };

		Merge obj = new Merge();
		obj.merge_sort(arr, 0, arr.length - 1);

		System.out.println("hello");
	}

}
