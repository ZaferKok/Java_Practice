package hrnEkc;

public class Good {
    /* String str="MADAMY";  
    
    StringBuffer sbf= new StringBuffer(str);
    sbf.reverse();
    String str2= sbf.toString();
     
    if(str.equals(str2))  {
     System.out.println("Your String is a palindrome");
   }else {
    System.out.println("Your String  is not a palindrome");
   }
   */
   
   /*Write a Java Program to Check Whether a Number is Prime or Not use Scanner
   A prime number is a number which is divisible by only two numbers: 1 and itself. 
   So, if any number is divisible by any other number, it is not a prime number.
   */
/*  
System.out.println("Please enter a prime number: ");  
Scanner sc = new Scanner(System.in);
int num =sc.nextInt();
boolean flag=false;
if(num==1|| num==0||num<0) {
   System.out.println(num+" is not a prime number.");
}else {
   for(int i=2;i<=num/2;i++) {
       if(num%i==0) {
           flag=true;
           break;
       }
   }
   
   if(!flag) {
       System.out.println(num+ " is a prime number");
   }else {
       System.out.println(num+ " is not a prime number");
   }
}
*/
   
//Write a Java Program to print  10 Fibonacci numbers.    
  //0 1 1 2 3 5 8 13 21 34 
/*
  int count =10;
  int num1=0; int num2=1;
  String print="";
  System.out.print("Fibonacci Series of "+count+ " numbers: ");
  for(int i=1; i<=count;i++) {
      print+=num1+" ";
      int sumOfPrevTwo = num1+num2;
      num1=num2;
      num2=sumOfPrevTwo;
  }
   
   System.out.print(print);
   */
   
//Create a method as name of "age" with two integer parameters and calculates your age    
   
/*  Practice5 my_age= new Practice5();
   my_age.age(2020,1983);
   my_age.age(2020,1988);
   
           
   }
public  void age(int this_year,int birth_year) {
   
   int age=this_year-birth_year;
   System.out.println(age);
   */
   
/*Create a method as name of "printString" with one String and one integer parameters
 and prints the String with given times of integer values
     */
/*  printString("Stay at Home", 3);
   
}

public static void printString(String s, int x) {
   
   String print= "";
   for(int i=0; i<x;i++) {
       print+=s+" / ";
   }
   System.out.println(print);
}
*/

   /*Create a method as name of "area" and has integer 
   return type with two integer parameters and prints the area of rectangle. 
   Use Scanner and get values from the user
   */
/*  
   // come back in 15 min. 6 EST
   Scanner sc =new Scanner(System.in);
   System.out.println("Please enter width value: ");
   int x =sc.nextInt();
   System.out.println("Please enter height value: ");
   int y= sc.nextInt();
   
   System.out.println("The area of the rectange is= "+area(x,y));
       
}

public static int area(int a,int b) {
   
   int result =a*b;
   return result;
   */
   
//Write a method that accepts an array and prints the sum of all elements in the array
/*
   int[] a = {1,2,3,4,5};// = > 15
   int[] b = {-3,11,22}; //= > 30
   int[] c = {2,0,5,0}; //= > 7
   int[] d = {-4,-2,1,4};// = > -1
   
   System.out.println(sumOfArray(a));
   System.out.println(sumOfArray(b));
   System.out.println(sumOfArray(c));
   System.out.println(sumOfArray(d));
}
public static int sumOfArray(int [] arr) {
      int sum= 0;
       for(int i=0; i<arr.length;i++) {
       sum=sum+arr[i];
       
       // for(int value: arr){
       //sum+=value;
   }
   return sum;
   */
   
   //Write a method that accepts an array and prints true if it contains "1" or "0"
       /*  int[] a = {0,2,5,0,8};// = > true
           int[] b = {4,1,5,4,9}; //= > true
           int[] c = {4,5,7,4,9}; //= > false
           
           System.out.println(find1or0(a));
           System.out.println(find1or0(b));
           System.out.println(find1or0(c));
   
}
*/
/*  
public static boolean find1or0(int[] arr) {
   
   if(Arrays.toString(arr).contains("1")|| Arrays.toString(arr).contains("0")){
       return true;
   }else {
       return false;
   }
   */
   
/*Write a method that accepts an array and prints a new array with 3 times more the length
where its first and last element is the same as the original array,
put middle number of original array into the middle of your new array*/
/*
       int[] a = {1,3,7}; //= > [1, 0, 0, 0, 3, 0, 0, 0, 7]
       
       System.out.println(Arrays.toString(array3Times(a)));
       
}

public static int [] array3Times(int[] arr) {
   
   int [] newarr= new int[arr.length*3];
   newarr[newarr.length-1]= arr[arr.length-1];
   newarr[0]=arr[0];
   newarr[4]= arr[1];
   return newarr;
   */
   
/*Write a method that accepts an array and prints true if the sum of all 3's in the
   array is exactly 9*/
           int[] a = {1,3,2,3,9,2,}; // false
           int[] b = {0,3,2,3,4,3,2,}; // true
           int[] c = {1,2,3,4}; // false



}


