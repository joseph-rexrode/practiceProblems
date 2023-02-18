import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // first, sort nums array to make iterating more simple
        Arrays.sort(nums);

        // declare answer variable
        List<List<Integer>> ans = new LinkedList<>();

        // iterate through nums up to nums.length - 2
        for (int i = 0; i < nums.length - 1; i++) {
            // this conditional prevents repeat arrays from being added
            if (i == 0 || (i > 0 && (nums[i] != nums[i - 1]))) {
                int low = i + 1;
                int high = nums.length - 1;
                int sum = 0 - nums[i];

                while (low < high) {
                    // meets condition to add to array
                    if (nums[high] + nums[low] == sum) {
                        ans.add(Arrays.asList(nums[i], nums[low], nums[high]));

                        // conditionals to check for repeats 
                        while (low < high && (nums[low] == nums[low + 1])) {
                            low++;
                        }
                        while (low < high && (nums[high] == nums[high - 1])) {
                            high--;
                        }
                        low++;
                        high--;
                    }
                    // if sum not large enough, move low up one to see if higher number works
                    else if (nums[low] + nums[high] < sum) {
                        low++;
                    }

                    // sum too large, move high down one to see if lower number works
                    else {
                        high--;
                    }
                }
            }
        }

        return ans;
    }

}
