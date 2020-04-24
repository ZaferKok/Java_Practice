package day_3;

import java.util.Scanner;

public class StringManipulations2 {

	public static void main(String[] args) {
		/*
        ask user to enter 2 words if the first word has even numbers, then  insert the second word in the middle 
        e.g: 
        mehmet ==>   mehahmetmet
        ahmet 
        */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 words");
		String first = scan.next();
		String second = scan.next();
		
		if (first.length()%2==0) {
			String full = first.substring(0, (first.length()/2))+second+first.substring(first.length()/2);
		System.out.println(full);
		}else {
			System.out.println("Not divisible name");
		
		// boolean isTrue = name1.length() % 2 == 0;
		        
		// String halfOfFirstName = name1.substring(0,name1.length()/2);
		 //String secondHalfOfTheName = name1.substring(name1.length()/2);
		             
		     //   if(isTrue) {
		     //   System.out.println(halfOfFirstName.concat(name2).concat(secondHalfOfTheName));

		
		}
		
	}

}
