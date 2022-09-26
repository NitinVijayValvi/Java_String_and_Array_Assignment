package com.yash.array;

/*WAP An Array Contain different numbers you have to find sum of digits of each number how many 
are even, odd, perfect and prime.*/
public class Array_5 {

	public static void main(String[] args) {

		int arr[] = { 12, 23, 14, 15, 54, 86 };

		int newlength = 0;

		for (int i : arr)
			newlength++;

		System.out.println("original array: ");
		for (int i = 0; i < newlength; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		int digit, sum;

		for (int i = 0; i < newlength; i++) {
			sum = 0;
			while (arr[i] != 0) {

				digit = arr[i] % 10;
				sum = sum + digit;
				arr[i] = arr[i] / 10;

			}

			arr[i] = sum;

		}
		System.out.println("sum of digits of each element of array: ");

		for (int i = 0; i < newlength; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < newlength; i++) {

			if (arr[i] % 2 == 0) {

				System.out.println("Even number: " + arr[i]);
			} else
				System.out.println("Odd number: " + arr[i]);

		}

		for (int i = 0; i < newlength; i++) {

			int sum1 = 0;
			for (int j = 1; j < arr[i]; j++) {

				if (arr[i] % j == 0) {

					sum1 = sum1 + j;

				}
			}
			if (sum1 == arr[i]) {

				System.out.println("Perfect number: " + arr[i]);

			}

		}

		for (int i = 0; i < newlength; i++) {

			int count = 0;
			for (int j = 1; j <= arr[i]; j++) {

				if (arr[i] % j == 0) {

					count++;

				}
			}
			if (count == 2) {

				System.out.println("Prime number: " + arr[i]);

			}

		}

	}

}
