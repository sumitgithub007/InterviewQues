package ArraysPrograms;

public class AnyDuplicateElement {

	public static void main(String[] args) {

		int arr[] = { 3, 3, 4, 5, 5, 6, 6, 7, 8, 9 };

		int temp = 0;

		for (int i = 0; i < arr.length - 1; ++i) {

			for (int j = 0; j < arr.length; ++j) {
				if (arr[i] == arr[j]) {

					System.out.println("second duplicate element is " + arr[i]);
					temp = temp + 1;
					break;

				}

			}
			
			if(temp==1)
			{
				break;
			}
			
			
			

		}

	}

}
