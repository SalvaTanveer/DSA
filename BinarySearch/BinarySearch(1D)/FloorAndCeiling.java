public class FloorAndCeiling {

    // The floor of x is the largest element in the array which is smaller than or
    // equal to x( i.e. largest element in the array <= x).

    public static int floor(int[] nums, int x) {
        int start = 0, end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= x) {
                ans = nums[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    /*
     * The ceiling of x is the smallest element in the array greater than or equal
     * to x(
     * i.e. smallest element in the array >= x).
     */

    public static int ceil(int[] nums, int x) {
        int ans = -1;
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= x) {
                ans = nums[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
