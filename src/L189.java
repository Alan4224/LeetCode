public class L189 {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length - k; i++) {
            temp[i] = nums[i];
        }
        int i = 0;
        for (i = k; i >= 1; i--) {
            nums[k - i] = nums[nums.length - i];
        }
        for (i = 0; i < nums.length - k; i++) {
            nums[k + i] = temp[i];
        }
    }
}
