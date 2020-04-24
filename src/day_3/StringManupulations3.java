package day_3;

import java.util.Scanner;

public class StringManupulations3 {

	public static void main(String[] args) {
		/*
		u * Create a String variable sentence 
		u * then reverse the sentence 
		u * e.g: I love java ==> java love I 
		u * String reverse = ""; 
		u * 
		u * use substring method
		u * 
		u */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 words");
		String s = scan.nextLine();
		
		
		String first = s.substring(0, s.indexOf(" "));
		String second = s.substring((s.indexOf(" ")+1), s.indexOf(" "));
		System.out.println(second);
		System.out.println(first);
		
		
		
	}

}
