package friday_practice1;

public class Q2 {
	public static void main(String[] args) {
		// Write a Java program that calculates the average value of array elements and prints it.
		int intArr[] = {5, 9, 8, 3, 4, 2, 1};
		// Start coding here
		
		int sum = 0;
		for (int i=0; i<intArr.length;i++) {
			
			sum = sum + intArr[i];
		}
		int result = sum/intArr.length;
		System.out.println(result);
	}
}
