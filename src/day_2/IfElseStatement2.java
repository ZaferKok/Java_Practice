package day_2;

import java.util.Scanner;

public class IfElseStatement2 {

	public static void main(String[] args) {
		/*
         * ask user to enter 2 int numbers then ask user to enter which operator they
         * want to use if addition then print here is the sum of your operation 7 + 4=
         * 11 Test data: Addition Deduction Division Multiplication
         */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first integer number");
		int first = scan.nextInt();
		System.out.println("Enter second integer number");
		int second = scan.nextInt();
		System.out.println("Which operator do you want? "
				+ "Write addition, subtraction, division or multiplication");
		String operator = scan.next();
		
		if (operator.equalsIgnoreCase("addition")) {
			System.out.println("The sum of your numbers is : " + (first + second));
		}else if (operator.equalsIgnoreCase("subtraction")) {
			System.out.println("The sub of your numbers is : " + (first - second));
		}else if (operator.equalsIgnoreCase("division")) {
			System.out.println("The div of your numbers is : " + (first / second));
		}else if (operator.equalsIgnoreCase("multiplication")) {
			System.out.println("The mult of your numbers is : " + (first * second));
			
		}else {
		System.out.println("You might have typed wrong operation");
		
		}
		
	}

}
/*ANOTHER SOLUTION
/*
 * ask user to enter 2 int numbers then ask user to enter which operator they
 * want to use if addition then print here is the sum of your operation 7 + 4=
 * 11 Test data: Addition Subtraction Division Multiplication
 
Scanner scan = new Scanner(System.in);
System.out.println("Please enter your operation and 2 numbers:");
String operation = scan.next();
int  n1 = scan.nextInt();
int n2 = scan.nextInt();
if (operation.equalsIgnoreCase("Addition")) { // addition
    System.out.println("here is the sum of your " + operation + " " + (n1 + n2));
} else if (operation.equalsIgnoreCase("Subtraction")) {
    // Subtraction
    System.out.println("here is the sum of your " + operation + " " + (n1 - n2));
} else if (operation.equalsIgnoreCase("Division")) {
    System.out.println("here is the sum of your " + operation + " " + (n1 / n2));
}else if (operation.equalsIgnoreCase("Multiplication")) {
    
    System.out.println("here is the sum of your " + operation + " " + (n1 * n2));
}else {
    System.out.println("You might have typed a wrong operation");
}
*/