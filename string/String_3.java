package com.yash.string;

public class String_3 {
public static void main(String[] args) {
	

	String str= "nITiN";
	/*
	 * StringBuffer sBuffer= new StringBuffer(str);
	 * 
	 * for (int i = 0; i < str.length(); i++) {
	 * 
	 * if (Character.isLowerCase(str.charAt(i))) { sBuffer.setCharAt(i,
	 * Character.toUpperCase(str.charAt(i))); }else if
	 * (Character.isUpperCase(str.charAt(i))) { sBuffer.setCharAt(i,
	 * Character.toLowerCase(str.charAt(i))); } } System.out.println("\n" +sBuffer);
	 */

	
	char[] ch = str.toCharArray();
	
	char[] len= str.toCharArray();

	int newlength = 0; 
	for (char c : len) {
		newlength++;
	}
	System.out.println("Length of String : "+newlength);
	
	for (int i = 0; i < len.length; i++) {
		
	}
	
	
}
}