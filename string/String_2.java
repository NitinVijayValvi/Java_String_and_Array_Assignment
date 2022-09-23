package com.yash.string;

import java.util.Scanner;

public class String_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1st string");

		String s1 = sc.nextLine();

		
		
		System.out.println("2nd string");
		String s2 = sc.nextLine();

		sc.close();

		boolean result = stringContainsSubstring(s1, s2);

		System.out.println(s1 + "contains " + s2 + " = " + result);

	}

	
	
	
	private static boolean stringContainsSubstring(String stringSearch, String subString) {

		boolean result = false;

		return result;
	}
}
