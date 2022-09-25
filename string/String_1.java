package com.yash.string;

import java.util.Scanner;

public class String_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the First String");
		String inputstring1 = sc.nextLine();

		System.out.println("enter the Second String");
		String inputstring2 = sc.nextLine();

		char input1[] = inputstring1.toCharArray();
//length by using tocharArray
		
		char[] len = inputstring1.toCharArray();
		int ind = 0;
		for (char c : len) {
			ind++;
		}

		for (int i = 0; i < ind; i++) {
			char c = inputstring1.charAt(i);
			if (c == 'a' || c == 'A' || c == 'E' || c == 'e' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {
				try {
					input1[i] = inputstring2.charAt(ind);
					ind++;
				} catch (StringIndexOutOfBoundsException e) {
					input1[i] = '_';
				}
			}

		}
		String s = new String(input1); 
		System.out.println("Result String =" + s);
		sc.close();
	}

}
