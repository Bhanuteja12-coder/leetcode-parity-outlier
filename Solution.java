public class Solution {
    public int findOutlier(int[] nums) {
        int firstParity = nums[0] % 2;
        int secondParity = nums[1] % 2;
        int majorityParity;

        if (firstParity == secondParity) {
            majorityParity = firstParity;
        } else {
            majorityParity = nums[2] % 2;
        }

        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if ((nums[mid] % 2) == majorityParity) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}