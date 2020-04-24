package day_3;

import java.util.Scanner;

public class StringManupulations {

	public static void main(String[] args) {
		/*
        ask user to enter an e-mail address then if it contains "hotmail" then replace it with "gmail" 
        e.g: mesutyaman@hotmail.com  ==> mesutyaman@gmail.com
        */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your e-mail address");
		String email = scan.next();
				
		//String newEmail = email.replaceAll("hot", "g");
		//System.out.println(newEmail);
		
		int startPoint = email.indexOf("@");
		int endPoint = email.indexOf(".");
		System.out.println(email.substring(0, startPoint+1)+"gmail"+email.substring(endPoint));
		
		
	}

}
