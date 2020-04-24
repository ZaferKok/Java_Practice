package day_6;

public class School {
		
		String name;
		String lastName;
		String className;
		String studentID;
	
		/*
	    Now you have a school class
	    please create 2 methods called shcoolRunner  and they should be overloaded 
	    1_ pass 4 variables to first method and print them
	    2_pass 2 variables name and lastName to the last medthod and print them 
	    String name;
	    String lastName;
	    String className;
	    String studentID;
	    2_pass 3 variables
	    String name;
	    String lastName;
	     */
	public static void schoolRunner(String name, String lastName, String className, String studentID) {
		System.out.println("Student name is " + name);
		System.out.println("Student last name is " + lastName);
		System.out.println("Student class name is " + className);
		System.out.println("Student student ID is " + studentID);
		
	}
	public static void schoolRunner(String name, String lastName) {
		System.out.println("Student name is " + name);
		System.out.println("Student last name is " + lastName);
	
}
}
