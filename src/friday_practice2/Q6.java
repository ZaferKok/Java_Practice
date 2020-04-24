package friday_practice2;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		// Write a program to find the common elements between two arrays (string values)
		String arr1[] = {"Ali", "Veli", "Osman", "Hilmi", "Omer"};
		String arr2[] = {"Veli", "Sakir", "Hasan", "Osman"};
		// Start coding here

		for (int i = 0; i<arr1.length; i++) {
			for (int j = 0; j<arr2.length; j++) {
				if (arr1[i].equals(arr2[j])) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
}
