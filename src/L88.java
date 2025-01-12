import java.lang.reflect.Array;
import java.util.Arrays;

public class L88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // for (int i = 0; i < n; i++) {
        // nums1[m] = nums2[i];
        // m++;
        // }
        // Arrays.sort(nums1);

        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[i + j + 1] = nums1[i];
                i--;
            } else {
                nums1[i + j + 1] = nums2[j];
                j--;
            }
        }
        while (i >= 0) {
            nums1[i + j + 1] = nums1[i];
            i--;
        }
        while (j >= 0) {
            nums1[i + j + 1] = nums2[j];
            j--;
        }
    }
}
