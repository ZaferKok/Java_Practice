package day_6;

public class DuplicateArray {

	public static void main(String[] args) {
		// 0 1 2 3 4 5 6
        int [] nums = {21,21,21,23,54,537,21,23,2};//the length of array 7
        // 0
        String all = "";
        int counter = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
        
            for (int j = 0; j < nums.length; j++) {
                // true
                if (i != j && nums[i]==(nums[j])) {
                    count++;
                    break;
                }
            }
            String temp = "" + nums[i];
            if (count > 0 && !all.contains(temp)) {
                all = all.concat(temp + "-");
                System.out.println(all.split("-")[counter]);
                counter++;
            }
        }

	}

}
