package practice;

public class Insertion_Sort {
 
    
	public void Insertion(int A[],int length)
	{
		int i,j,key;
		
		for(j=1;j<length;++j)
		{
			key=A[j];
			i=j-1;
			
			while(i>-1&&A[i]>key)
			{
				A[i+1]=A[i];
				i=i-1;
			}
			
			A[i+1]=key;
		}
		
		
	}
	
	
    public static void main(String args[])
    {
		int arr[]= {5,4,3,2,1,0};
	
		 Insertion_Sort obj = new Insertion_Sort();
		 
		 obj.Insertion(arr,arr.length);
    
		 System.out.println("h");
    }
	
	

}
