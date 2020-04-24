package friday_practice2;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		// Write a program to find the duplicate values of an array of integer values.
		int arr[] = {5, 9, 8, 3, 4, 2, 1, 1000, 0, 1, 5, 9, 1, 1};
		// Start coding here
		
//		int temp = 0;
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println("Duplicate element: " + arr[i]);
//				}
//			}
//		}
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				System.out.println("Duplicate element: " + arr[i]);
			}
		}
	}
}
