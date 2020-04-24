package day_3;

import java.util.Scanner;

public class StringManupulations4 {

	public static void main(String[] args) {
		//1.Ask user to enter a word. If the word has odd number of characters 
		//and has 3 or more characters, print the character in the middle of the word.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scan.nextLine();
		
		boolean isTrue = word.length()%2 !=0 && word.length()>=3; 
		
		char c;
		
		if(isTrue) {
			c = word.charAt(word.length()/2);
			System.out.println(c);
		}
		
	}

}
