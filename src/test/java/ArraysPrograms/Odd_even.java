package ArraysPrograms;

 
public class Odd_even {

	public static void main(String args[]) { 	
	
	
	int a[] = new int[] {3,4,5,6,7,99,0,8768};
	
	//Find kth largest element
	//4th
	
	int pos=3;
	
	for(int i=0;i<a.length;++i) {
		
		for(int j=i+1;j<a.length;++j)
		{
			if(a[i]<a[j])
			{
				int temp;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		if(i==pos-1)
			break;
		
		
	}
	
	System.out.println("4th largest elements is = "+a[pos-1]);

	}
}
		

