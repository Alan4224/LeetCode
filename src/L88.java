import java.lang.reflect.Array;
import java.util.Arrays;

public class L88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m] = nums2[i];
            m++;
        }
        Arrays.sort(nums1);
    }
}
