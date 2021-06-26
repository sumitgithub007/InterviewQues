package ArraysPrograms;

public class Duplicateremove {

	public static void main(String args[]) {
		int arr[] = { 10,9,8,7,7,7,7,6,5,4,3,3,2,2,1 }; // for sorted array

	 

		int j = 0;
		for (int i = 0; i < arr.length - 1; ++i) {
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;
			}

		}

		arr[j] = arr[arr.length - 1];
		
		
		for (int i=0;i<j+1;++i) {
			System.out.println(arr[i]);
		}

	}

}