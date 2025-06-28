package Arrays.easy;

/*XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  ←Property 2
1.Find xor of all elements(1 to n) and XOR of all array elements and then substract it
WE CAN ALSO USE SUM OF FIRST N NUMBERS APPROACH
*/

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < nums.length; i++) {
            xor1 ^= nums[i];
            xor2 ^= (i + 1);
        }
        return xor1 ^ xor2;
    }
}
