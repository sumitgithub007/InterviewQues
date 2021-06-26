package ArraysPrograms;

public class MergingArray {

	public static void main(String[] args) {

		int a[] = { 2, 3,5,7,8,9,6 };
		int b[] = {5,4,5,6,7,8,9};

		int total = a.length + b.length;
        int j =0 ;
		int c[] = new int[total];

		for (int i = 0; i < total; ++i) {
			if (i < a.length) {
				c[i] = a[i];
			}

			else {
				c[i] = b[j];
			    ++j;
			}
		}

		for (int i : c) {

			System.out.println(i);
			
		}
	}

}
