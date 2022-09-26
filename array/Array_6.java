package com.yash.array;

public class Array_6 {
	static void consAverage(int arr[], int n) {
		int sum = 0;
		for (int i = 0; i + 1 < n; i++) {

			sum = (arr[i] + arr[i + 1]) / 2;
			System.out.print(sum + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 78, 25, 90, 23, 90 };

		int len = 0;
		for (int i : arr) {
			len++;
		}
		System.out.println("Average of consecutive numbers: ");
		consAverage(arr, len);

	}

}
