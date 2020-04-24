package friday_practice1;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		// Create a method to test if an array contains a specific value.
		
		int arr[] = {5, 9, 8, 3, 4, 2, 1};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter which integer you look for in the array");
		int a = scan.nextInt();
		
		System.out.println(containsArrayVersion(arr, a));

	
	}
	
	public static boolean containsArrayVersion(int arr[], int a) {
		// Start coding here
		
		Arrays.sort(arr);
		int aa = Arrays.binarySearch(arr, a);
		if (aa<0) {
			return false;
		}else {
			return true;
		}
		
	}	
}
