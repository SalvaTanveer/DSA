package Arrays.easy;

public class RemoveDuplicatesFromSortedArray {
    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    // this is also same as the above solution
    public int removeDuplicatesFromArray(int[] nums) {
        int n = nums.length;
        int i = 1, j = 1;
        while (i < n) {
            if (nums[i] == nums[i - 1]) {
                i++;
            } else if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                i++;
                j++;
            }
        }
        return j;
    }
}
