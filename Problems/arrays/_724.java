package arrays;

public class _724 {

    /*
    We have two arrays. Left one we sum from left to right. Right one we sum from right to left.
The idea is if pivot exsist, leftside + pivot = rightside + pivot.
     */

    class Solution {
        public int pivotIndex(int[] nums) {
            int sum = 0, left = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                if (left == sum - left - nums[i]) return i;
                left += nums[i];
            }
            return -1;

        }
    }
}
