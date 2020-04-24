package gokDar;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLetters {

	//String -- Same letters
	//Write a return method that check if a string is build out of
	// the same letters as another string.
	//Ex:  "abc",  "cab" -> true
	//	     "abc",  "abb" -> false
	public static boolean same(String a, String b) { // First way to answer
	    a = new TreeSet<String>(Arrays.asList(a.split(""))).toString();
	    b = new TreeSet<String>(Arrays.asList(b.split(""))).toString();
	    return a.equals(b);
	}
	public static void main(String[] args) {
	    //System.out.println(same("abcte", "cabtr"));
	    System.out.println(fancyWay("abcte", "cabte"));
	}
	public static boolean fancyWay(String a, String b) { // second way to answer
	    char[] ch1 = a.toCharArray(); //abcte
	    char[] ch2 = b.toCharArray(); //cabte
	    Arrays.sort(ch1); //a,b,c,e,t
	    Arrays.sort(ch2); //a,b,c,e,t
	    String st1 = "";
	    String st2 = "";
	    for (char each : ch1)
	        st1 += each;
	    for (char each : ch2)
	        st2 += each;
	    return st1.equals(st2);
	}
}
