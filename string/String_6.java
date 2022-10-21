package com.yash.string;

public class String_6 {

	public static void main(String[] args) {
		String st = "Welcome";
		char[] length = st.toCharArray();
		int newLength = 0;
		for (char c : length) {
			newLength++;
		}
		System.out.println("Length of string:" + newLength);
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print("[" + ch[i] + "]");
		}
		System.out.println("\n");
		String temp = "";
		boolean flag = false;
		System.out.println("split string");
		for (int i = 0; i < newLength; i++) {
			if (ch[i] != ' ') {
				temp = temp + ch[i];
				flag = false;
			} else {
				flag = true;
			}
			if (flag || i == newLength - 1) {
				System.out.println(temp);
				temp = "";
			}
		}

	}

}