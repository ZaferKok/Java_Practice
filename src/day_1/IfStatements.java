package day_1;

import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
		/*
        Ask user to type a name, the length of name should be 3.
        Then check if the name has same characters. 
        If the String has same characters 
        Print “String has duplicate characters”
        Else print “String has unique characters”
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Type a name, the length should be 3");
		String name = scan.next();
		
		char a1 = name.charAt(0);
		char a2 = name.charAt(1);
		char a3 = name.charAt(2);
		
		
		String press = (name.length()==3)?
				((a1==a2 || a1 ==a3 || a2==a3)?
						("String has duplicate characters"):
							("String has unique characters")):
								("The length of the name is not three");
		System.out.println(press);
		
		
		/*
		if (name.length() == 3) {
			if (a1 == a2 || a1 == a3) {
			System.out.println("String has duplicate characters");
			}else if (a2 == a1 || a2 == a3) {
			System.out.println("String has duplicate characters");	
			}else {
			System.out.println("String has unique characters");
			}
				
		}else {
			System.out.println("The length of the name is not three");
		}*/
	
	}

}
