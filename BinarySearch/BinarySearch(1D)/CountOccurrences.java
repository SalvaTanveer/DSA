public class CountOccurrences {

    public static int[] findOccurrences(int[] arr, int x) {
        int first = findIndex(arr, x, true);
        if (first == -1)
            return new int[] { -1, -1 };
        int last = findIndex(arr, x, false);
        return new int[] { first, last };
    }

    public static int findIndex(int[] arr, int x, boolean left) {
        int ans = -1;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                ans = mid;
                if (left) { // look on the left
                    end = mid - 1;
                } else {
                    start = mid + 1; // look on the right
                }
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
