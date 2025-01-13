public class L26 {
    public static int removeDuplicates(int[] nums) {
        int temp = nums[0];
        int n = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > temp) {
                nums[n++] = nums[i];
                temp = nums[i];
            }
        }
        return n;
    }

}
