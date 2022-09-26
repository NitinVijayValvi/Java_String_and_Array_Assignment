package com.yash.array;

public class Array_11 {

	public static void main(String[] args) {
		String[] str = { "mom", "dad", "aba", "dog", "pot" };

		for (int i = 0; i < str.length; i++) {

			String originalString = str[i];

			System.out.println("Original Array String : " + originalString);

			StringBuilder sBuilder = new StringBuilder();

			sBuilder = sBuilder.append(originalString);

			String Reverse = sBuilder.reverse().toString();

			if (originalString.equals(Reverse)) {
				System.out.println("String is palindrome");

			} else {
				System.out.println("Not palindrome");
			}

		}
	}
}
