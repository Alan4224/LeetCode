package prefix_sum;

public class L525 {
    public int findMaxLength(int[] nums) {
        int max = 0;
        for(int i=1;i<nums.length;i++){
            nums[i]= nums[i-1]+nums[i];
        }
        return nums[nums.length-1]*2;
    }
}
