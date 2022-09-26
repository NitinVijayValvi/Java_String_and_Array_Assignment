package com.yash.string;
/*WAP in which name of person is passed to main function and you have arrange all names by 
their length.*/
import java.util.Scanner;

public class String_5 {

	public static void main(String[] args) {
		int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of Names to Enter: ");
        int totalNamesLength = sc.nextInt();
        String[] allNames = new String[totalNamesLength];
        System.out.println("Enter Names: ");
        
        for (int i = 0; i < totalNamesLength; i++) {
            allNames[i] = sc.next();
        }
       for (int i = 0; i < allNames.length; i++) {

           for (int j = i + 1; j < allNames.length; j++) {
                if (allNames[i].toCharArray().length > allNames[j].toCharArray().length) {
                    String temp = allNames[i];
                    allNames[i] = allNames[j];
                    allNames[j] = temp;
                }
           }
        }
        for(String str : allNames) {
            System.out.println("Sorted names by length: "+str);
        }

	}

}
