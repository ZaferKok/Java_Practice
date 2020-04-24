package day_2;

import java.util.Scanner;

public class NestedIfStatements {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your birth year and current year");
		int by = scan.nextInt();
		int cy = scan.nextInt();
		System.out.println("Enter your birth month and current month");
		int bm = scan.nextInt();
		int cm = scan.nextInt();
		System.out.println("Enter your birth day and current day");
		int bd = scan.nextInt();
		int cd = scan.nextInt();
		
		if (by <= cy) {
			if (bm <= cm) {
				if ( bd< cd) {
					System.out.println("Birth date is older");
				}else {
					System.out.println("Birth date is the same as current date");
				}
			}
		}
		
		
	}

}
/**
         * ask user to enter birth and current years / months / days 
         * then find the older date using Nested if statements and
         *  respecting camelCase find all possible conditions int birthYear, 
         *  currentYear, birthMonth, currentMonth, birthDay,  currentDay;
         *
         * 
         
        // baby born date: 2/ 8 / 2020
        // current date: 2 / 9 / 2020
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type the birth date of the baby and current date:");
        int yearOfBirth = scan.nextInt();
        System.out.println("now type current year");
        int currentYear = scan.nextInt();
        System.out.println("now type birth month of the baby");
        int monthOfBirth  = scan.nextInt();
        System.out.println("now type current month");
        int currentMonth = scan.nextInt();
        System.out.println("now type birth day of the baby");
        int dayOfBirth = scan.nextInt();
        System.out.println("now type current day");
        int currentDay = scan.nextInt();
        
        
        if(yearOfBirth <= currentYear) {
            if(monthOfBirth <= currentMonth) {
                if(dayOfBirth < currentDay) {
                    System.out.println("Birth date is older");
                } else {
                    System.out.println(" birth date is the same as current date is");
                }
            }
        }
        
Collapse*/
