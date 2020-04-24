package day_5_mr_settar;

public class Practice {

	public static void main(String[] args) {


//		for (int i=0; i<=5; i++) {
//			if (i!=4) {
//				System.out.println(i);
//			}
//		}
		
//		for (int i=0; i<=10; i+=2) {
//			System.out.println(i);
//		}
		
//		int sum =0;
//		for (int i=1; i<=10; i++) {
//			sum+=i; // sum = sum+i;
//			
//		}System.out.println("Total is : " + sum);
	
	// *
	// * *	
	// * * * 	
	// * * * * 	
	// * * * * *	

	
//	int i;
//	int j;
//	for (i=1; i<=5; i++) {
//		for (j=1; j<=i; j++) {
//			System.out.print("* ");
//		}System.out.println("");
//	}
	
//	String star="*";
//    for (int i=1;i<=5;i++) {
//        System.out.println(star);
//        star = star.concat(" ").concat(star.substring(0,1));

	
		// REVERSE YOUR NAME
//		String reverse = "";
//		String n = "Zafer";
//		for (int i = n.length()-1; 0<=i; i-- ) {
//			//System.out.print(n.charAt(i));
//			reverse += n.charAt(i); 
//		
//		//			String m = n.substring(i, i+1);
//		//			System.out.print(m);
//		
//		}	System.out.println(reverse);
	
		String reverse = "";
		String n = "Zafer";
		for (int i = n.length()-1; 0<=i; i-- ) {
			//System.out.print(n.charAt(i));
			reverse += n.subSequence(i, i+1); 
		
		
		}	System.out.println(reverse);
	
	
		
	}

}

//print the number 1 to 3
//for(int i = 1 ;i<=3 ;i++ ){
//
//  System.out.println(i);
//
//}
//print the numbers 0 to 5
//for(int nums = 0 ;nums<=5 ;nums++){
////
////  System.out.println(nums);
////
////}
//print the numbers 0 to 5
//for(int nums = 0 ;nums<6 ;nums++){
//
//  System.out.println(nums);
//
//}
//Use a for loop to print "Yes" 7 times.
//for(int counter = 1; counter<8 ;counter++){
//
//  System.out.println("Yes");
//
//}
//Use a for loop to print "Yes" 7 times.
//for(int counter = 1; counter<8 ;counter++){
//
//  System.out.println(counter +"-Yes");
//
//}
//Use a for loop to print "Your Name" 10 times.
//do not use   i++
// use    i--
//int count = 10;
//for (;count>0;count--) {
//
//  System.out.println("Goksel");
//
//}
//for (int k =1;k<11 ; k++){
//
//  System.out.println(k +"-Goksel");
//
//}
//
// print the numbers 10 to 1
//for (int j = 10 ;j>0 ;j--){
//
//  System.out.print(j + ",");
//
//}
//
// print the odd numbers 10 to 0
//output; 9,7,5,3,1
// 9
// 7
// 5
// 3
// 1
//for (int k = 9;k>0;k-=2){
//
//  System.out.println(k);
//
//}
//for (int k =10;k>0;k--){
//
//  if (k%2!=0){
//      System.out.println(k);
//  }
//}
//
//for (int i=5;i>=1;i--){
//
//  System.out.println(2*i-1);
//
//}
//print the numbers 100 to 0 without using decrementing,
// use only incrementing
//     do not use   i--
//          use    i++
//for (int k=1 ; k<101 ; k++) {
//
//  System.out.println(101-k);
//}
//int num =100;
//for (int j=0; j<=99;j++){
//  System.out.println(num-j+" ");
//}
//break
// print the numbers 0 to 5 and make sure it jumps out
// of the loop when i is equal to 4
//output;
// 0
// 1
// 2
// 3
//for (int i = 0; i<=5;i++){
//
//  if(i==4){
//      break;
//  }
//  System.out.println(i);
//}
// “break” until 3:50PM EST
//only print even values between 0 and 10
//output:
// 0 2 4 6 8 10
//for (int k =0 ; k<11 ; k+=2){
//  System.out.println(k);
//}
//Use a for loop to print "Yes, I can do Java!" 10 times
// but make sure it jumps out of the loop
// when its written 3 times
//output:
// Yes, I can do Java!
// Yes, I can do Java!
// Yes, I can do Java!
//for (int k = 0; k < 10; k++) {
// System.out.println("Yes, I can do Java!");
//  if(k==3){
////      System.out.println("Yes, I can do Java!");
//     break;
//
//  }
//
//  System.out.println("Yes, I can do Java!");
//}
//
//Program to find the sum of natural numbers from 1 to 10.
//find the sum of 1+2+3+...+10=?
//int sum = 0;
//for (int i = 1; i <= 10; ++i) {
//
//  sum = sum + i;
//  //sum+=i
//
//}
//
//System.out.println("Sum of 1 to 10 = " + sum);
//int sums = 0;
//  for (int k = 1; k <= 10; k++) {
//
//sums = sums + k;
////sum+=i
//
//}
//
//  System.out.println("Sum of 1 to 10 = " + sums);
//Output;
//*
//* *
//* * *
//* * * *
//* * * * *
//for (int i = 1 ;i<=5 ; i++){
//  for (int j = 1 ;j<=i ; j++){
//      System.out.print("* ");
//  }
//  System.out.println();
//}
//String star="*";
//for (int i=1;i<=5;i++) {
//  System.out.println(star);
//  star = star.concat(" ").concat(star.substring(0,1));
//}
//reverse your name
//input "Goksel"
//output;leskoG"
//String name = "Betul";
//////             01234
////// name of length() = 5
////String reverse ="";
////
////for (int r = name.length()-1;r>=0;r--){
////
////  //luteB
////  reverse +=name.charAt(r);
////
////}
////
////System.out.println(reverse);
//String name = "Mustafa";
//String reverse ="";
//for(int i = name.length()-1 ; i>=0;i--){
//  reverse +=name.substring(i,i+1);
//}
//System.out.println(reverse);
//}
//}
