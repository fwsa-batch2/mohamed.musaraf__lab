import java.util.*;
public class sorting {

    public static void main(String[] args) {
        int[] nums = {1,5,3,60,2,4};

        for (int i = 0; i < nums.length; i++) {
            // System.out.print(Arrays.toString(nums));
            for (int j = i+1; j < nums.length; j++) {
                int tmpArray = 0;
                if (nums[i]>nums[j]) {
                    tmpArray = nums[i];
                    nums[i]=nums[j];
                    nums[j]=tmpArray;
                }
            }
System.out.print(nums[i] + ", ");
        }

    }
   
   
}
