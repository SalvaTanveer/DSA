package Arrays.easy;

public class CheckArrayIsRotatedAndSorted {
    public boolean check(int[] nums) {
        int count = 0, n = nums.length;
        if (n == 1)
            return true;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
            }
        }
        if (nums[n - 1] > nums[0])
            count++;
        return count <= 1;
    }
}
