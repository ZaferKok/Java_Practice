package day_3;

import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) {
		/* String name = "Emine";
        
        use charAt method and print all letters on the console
*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.next();
		
		for (int i = 0 ; name.length()>i; i++) {
			System.out.println(name.charAt(i));
		
		}
		
	}

}
