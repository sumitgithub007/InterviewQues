package practice;

public class multidimensionalPractic {

	
	public static void main(String args[])
	{
		int largest=0;
		
		int num[][] = new int[3][3];
		
		num[0][0] = 7;
		num[0][1] = 2 ;
		num[0][2] = 3;
		
		num[1][0] = 4;
		num[1][1] =  5;
		num[1][2] = 6;
		
		num[2][0] = 8;
		num[2][1] =1;
		num[2][2] = 0;
		 int largest_random=0;
		int row=0,column=0;
		int randomno =0;
		int smallest=num[0][0];
		
		for(int i=0;i<3;++i)
		{
			
			for(int j=0;j<3;++j)
			{
				randomno = num[i][j];
				if(randomno<smallest)
				{
					smallest=randomno;
					row=i;
					column=j;
				}
			}
			  largest = num[row][column];
			
			for(int k=0;k<row+1;++k)
			{
		    largest_random = num[k][column];
		    if(largest_random>largest)
		    {
		    	largest=largest_random;
		    }
			}
			
			
		}
		System.out.println("rowno "+row);
		System.out.println("colno "+column);
		System.out.println("smallest number is  "+smallest);
		
		
		
		
		System.out.println("largest among column  "  +largest);
		
		
				
		
		
		
	}
	
	
	
	
}
