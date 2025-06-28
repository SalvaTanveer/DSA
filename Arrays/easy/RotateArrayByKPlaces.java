package Arrays.easy;

public class RotateArrayByKPlaces {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int sp, int ep) {
        while (sp < ep) {
            nums[sp] = nums[sp] + nums[ep];
            nums[ep] = nums[sp] - nums[ep];
            nums[sp] = nums[sp] - nums[ep];
            sp++;
            ep--;
        }
    }
}
