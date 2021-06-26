package practice;

public class BubbleSort {

	public void Bubble(int A[],int n)
	{
		int swapped ,i,j;
	
	for(i=0;i<n-1;++i)
	{
		swapped=0;
		
		for(j=0;j<n-i-1;++j)
		{
			if(A[j]>A[j+1])
			{
				int temp;
				temp=A[j];
				A[j]=A[j+1];
				A[j+1]=temp;
						
				swapped=1;
			}
			
		}
		if(swapped==0)
		{
			break;
		}
	}
	
	
	}
	
	public static void main(String[] args) {
	
		int arr[] = {2,3,4,5,6};
		BubbleSort obj = new BubbleSort();
		obj.Bubble(arr, arr.length);
		
		
		System.out.println("");
		
		
	}

}
