/**
 * @author Weiquan Mai
 * Problem 1920: Build Array from Permutation
 * URL: https://leetcode.com/problems/build-array-from-permutation
 *
 * Approach:
 * Iterate through length of array nums and assign value to array ans
 * based on ans[i] = nums[nums[i]]
 * Return array ans
 * 
 * Time Complexity: O(n) - To iterate through array ans
 * Space Complexity: O(n) - Store result values into ans
 */

class Solution {
    public int[] buildArray(int[] nums) {
        // Variable
        int[] ans = new int[nums.length];

        // Iterate through length of nums and assign value to ans
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
