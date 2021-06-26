package string_prog;

public class sort_ascending {

	public static void main(String args[]) {
		String original = "abd def gh";
		int j = 0;
		char temp ;

		char[] chars = original.toCharArray();

		for (int i = 0; i < chars.length; i++) {

			for (j = i+1; j < chars.length; j++) {

				if (chars[i] == ' ' || chars[j] == ' ')

				{
					continue;
				} 
				else if (chars[i] > chars[j]) {

					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}

		}

		String s = String.valueOf(chars);
		System.out.println(s);

	}

}
