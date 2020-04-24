package friday_practice1;

import java.util.Arrays;

public class Q01 {
	public static void main(String[] args) {
		// Write a Java program to sort a numeric array and a string array and prints them out.
		int intArr[] = {5, 9, 8, 6, 3, 7, 4, 2, 1};
		String strArr[] = {"D", "C", "A", "B"};
		// Start coding here
		
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
	}
}
