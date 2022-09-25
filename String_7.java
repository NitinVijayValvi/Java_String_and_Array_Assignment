
package com.yash.string;

/*WAP to implement split function by you.
*/
public class String_7 {

	public static void main(String[] args) {

		String str = "Hello I am Nitin";

		char[] len = str.toCharArray();
		int newlength = 0;
		for (char c : len) {
			newlength++;
		}
		System.out.println("Length of string: " + newlength);
		char ch[] = str.toCharArray();

		for (int i = 0; i < newlength; i++) {

			System.out.print("[" + ch[i] + "]");
			// System.out.println("\n");
		}
		System.out.println("\n");

		String temp = " ";
		boolean flag = false;
		System.out.println("Split string ");
		for (int i = 0; i < newlength; i++) {
			if (ch[i] != ' ') {
				temp = temp + ch[i];
				flag = false;
			} else {
				flag = true;
			}
			if (flag || i == newlength - 1) {
				System.out.println(temp);
				temp = " ";
			}
		}

	}
}