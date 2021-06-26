package practice;

public class Quick {

	 
	public int Partitioning(int A[],int p,int r)
	{
		int i,j,x;
	     i=p-1;
		x=A[r];
	    
		for(j=p;j<=r-1;++j)
		{
			 
			
			if(A[j]<=x)
			{
			 
				i=i+1;
				int temp;
			 
				temp=A[i];
				A[i]=A[j];
				A[j]=temp;
				
				
			}
			
			
			
			
		}
		
		//swapp A[i+1] with A[r]
		
		int temp;
		temp=A[i+1];
		A[i+1]=A[r];
		A[r]=temp;
		
		
		
		return i+1;
	}
	
	
	public void Quick_Sort(int A[],int p ,int r)
	{
	   if(p<r)
	   {
		   int q = Partitioning(A,p,r);
		   Quick_Sort(A,p,q-1);
		   Quick_Sort(A,q+1,r);
	   }
	}
	 

	 
	public static void main(String[] args) {

		int arr[] = { 18, 0, 7, 6, 5, 2, 1 };

		Quick obj = new Quick();

		obj.Quick_Sort(arr,0, arr.length-1);
		
		System.out.println("dsds");
	}

}
