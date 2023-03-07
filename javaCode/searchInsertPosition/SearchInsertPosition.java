package javaCode.searchInsertPosition;

import java.util.Arrays;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int answer = 0;

        if (nums.length == 1) {
            return (target > nums[0]) ? 1: 0;
        }

        int middleIndex = (nums.length % 2 == 0) ? (int)Math.floor(nums.length / 2) - 1 :
                                                    (int)Math.floor(nums.length / 2);

        if (target > nums[middleIndex]) {
            int[] subArr = Arrays.copyOfRange(nums, middleIndex + 1, nums.length);

            answer += searchInsert(subArr, target) + middleIndex + 1;
        }

        else if (target < nums[middleIndex]) {
            int[] subArr = Arrays.copyOfRange(nums, 0, middleIndex + 1);

            answer += searchInsert(subArr, target);
        }

        else {
            answer = middleIndex;
        }
        
        return answer;
    }
}
