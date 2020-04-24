package gokDar;

import java.util.Arrays;

public class FrequencyOf {
//	//String -- Frequency of Characters
//	//Write a return method that can find the frequency of characters
//	//Ex:  "AAABBCDD" ==> A3B2C1D2
//	public static void main(String[] args) {
	
//		String a="AAABBCDD";
//		
//		String container = "";
//		for (int i = 0; i<a.length(); i++) {
//			if(!container.contains("" + a.charAt(i))) {
//				container +=a.charAt(i);
//		
//			}			
//		}System.out.println(container);	
//	
//		
//		String expectedResult = "";
//		for (int j = 0; j<container.length(); j++) {
//			int counter = 0;
//			for (int i = 0; i<a.length(); i++) {
//				if(container.charAt(j) == a.charAt(i)) {
//					counter++;
//				}
//				expectedResult = "" + counter + container.charAt(j);			
//			}System.out.println(expectedResult);	 	
//		} 
//	}
//}	
	
	
	public static String FrequencyOfChars(String str) {
		String container = "";
	    for (int i = 0 ; i<str.length() ; i++) {
	        if (!container.contains("" + str.charAt(i))) {
	            container += "" + str.charAt(i);
	        }
	    }
	        String expectedResult = "";
	        for (int j = 0 ;j<container.length() ; j++) {
	            int count = 0;
	            for (int i = 0 ;i<str.length() ; i++) {
	                if (str.charAt(i) == container.charAt(j))
	                    count++;
	        }
	            expectedResult += container.charAt(j) + "" + count;
	    }
	    return expectedResult;
	}
	public static void main(String[] args) {
	    System.out.println(FrequencyOfChars("Java is fun to learn!"));
	}
}
