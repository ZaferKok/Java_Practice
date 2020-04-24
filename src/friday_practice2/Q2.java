package friday_practice2;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		// Create a method to test if an array contains a specific value.
		int arr[] = {5, 9, 8, 3, 4, 2, 1, 5, 5};
		
		System.out.println(containsArrayVersion(arr, 5));
		System.out.println(containsArrayVersion(arr, 6));
		System.out.println(containsArrayVersion(arr, 4));
	}
	
	public static boolean containsArrayVersion(int[] arr, int element) {
		// Start coding here
		
		// Method 1: loop through the elements and check if any element equals to "element"
		// variable. If so, return true, else false
//		for (int i=0; i<arr.length; i++) {
//			if(arr[i]==element) {
//				return true;
//			}
//		}
//		return false;
		
		// Method 2: use binarySearch(). If it returns grater than or equal to zero, the element
		// is in the array. If it returns a negative value, the element is not
		// in the array
		Arrays.sort(arr);
		if(Arrays.binarySearch(arr, element)>=0) {
			return true;
		}else {
			return false;
		}
	}
}
