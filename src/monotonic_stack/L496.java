package monotonic_stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class L496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[m];
        int res1[] = new int[n];

        for (int i = m - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();

            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1[i] == nums2[j]) {
                    res1[i] = res[j];
                    break;
                }
            }
        }

        return res1;

    }
}
