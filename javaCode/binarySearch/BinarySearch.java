package javaCode.binarySearch;

import java.util.Arrays;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int index = 0;

        // if only one number remaining, return 0 as index if it is target
        if (nums.length == 1) {
            return (nums[0] == target) ? 0: -1;
        }

        // if target larger than halfway point value, add that value + 1 to index
        // call same function on subarray of right half
        int halfway = (int)Math.floor(nums.length / 2);
        if (target > nums[halfway]) {
            int[] subarr = Arrays.copyOfRange(nums, halfway, nums.length);
            index += halfway + 1;
            return (search(subarr, target) == -1) ? -1: index + search(subarr, target);

        }

        else if (target < nums[halfway]) {
            int[] subarr = Arrays.copyOfRange(nums, 0, halfway);
            return (search(subarr, target) == -1) ? -1: index + search(subarr, target);
        }

        else if (target == nums[halfway]) { 
            return halfway - 1;
        }

        else {
            return -1;
        }
    }
}
