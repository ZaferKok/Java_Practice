package gokDar;

public class FirstTwoMaxValuesArray {
	
	    //Write a Java program to find out the
	    // first two max values from an array
	    // Ex; [23,42,1,24,31,4,78]
	        // output; 78,42
	    public static void main(String[] args) {
	        int[] listNums = {23,42,1,24,31,4,78};
	        FirstTwoMaxValuesArray maxValues = new FirstTwoMaxValuesArray();
	        maxValues.getTwoMaxValues(listNums);

	    }
	    public void getTwoMaxValues(int[] nums) {
	        int maxFirst = 0;
	        int maxSecond = 0;

	        for (int n : nums){
	            if (maxFirst<n){
	                maxSecond = maxFirst;
	                maxFirst = n;
	            }else if (maxSecond < n){
	                maxSecond = n;
	            }
	        }
	        System.out.println("First Biggest Number; " + maxFirst);
	        System.out.println("Second Biggest Number; " + maxSecond);
	        System.out.println("First Two Biggest Numbers; "+ maxFirst + ", "+ maxSecond);
	    }
	}


