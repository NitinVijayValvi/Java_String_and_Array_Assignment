package com.yash.array;

/*WAP to find the LCM and HCF of array numbers
*/

public class Array_7 {
	  public static void main(String[] args) {
	    int array[] = {12,15,20};
	    
	    int lcm = array[0];
	    int hcf = array[0];
	 
	  
	    for(int i=1; i<array.length; i++){
	      hcf = findHCF(array[i], lcm);
	      lcm = (lcm*array[i])/hcf;
	    }
	    
	    
	    System.out.println("LCM: "+lcm);
	    
	    System.out.println("HCF: "+hcf);
	  }
	 
	  //recursive function to find GCD of two numbers
	  public static int findHCF(int a, int b){
	    
	    if(b == 0)
	      return a;
	    
	    return findHCF(b, a%b);
	  }

	}