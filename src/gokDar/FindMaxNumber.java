package gokDar;

import java.util.Arrays;

public class FindMaxNumber {
	// Array - Find Maximum
	// Write a method that can find the maximum number from
	// an int Array
	// //Ex: {10, 997, 6, 17};
	// maxNum = 997;
	public static void main(String[] args) {
		System.out.println("Max Number is; " + largest());
		System.out.println("maxValue is; " + maxValue());
		System.out.println("maxVal is; " + maxVal());
	}

	public static int largest() {
		int[] arr = { -10, -997, -6, -17 };
		int max = arr[0]; // Please initialize it to very first index of the array
		for (int i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		return max;
	}

	public static int maxValue() {
		int[] n = { 10, -997, 6, -17 };
		Arrays.sort(n);
		return n[n.length - 1];
	}

	public static int maxVal() {
		int[] n = { 104, 97, 86, 7 };
		int max = Integer.MIN_VALUE;
		for (int each : n)
			if (each > max)
				max = each;
		return max;
	}
}
