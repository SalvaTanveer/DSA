/*You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

 */
/* Approach
 * 
 * If (i % 2 == 0 and arr[i] == arr[i+1]) or (i%2 == 1 and arr[i] == arr[i-1]), we are in the left half.
If (i % 2 == 0 and arr[i] == arr[i-1]) or (i%2 == 1 and arr[i] == arr[i+1]), we are in the right half.

 */

public class SingleElementInSortedArray {
    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 1, high = n - 2;
        if (n == 1)
            return nums[0];
        if (nums[0] != nums[1])
            return nums[0];
        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] != nums[mid - 1] & nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            if ((mid % 2 != 0 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
