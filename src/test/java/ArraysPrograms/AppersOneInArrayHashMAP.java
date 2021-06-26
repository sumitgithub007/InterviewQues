
package ArraysPrograms;

public class AppersOneInArrayHashMAP {

	/*
	 * Find The Element That Appears Once In An Array Where Every Other Element
	 * Appears Twice in Java
	 */

	public static void main(String[] args) {

		int arr[] = { 1, 3,3, 4, 4, 5, 5, 6, 6, 7, 7 };
		int res = arr[0];

		for (int i = 1; i < arr.length; ++i)
		{
          res = res^arr[i];
		}
		
		System.out.println("Number appearing once is = "+res);

	}

}
