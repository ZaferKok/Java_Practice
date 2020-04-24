package day_3;

import java.util.Scanner;

public class StringManupulations6 {

	public static void main(String[] args) {
		/*
        ask user to enter  firstName and lastName  then make first initials uppercase and the rest should be 
        all lowercase
        
        ferhat  => Ferhat
        kirac  => Kirac
        */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your firstname");
		String fn = scan.nextLine();
		System.out.println("Enter your lastname");
		String ln = scan.nextLine();
		
		String a = fn.substring(0, 1).toUpperCase();
		String b = fn.substring(1).toLowerCase();
		String c = ln.substring(0, 1).toUpperCase();
		String d = ln.substring(1).toLowerCase();
		
		System.out.println(a+b+" "+c+d);
		
	}

}
