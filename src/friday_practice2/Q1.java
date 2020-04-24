package friday_practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q1 {

	public static void main(String[] args) {
		String[] arr = {"Java", "Ruby", "Python"};
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("Ruby");
		arrList.add("Java");
		arrList.add("Python");
		
		String[] arr1 = new String[3];
		arr1[0] = "Java";
		arr1[1] = "Python";
		arr1[2] = "Ruby";
		
		
		// Print
		System.out.println(Arrays.toString(arr));
		System.out.println(arrList);
		System.out.println(Arrays.toString(arr1));
		
		
		// Access an element
		System.out.println(arr[0]);
		System.out.println(arrList.get(2));
		System.out.println(arr1[2]);
		
		// Add an element
		//arrays cannot be resized
		arrList.add(0, "Perl");
		System.out.println(arrList);
		
		
		// Modify an element
		arr[1] = "C#";
		arrList.set(1, "C#");
		arr1[0] = "ZZZ";
		System.out.println(Arrays.toString(arr));
		System.out.println(arrList);
		System.out.println(Arrays.toString(arr1));
		
		// Remove an element
		// no built-in method for arrays
		
		
		// Length
		System.out.println(arr.length);
		System.out.println(arrList.size());
		
		
		// Sorting
		Arrays.sort(arr);
		Collections.sort(arrList);
		System.out.println(Arrays.toString(arr));
		System.out.println(arrList);
		
		
		// Contains
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, "Java")); // returns index
		
		System.out.println(arrList.contains("Java")); // returns boolean
		
		// Equality
		ArrayList<String> arrList2 = new ArrayList<>();
		System.out.println(Arrays.equals(arr, arr1)); // returns boolean
		System.out.println(arrList.equals(arrList2)); // returns boolean
		
		arrList.remove(0);
		System.out.println(arrList);
		arrList.clear();
		System.out.println(arrList);
		
		
		String arr3[] = new String[3];
		arr3[0] = "uuu"; arr3[1] = "iii"; arr3[2] = "eee";
		System.out.println(Arrays.toString(arr3));
		System.out.println(arr3[2]);
		arr3[0] = "aaa";
		System.out.println(Arrays.toString(arr3));
		System.out.println(arr3.length);
		Arrays.sort(arr3);
		if (Arrays.binarySearch(arr3, "eee")>=0) System.out.println("Yes");
		if (Arrays.binarySearch(arr3, "eee")<0) System.out.println("No");
		System.out.println(Arrays.equals(arr1, arr3));
		
		
		
		ArrayList<String> alst = new ArrayList<>();
		alst.add("T"); alst.add("O"); alst.add("T"); alst.add("A"); alst.add("L");
		System.out.println(alst);
		alst.remove(4); alst.set(3, "E");
		System.out.println(alst);
		Collections.sort(alst);
		System.out.println(alst.contains("T"));
		alst.clear();
		System.out.println(alst);
		System.out.println(alst.equals(arrList));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
