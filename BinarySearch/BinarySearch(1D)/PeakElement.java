/*Peak Element -> arr[i] > arr[i-1] and arr[i] > arr[i+1] */

public class PeakElement {
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        int start = 1, end = n - 2;
        if (n == 1)
            return 0;
        if (nums[0] > nums[1])
            return 0;
        if (nums[n - 1] > nums[n - 2])
            return n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] < nums[mid - 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
