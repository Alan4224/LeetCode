package two_pointers;

public class L11 {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            int n = Math.min(height[l], height[r]);
            max = Math.max(max, n * (r - l));
            while (l < r && height[l] <= n) {
                l++;
            }
            while (l < r && height[r] <= n) {
                r--;
            }
        }
        return max;
    }
}
