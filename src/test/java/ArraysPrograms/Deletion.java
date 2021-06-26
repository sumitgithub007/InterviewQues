package ArraysPrograms;

public class Deletion {

	public static void main(String[] args) {
		 
		int a[] = {10,20,30,40,50,60};
		
		System.out.println("enter index value to delete");
		int index = 3;
		
		int delete =30;
		
		
		for(int i=0;i<a.length;++i)
		{
			if(a[index]==a[i])
			{
				for(int j=i;j<a.length-1;++j)
				{
					a[j]=a[j+1];
				}
				
				break;
			}
			
		 	
		 	
			
		}
		
		for(int i=0;i<a.length-1;++i)
		{
			System.out.println(a[i]);
		}
	    
	
	
		
		
		
		
	}

}
