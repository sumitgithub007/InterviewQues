package practice;

import java.util.Scanner;

public class BinarySearch {

	public int BS(int data, int n, int A[]) {
		int l = 0;
		int r = n - 1;
		int mid;

		while (l <= r) {
			mid = (l + r) / 2;

			if (data == A[mid]) {
				return mid;
			}

			else if (data < A[mid]) {
				r = mid - 1;
			}

			else {
				l = mid + 1;
			}
		}

		return -1;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the data to search");
		int data = sc.nextInt();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		BinarySearch obj = new BinarySearch();
		int n = obj.BS(data, arr.length, arr);

		if (n == -1) {
			System.out.println("not found");
		}

		else {
			System.out.println("Data is found at" + n + "position");
		}

	}

}
