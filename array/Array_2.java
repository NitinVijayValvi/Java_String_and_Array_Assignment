package com.yash.array;

/*WAP to remove duplicate numbers from list of numbers.
*/
public class Array_2 {

	public static int removeDuplicates(int a[], int n) {

		if (n == 0 || n == 1) {

			return n;
		}
		// array to store unique values
		int temp[] = new int[n];

		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}
		temp[j++] = a[n - 1];

		// Original Array
		for (int i = 0; i < j; i++) {
			a[i] = temp[i];

		}
		return j;

	}

	public static void main(String[] args) {

		int a[] = { 3, 3, 5, 6, 7, 7, 8, 8, 8};

		
		
		int n = a.length;

		n = removeDuplicates(a, n);
		// print array numbers
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");

		}

	}
}
