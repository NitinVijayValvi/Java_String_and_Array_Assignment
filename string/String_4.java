package com.yash.string;

import java.util.Scanner;

public class String_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString;

		System.out.println("Enter the string 1 : ");
		inputString = sc.nextLine();

		char[] stringToChar = inputString.toCharArray();
		int strSize = stringToChar.length;

		int count = 1, totalSum = 0;

		char[] charArr = new char[strSize];

		for (int i = 0; i < strSize; i++) {
			charArr[i] = stringToChar[i];
		}

		for (char ch : charArr) {
			int chInt = ch;
			if (chInt >= 65 && chInt <= (65 + 26)) {
				for (int i = 'A'; i < 'Z'; i++, count++) {
					if (chInt == i) {
						totalSum += count;
						break;
					}
				}
			} else {
				for (int i = 'a', count1 = 1; i < 'z'; i++, count1++) {
					if (chInt == i) {
						totalSum += count1;
					}
				}

			}
		}
		System.out.println("Total sum is: " + totalSum);

	}
}