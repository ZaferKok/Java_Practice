//package hrnEkc;
//
//public class newClass {
//	
//	/*Write a method that accepts an array and prints true 
//	 * if the amount of number 8's is greater
//	        than the number 3's*/
//	                int[] a = {18,8,3}; // false
//	                int[] b = {3,3,1,8}; // false
//	                int[] c = {8,3,8,8,1,1}; // true
//	                
//	                System.out.println(count83(a));
//	                System.out.println(count83(b));
//	                System.out.println(count83(c));
//	            
//	    }
//	    
//	    public static boolean count83(int[] arr) {
//	        int count8=0;
//	        int count3=0;
//	        
//	        for(int i=0; i<arr.length;i++) {
//	            if(arr[i]==8) {
//	                count8++;
//	            }else if(arr[i]==3) {
//	                count3++;
//	            }
//	        }
//	        
//	        if(count8>count3) {
//	            return true;
//	        }else {
//	            return false;
//	        }
//}
//	    /*Write a method that accepts an array 
//        and swap the first and last element in the
//        array. Print the modified array */  
//        int[] c = {2,3}; //=> [3, 2]
//        int[] d = {12,20,2,3,42};//=> [42, 20, 2, 3, 12]
//        int[] e = {12,2,21}; //=[21, 2, 12]
//        
//        System.out.println(Arrays.toString(swap(c)));
//        System.out.println(Arrays.toString(swap(d)));
//        System.out.println(Arrays.toString(swap(e)));
//    
//}
//    public static int[] swap(int[] arr) {
//        int dummy= arr[0];
//        arr[0]=arr[arr.length-1];
//        arr[arr.length-1]=dummy;
//        return arr;
//        
//        
//        
//        
//        
//        
//        /*Write a method that accepts an array and
//        prints the number of odd numbers in the
//        array.*/
//    int[]a= {3,4,9,3,4};//=>3
//    int[]b= {7,11,57,2,0};//=>3
//    int[]c= {20,2,4,7,5};//=>2
//    
//    System.out.println(OddNum(a));
//    System.out.println(OddNum(b));
//    System.out.println(OddNum(c));
//        
//    }
//    public static int OddNum (int[] arr) {
//        
//        int count =0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]%2!=0) {
//                count++;
//            }
//            
//        }
//        return count;
//        
//        
//        
//        /* Write a method and replace the given values*/
//        //replace (/)=>(.)
//        //replace(:)=>(-)
//        //replace( )=>(**)
//       String dateAndTime = "23/04/2020 18:41:00";//23.04.2020**18-41-00
//       System.out.println(timeStamp(dateAndTime));
// }
// 
// public static String timeStamp(String dateAndTime) {
//     
//     dateAndTime=dateAndTime.replace("/", ".").replace(":", "-").replace(" ", "**");
//     
//     return dateAndTime;
//     
//     
//     
//     
//     
//     
//     /* Write a method named "printPattern"and get the pattern
//     *
//     **
//     ***
//     ****
//     *****
//     */
//     printPattern(5);
//     
// }
// 
// public static void printPattern (int rows) {
//     
//     for(int i=0; i<rows;i++) {
//         for(int j=0; j<=i;j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     
//     
//     
//     
//     
//     
//   //Write a method and calculate grade of three exams with the given values*
//     /* 
//     A =>90-100
//     B=>80-89
//     C=>70-79
//     D=>60-69
//     F=>0-59*/
//     calculateGrade(65, 85, 95);
//     
// }
// public static void calculateGrade(int x,int y,int z) {
//     
//     int average=(x+y+z)/3;
//     
//     if(average>=90) {
//         System.out.println("Your average is= "+average+" your grade is= A");
//     }else if(average<90 && average>=80) {
//         System.out.println("Your average is= "+average+" your grade is= B");
//     }else if(average<80 && average>=70) {
//         System.out.println("Your average is= "+average+" your grade is= C");    
//     }else if(average<70 && average>=60) {
//         System.out.println("Your average is= "+average+" your grade is= D");    
//     }else if(average<60) {
//         System.out.println("Your average is= "+average+" your grade is= F");
//     }
//
//
