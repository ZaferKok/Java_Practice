package gokDar;

import java.util.Arrays;

public class FindMinNumber {

	public static void main(String[] args) {
		System.out.println("Min Number is; " + smallest());
		System.out.println("minValue is; " + minValue());
		System.out.println("minVal is; " + minVal());
	}

	public static int smallest() {
		int[] arr = { -10, -7, -6, -17 };
		int min = arr[0]; // Please initialize it to very first index of the array
		for (int i = 1; i < arr.length; i++)
			if (arr[i] < min)
				min = arr[i];
		return min;
	}

	public static int minValue() {
		int[] n = { 10, -997, 6, -17 };
		Arrays.sort(n);
		return n[0];
	}

	public static int minVal() {
		int[] n = { 104, 97, 86, 7 };
		int min = Integer.MAX_VALUE;
		for (int each : n)
			if (each < min)
				min = each;
		return min;
	}
}