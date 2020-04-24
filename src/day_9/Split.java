package day_9;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		/*Ask user to enter long sentences. 
		 * Then type a program to count all 
		 * “words” in the sentences. For example;
		 *  if user enters “Java is easy, if you study.
		 *   Nothing is easy, if you do not study” output 
		 *   will be 14. Hint: Use split()*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the long sentence");
		String word1 = scan.nextLine();
		
		String[] word1toArray = word1.split("\\s+");  // or you can use  "\\s+"
		System.out.println("Your Sentence have; " + word1toArray.length + " words");
		
		
	}

}
