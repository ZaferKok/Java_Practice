package day_6;

import java.util.Scanner;

public class ArrayExamples {

	public static void main(String[] args) {
		/*
	    Ask user to enter 5 names then assign them to an array
	    eg:                
	    String names = "john Marry william Brian Richard";
	    Then print the names 1 by 1 on the console 
	    String [] arrayNames = names.split(" ");
	    */
		
	    Scanner scan = new Scanner (System.in);
	    
	    System.out.println("Please enter 5 names leaving space in between");
	    String names = scan.nextLine();
	    
//	    String [] arrayNames = new String [5];
//	    for (int i = 0; i< arrayNames.length; i++) {
//	    	arrayNames[i] = scan.next();
//	    }
	    
	    String [] arrayNames = names.split(" ");
	    
	    for (int i = 0; i < arrayNames.length; i++) {
	        System.out.println(arrayNames[i]);
	    }
	    
	}
	}
