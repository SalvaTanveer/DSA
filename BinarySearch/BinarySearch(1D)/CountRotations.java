/*Find how many times the array has been rotated */
/*1.Use the approach as finding the minimum element in rotated sorted array , this time also store the index of minimum element */
public class CountRotations {
    public static int countRotations(int[] nums) {
        int start = 0, end = nums.length - 1;
        int idx = -1, min = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[start] <= nums[end]) {
                if (nums[start] <= min) {
                    min = nums[start];
                    idx = start;
                    break;
                }
            }
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= min) {
                    min = nums[start];
                    idx = start;
                }
                start = mid + 1;
            } else {
                if (nums[mid] <= min) {
                    min = nums[mid];
                    idx = mid;
                }
                end = mid - 1;
            }
        }
        return idx;
    }
}
