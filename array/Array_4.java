package com.yash.array;

public class Array_4 {

	public static void main(String[] args) {
		int ar[]= {3,2,2,7,4,8,5};

		for (int i = 0; i < ar.length; i++) 
		{
		    for (int j = i + 1; j < ar.length; j++) 
		    {
		        for (int k = j + 1; k < ar.length; k++) 
		        {
		          
		                int x = ar[i] * ar[i], 
		            		y = ar[j] * ar[j], 
		            		z = ar[k] * ar[k];
		    
		            if (x == y + z || y == x + z || z == x + y)
		            	
		               System.out.println(ar[i] + "*" + ar[i] + "+" + ar[j] + "*"+ ar[j] + "=" +ar[k] + "*" + ar[k]    );
		        }
		    }
		}

	}

}
