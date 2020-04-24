package day_3;

import java.util.Scanner;

public class StringManupulations5 {

	public static void main(String[] args) {
		/* ask user to enter a word then make all characters uppercase*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Sentence");
		String word = scan.nextLine();
		
		String r = word.toUpperCase();
		System.out.println(r);
		
	}

}
