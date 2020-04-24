package day_6;

import java.util.Arrays;

public class SortTheArrayNumbers {

	public static void main(String[] args) {
		//sort the numbers
		int [] nums = {9,8,7,6,5,4,3,2,1};
		
//		  int num1 = 14;
//        int num2 = 25;
//        System.out.println(" num1 = "+num1);
//        System.out.println(" num2 = "+num2);
//        
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;
//        
//        System.out.println(" num1 = "+num1);
//        System.out.println(" num2 = "+num2);
			
        for (int i = 0; i < nums.length; i++) {
                 
            for (int j = 0; j < nums.length-1; j++) {
               
                if (nums[j]>nums[j+1]) {
                	int temp = nums[j];
                	nums[j]=nums[j+1];
                	nums[j+1] = temp;
                }System.out.println(Arrays.toString(nums));
                  
        
            }
        }
	}

}
