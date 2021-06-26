package string_prog;

public class Leetcode {

	public static void main(String[] args) {
		
		
		String s = "I will eat 2.3344444 bur255555gers 23 fries & 1.25 cokees l8r";

		char[] c = s.toCharArray();
		int totaloutput = 0;

		int count = 0;

		for (int i = 0; i < c.length; ++i) {

			char v = c[i];
			int nextval = Character.getNumericValue(v);

			if (!(0 <= nextval && nextval <= 9)) {
				count = 0;
			}

			if (0 <= nextval && nextval <= 9) {
				count++;

				if (count > 1) {

				}

				else {
					totaloutput++;
				}

			}

		}
		System.out.println(totaloutput);

	}

		
		
	}
