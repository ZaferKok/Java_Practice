package hrnEkc;

public class Awesome {
	public static void main(String[] args) {
		
		// for each loop example 
        int Numbers[] = {11, 0, 1, 4, 8, 15, 16, 23, 42};
            
            for (int Nums : Numbers) {
                
                System.out.print(Nums+", ");
                
            }
                
        

//------------------------------------------------------------------------------

        //Find Frequency of Character 
		String str = "You guys are awesome.";
		char ch = 'e';

		int counter = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ch) {
				counter++;
			}
		}
		System.out.println(counter);

		
//---------------------------------------------------------------------------------
	    //Remove the duplicated values from the given String 
		String str1 = "HHHHHHHHHHHHHHiiiiiiiiiiiiiiiiii!!!!!!!!!!!!!!";

		String result = "";
		for (int i = 0; i < str1.length(); i++) {
			String a = "" + str1.charAt(i);
			if (!result.contains(a)) { // or you can write a as ""+charAt(i)
				result += a;
			}
		}
		System.out.println(result);

		// with method
		String str2 = "HHHHHHHHHHHHHHiiiiiiiiiiiiiiiiii!!!!!!!!!!!!!!";

		String result2 = "";
		for (int i = 0; i < str2.length(); i++) {
			if (!result2.contains(String.valueOf(str2.charAt(i)))) {
				result2 += String.valueOf(str2.charAt(i));
			}
		}
		System.out.println(result2);

//----------------------------------------------------------------------------
		//Find the unique characters from the given String
		String str4 = "Teeeeeecchhhh         PPPProEEEEd";
		// Trod

		String[] arr = str4.split("");
		String unique1 = "";
		for (int i = 0; i < arr.length; i++) {
			int num = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals(arr[i])) {
					num++;
				}
			}
			if (num == 1) {
				unique1 += arr[i];
			}
		}
		System.out.println(unique1);

//-----------------------------------------------------------------------------
		//Reverse the given String
		String str5 = "I LOVE JAVA";
		String rslt = "";
		for (int i = str5.length() - 1; i >= 0; i--) {
			rslt = rslt + str5.charAt(i);
		}
		System.out.println(rslt);

		
//-----------------------------------------------------------------------------		
		
		// Write a Java program to check whether a string is a Palindrome
        //****Interview Question****

		String palindrome = "MADAM";
		String reverse = "";
		for (int i = palindrome.length() - 1; i >= 0; i--) {
			reverse = reverse + palindrome.charAt(i);
		}
		if (palindrome.equals(reverse)) {
			System.out.println("This is a palindrome.");
		} else {
			System.out.println("it is not  palindrome.");
		}

		
	}
}