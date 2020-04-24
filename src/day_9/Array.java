package day_9;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int [] myN = {23,45,15,75,28,48};
		int [] myN_removed = new int[myN.length-1];
		System.out.println("My original array stores : " + Arrays.toString(myN));
		
		
		int removeTheIndex = 2;
		int j = 0;
		
		for (int i=0; i<myN.length; i++) {	
			if (i==removeTheIndex) {
				continue;
			}else {
				myN_removed[j] = myN[i];
				j++;
			}
			
		}
		System.out.println("After remove the spesific element" + Arrays.toString(myN_removed));
		
	}

}
