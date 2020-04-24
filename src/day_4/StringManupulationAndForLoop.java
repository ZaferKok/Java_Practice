package day_4;

import java.util.Scanner;

public class StringManupulationAndForLoop {

	public static void main(String[] args) {
		/*
		create a method called numberOfChars and pass 2 parameters 1- char 2- String
		char ch = 'p';
		String str = "population is number of people";
		int count = 0; 
		then find how many times the given char is repeated in the String
		and print it on the console
		use for loop, increment and if statements  
		*/

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter long string");
//		String str = scan.nextLine();
//		System.out.println("Enter a character to find how many in the string");
//		char c = scan.next().charAt(0);		
//				
//				
//		int counter = 0;
//		int l = str.length();
//		
//		for (int i = 0; i<l; i++) {
//			if (str.charAt(i)==c) {
//				counter++;
//			}
//		}System.out.println("There are " + counter + " " + c + " in this string");
		
		
		char ch = 'p';
		String str = "population is number of people";
		
		System.out.println(numberOfChars(ch, str ));
		
		int numberOfChars = numberOfChars( ch,str  );
	    
        System.out.println("Your '"+ch+ "' has repeated "+ numberOfChars+" times in " + "'" +str+"'");

		
		
	}
public static int numberOfChars(char ch, String str) {
	int counter = 0;
	
	for(int i=0; i<str.length(); i++) {
		if(str.charAt(i)==ch) {
			counter++;
		}
	}
	return counter;
}
}
