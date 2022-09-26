package com.yash.string;

import java.util.Scanner;

public class String_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String str1, str2 = " ";

		char c = ' ';
		System.out.println("Enter the String for Uppercase to Lowercase: ");

		str1 = scanner.nextLine();
		str1 += '\0';
		int i = 0;
		while (str1.charAt(i) != '\0') {
			if (str1.charAt(i) > 64 && str1.charAt(i) < 91) {
				c = (char) (str1.charAt(i) + 32);

			} else {
				c = (char) (str1.charAt(i));

			}
			str2 += c;
			i++;

		}
		System.out.println("uppercase to lowercase string is : " + str2);

		String str3, str4 = " ";
		System.out.println("Enter The String Lowercase to Uppercase: ");
		str3 = scanner.nextLine();
		str3 += '\0';
		int j = 0;
		while (str3.charAt(j) != '\0') {
			if (str3.charAt(j) > 96 && str3.charAt(j) < 122) {
				c = (char) (str3.charAt(j) - 32);

			} else {
				c = (char) (str3.charAt(j));
			}
			str4 += c;
			j++;

		}

		System.out.println("lowercase to uppercase String is : " + str4);

		scanner.close();
	}
}
