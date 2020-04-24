package friday_practice2;

public class Q5 {

	public static void main(String[] args) {
		// Write a program to find the duplicate values of an array of string values
		String arr[] = {"Ali", "Veli", "Osman", "Veli", "Osman"};
		// Start coding here
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].equals(arr[j])) {
					System.out.println("Duplicate element: " + arr[i]);
				}
			}
		}
	}
	
}
