public class Solution {
    public static void main(String[] args) throws Exception {
        // //L13
        // System.out.println(L13.romanToInt("MCMXCIV"));
        // //End L13

        // // L88
        // int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        // int m = 3;
        // int[] nums2 = { 2, 5, 6 };
        // int n = 3;
        // L88.merge(nums1, m, nums2, n);
        // for (int i : nums1) {
        // System.out.println(i);
        // }
        // // End L88

        // // L27
        // int[] nums = { 3, 2, 2, 3 };
        // int val = 3;
        // System.out.println(L27.removeElement(nums, val));
        // // End L27

        // // L26
        // int[] nums = { 1, 1, 2 };
        // System.out.println(L26.removeDuplicates(nums));
        // // End L26

        // // L80
        // int[] nums = { 1, 1, 1, 2, 2, 3 };
        // System.out.println(L80.removeDuplicates(nums));
        // // End L80

        // // L1071
        // String str1 = "ABCABC";
        // String str2 = "ABC";
        // System.out.println(L1071.gcdOfStrings(str1, str2));
        // // End L1071

        // L189
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        L189.rotate(nums, k);
        for (int i : nums) {
            System.out.println(i);
        }
        // End L189
    }
}
