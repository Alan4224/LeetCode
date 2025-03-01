package top_k_elements_or_min_max_heap;

import java.util.Arrays;

public class L215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
