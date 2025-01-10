public class Solution {
    public static void main(String[] args) throws Exception {
        // //L13
        // System.out.println(L13.romanToInt("MCMXCIV"));
        // //End L13

        // L88
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        L88.merge(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.println(i);
        }
        // End L88
    }
}
