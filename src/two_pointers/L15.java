package two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            } else if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[l] + nums[r] + nums[i];
                if (sum < 0) {
                    l++;
                } else if (sum > 0) {
                    r--;
                } else {
                    result.add(List.of(nums[l], nums[i], nums[r]));
                    l++;
                    r--;
                    while (nums[l] == nums[l - 1] && l < r) {
                        l++;
                    }
                    while (nums[r] == nums[r + 1] && l < r) {
                        r--;
                    }
                }
            }
        }
        return result;
    }
}
