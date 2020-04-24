package day_6;

public class SumOfArrays {

	public static void main(String[] args) {
		
        // Can we have the sum of all array elements
        int [] nums = {21,21,21,23,54,537,21,23,2};//the length of array 7
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        
        System.out.println(sum);
	}

}
