package Arrays.easy;

public class RotateArrayByOnePlace {
    public static void rotate(int[] nums) {
        int temp = nums[0];
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[n - 1] = temp;
    }
}
