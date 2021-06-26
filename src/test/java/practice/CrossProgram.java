package practice;

import java.util.Scanner;

public class CrossProgram {

	public static void main(String args[]) {

		int sp = 0;

		int k, a = 9;
		int space = 10;
		for (int i = 1; i <= 7; ++i) {
			if (i < 5) {
				a = a - 2;
				space++;
			}

			else {
				a = a + 2;
				space--;
			}

			for (k = 1; k <= space; ++k) {
				System.out.print(" ");
			}

			for (int j = 1; j <= a; ++j) {
				if (i < 5 && j > 1 && j < a) {
					System.out.print(" ");
				}

				else if (i > 4 && j > 1 && j < a) {
					System.out.print(" ");
				}

				else {
					System.out.print("*");
				}
			}

			System.out.println();

		}

	}

}
