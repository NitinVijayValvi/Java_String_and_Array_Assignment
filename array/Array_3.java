package com.yash.array;

import java.util.Scanner;

public class Array_3 {

	private int array[];
	private int count;
	private int sizeofarray;

	public Array_3() {
		array = new int[1];
		count = 0;
		sizeofarray = 1;
	}

	public void addElement(int a) {

		if (count == sizeofarray) {

			growSize();
		}

		array[count] = a;
		count++;
	}

	public void growSize() {

		int temp[] = null;
		if (count == sizeofarray) {

			temp = new int[sizeofarray * 2];
			{
				for (int i = 0; i < sizeofarray; i++) {

					temp[i] = array[i];
				}
			}
		}
		array = temp;
		sizeofarray = sizeofarray * 2;
	}

//creating a function that deletes an element at the specified index  
	public void addElementAt(int index, int a) {
//compare the size with the number of elements if not equal grows the array size  
		if (count == sizeofarray) {
//invoking growSize() method  
			growSize();
		}
		for (int i = count - 1; i >= index; i--) {
//shifting all the elements to the left from the specified index  
			array[i + 1] = array[i];
		}
//inserts an element at the specified index  
		array[index] = a;
		count++;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Array_3 a = new Array_3();
		
		System.out.println("Elements of the array:");
		System.out.println("Enter the elements: ");
		a.addElement(scanner.nextInt());
		a.addElement(scanner.nextInt());
		a.addElement(scanner.nextInt());
		a.addElement(scanner.nextInt());
		a.addElement(scanner.nextInt());
		a.addElement(scanner.nextInt());
		
		for (int i = 0; i < a.sizeofarray; i++) {
			System.out.print(a.array[i] + " ");
		}
		System.out.println();

		System.out.println("Size of the array: " + a.sizeofarray);
		System.out.println("No. of elements in the array: " + a.count);

		System.out.println("\nElements of the array after adding an element at index 5:");

		for (int i = 0; i < a.sizeofarray; i++) {
			System.out.print(a.array[i] + " ");
		}
		System.out.println();

		System.out.println("Size of the array: " + a.sizeofarray);
		System.out.println("No. of elements in the array: " + a.count);
	}
}