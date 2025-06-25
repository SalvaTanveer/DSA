/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1]. */
public class FirstAndLastPosition {
    public static int[] firstAndLastPosition(int[] arr, int target) {
        int[] ans = new int[2];
        boolean left = true;
        ans[0] = findIndex(arr, target, left);
        ans[1] = findIndex(arr, target, !left);

        return ans;
    }

    public static int findIndex(int[] arr, int target, boolean left) {
        int ans = -1;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (left) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
