package day_8;

import java.util.Arrays;
import java.util.Scanner;

public class Questions {

	public static void main(String[] args) {
        //Let's write; "If you want something said, ask a man.
        // If you want something done, ask a woman.
        // Happy International Women's Day."
        System.out.println("If you want something said, ask a man. " +
                "If you want something done, ask a woman. " +
                "Happy International Women's Day.");
        
        //Please multiply 3.04 and 2.183
        double n1=3.04;
        double n2=2.183;
        System.out.println(n1*n2);
        
        //print the numbers 14 to 3 (Reverse)
        //output: 14,13,12....,3
        for (int i = 14; i > 2; i--) {
            System.out.print(i + " ");
        }System.out.println("");
         // Ask users to enter their name and 
         // you will reverse the user name and print it
         // output Reverse user's name
         // input: my name is "Ferhat"
         // output: my name is "tahreF
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String n = scan.next();
		for (int i= n.length()-1; i>=0; i--) {
			System.out.print(n.charAt(i));
		}System.out.println("");
		//Use a for loop to print "Yes, I can do Java!" 7 times
		// but make sure it jumps out of the loop
		// when its written 5 times
		// output:  Yes, I can do Java!
		// Yes, I can do Java!
		// Yes, I can do Java!
		// Yes, I can do Java!
		// Yes, I can do Java!
		String s = "Yes, I can do Java!";
		
		for (int i= 0; i<7; i++) {
			if (i==5) {				//	i==5 || i==6
				break;				//  continue;
			}System.out.println("Yes, I can do Java!");
		}
		//Introduction to Arrays
		String myFriend = "Ozgur";
		String myFriends[] = {"Ozgur","Ibrahim","Selami","Sibel","Esra"};
		//You access an array element by referring to the index number.
		System.out.println(myFriends[0]);
		
		myFriends[1]="Zafer";
		System.out.println(myFriends[1]);
		
		System.out.println(myFriends.length);
		int numoMyFriends = myFriends.length;
		System.out.println(numoMyFriends);
		
		 //Print all names of myFriends
		for (int i=0; i<myFriends.length; i++) {
			System.out.print(myFriends[i] + " ");
		}System.out.println("");
		//Another solution
		System.out.print(Arrays.toString(myFriends)+" ");
		System.out.println("");
		//The other solution
		for (String x:myFriends) {
			System.out.print(x + " ");
		}System.out.println("");
		
		
		int myNumbers[] = {1,2,3,4,5,6,7,8};
		int myGroupNums[] []= {{1,3,5,7},{2,4,6,8}};
		System.out.println(myGroupNums[1][2]);
		
		
		//1.grubun son elemanını yazdır
		//tek satır cevap
		System.out.println(myGroupNums[0][myGroupNums[0].length-1]);
		//anlasılır cevap
		int a = myGroupNums[0].length-1;
		int b = myGroupNums[0][a];
		System.out.println(b);
		
		System.out.println(myGroupNums[1][0]);
		System.out.println("");
		
		
		//write the all numbers on the console with nested for loop
		int l= myGroupNums.length;
		for (int z=0; z<l;z++) {
			for (int y=0; y<myGroupNums[z].length; y++) {
				System.out.print(myGroupNums[z][y] + " ");
			}
		}System.out.println("");
		
		//Sorting numeric
		int[] myNums = { 89, 235, 199, 146, 201, 1458, 258, 125, 147, 265, 456, 216, 157, 245};
		System.out.println("Before sorting: " + Arrays.toString(myNums));
		Arrays.sort(myNums);
		System.out.println("After sorting: " + Arrays.toString(myNums));
		
		
		//Sorting string
		String[] myPrograms = {
		        "Java",
		        "Python",
		        "Selenium",
		        "C#",
		        "C Programming",
		        "C++",
		        "Cucumber",
		        "TestNG"};
		System.out.println("Before sorting : " + Arrays.toString(myPrograms));
		Arrays.sort(myPrograms);					
		System.out.println("After sorting : " + Arrays.toString(myPrograms));
		
		
		// lets count total of the myNums arrays
		int sum = 0;
		for (int u: myNums) {
			sum = sum+u;
		}System.out.println(sum);
		
		// check if the array has a spesific number. for example check it for number 6
		for (int t:myNums) {
			if (t==6) {
				System.out.println("true");
			}else {
			} 
		}System.out.println("false");	
		
		
		// asagıdaki sekil ile varsa index numarası elde edilir.	
		Arrays.sort(myNums);
        System.out.println(Arrays.binarySearch(myNums, 146));

}
}
