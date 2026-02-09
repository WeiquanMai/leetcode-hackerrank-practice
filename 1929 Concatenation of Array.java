/**
 * @author Weiquan Mai
 * Problem 1929: Concatenation of Array
 * URL: https://leetcode.com/problems/concatenation-of-array
 *
 * Approach:
 * Iterate through lenght of num and set ans[i] and ans[i + nums.length] as nums[i]
 * Return ans
 * 
 * Time Complexity: O(n) - To iterate through array nums
 * Space Complexity: O(n) - Store ans array
 */

class Solution {
    public int[] getConcatenation(int[] nums) {
        // Create an array ans of length 2n
        int[] ans = new int[nums.length * 2];

        // Iterate through and fill ans
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
    }
}
