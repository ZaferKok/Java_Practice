package friday_practice2;

import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {
		// Write a program to copy an array by iterating the array.
		int arr[] = {5, 9, 8, 3, 4, 2, 1};
		// Start coding here
		int[] newArr = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			newArr[i] = arr[i];
		}
		System.out.println("Duplicate array: " + Arrays.toString(newArr));
	}
}
