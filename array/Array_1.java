package com.yash.array;

/*WAP to find third minimum number from list of numbers.
*/
public class Array_1 {

	public static int findThirdMinimumNumber(int []a ,int n) {
		
		
		int tempnumber ;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (a[i]<a[j]) {
					
					
					tempnumber= a[i];
					a[i]= a[j];
					a[j]= tempnumber;
				}
				
			}
			
		}
		return a[n-3];		
	}
	public static void main(String[] args) {
		
		int a[] = {9,2,5,7,8,10};
		
		System.out.println(findThirdMinimumNumber(a, 6));
		
		int b[] = {12,14,16,34,23,45,37};
		
		System.out.println(findThirdMinimumNumber(b, 7));
	}
	
}
