package gokDar;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		/*Requirement:
		1. create function must print the sorted array,
		2. each element on a separate line,
		3. sorted ascending first by frequency of occurrence,
		4. then by value within each frequency.
		For instance, given an array arr = [4, 5, 6, 5, 4, 3],
		there is one each of 6's and 3's, and there are two 4's, two 5's.
		The sorted list is [3, 6, 4, 4, 5, 5].
		Test 1:
		arr = [5,3,1,2,2.4]
		Test 2:
		arr = [10,8,5,5,5,5,1,1,1,4,4]*/
		
      // Prime Number

      int flag = 0;
      int isPrime = 8;

      if (isPrime==0 || isPrime == 1){
          System.out.println("this number is not a prime number");
      }else {
          for (int i = 2 ; i<isPrime/2 ; i++){
              if (isPrime%i==0){
                  System.out.println("this number is not a prime number");
                  flag=1;
                  break;

              }

          }
          if (flag ==0){
              System.out.println("this number is a prime number");

          }
      }
//      // Print Given Word Ones, even if it is repeated...
//
//      String[] names = new String[] {"Bahadir", "Selami", "Yesim", "Serhat",
//              "Bahadir", "Selami", "Yesim",
//              "Bahadir", "Selami", "Yesim"};
//
//      ArrayList<String> listOfNames = new ArrayList<>();
//      for (int k = 0;k<names.length ;k++){
//          if (!listOfNames.contains(names[k])){
//              listOfNames.add(names[k]);
//          }
//
//      }
//      System.out.println(listOfNames);
//      //Fibonacci - sum of previous two numbers
//
//      int fiboLimit = 9;
//      int num1 = 0;
//      int num2 = 1;
//
//
//      for (int j = 1 ; j<=fiboLimit ; j++){
//          System.out.print(num1 + " + ");
//
//          int fibonacci = num1+num2;
//          num1=num2;
//          num2 = fibonacci;
//      }
      //Finding the missing number; 1,2,4,5,6,7,8,9,10 --> missing number is 3
        //                          0,1,2

//      int[] missingNumber = {9,10,4,7,6,5,8,1,2};
//
//      Arrays.sort(missingNumber);
//
//      for (int i = 1 ; i<missingNumber.length ; i++) {
//          int findingMissing = missingNumber[i-1]+1;
//
//          if (missingNumber[i] != findingMissing){
//              System.out.println(findingMissing);
//          }
//      }
//      //Print even number from 100 to 0 but do not use decrement(i--)
//
//      for(int i = 0 ; i<101 ; i++){
//
//          if(100-(2*i)>-1) {
//              System.out.print(100 - (2 * i) + ", ");
//          }
//      }
		
		
	}

}
