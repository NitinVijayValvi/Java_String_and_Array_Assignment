package com.yash.array;

public class Array_10 {

	static void sort(int[] intarr, int n) {

		for (int i = 1; i < n; i++) {

			int temp = intarr[i];

			int j = i - 1;
			while (j >= 0 && temp < intarr[j]) {
				intarr[j + 1] = intarr[j];

				j--;
			}
			intarr[j + 1] = temp;
		}
	}

	static void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");

		}

	}

	public static void main(String[] args) {
		int[] array = { 22, 222, 1, 1111, 33334, 555545 };

		int n = array.length;
		sort(array, n);

		printArray(array, n);
	}

}
