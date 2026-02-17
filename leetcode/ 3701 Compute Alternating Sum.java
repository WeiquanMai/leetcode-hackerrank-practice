/**
 * @author Weiquan Mai
 * Problem 3701: Compute Alternating Sum
 * URL: https://leetcode.com/problems/compute-alternating-sum
 *
 * Approach:
 * Iterate through length of nums array.
 * Add value to accumulator if index is even. Subtract value from accumulator if index is odd.
 * Return accumulator
 * 
 * Time Complexity: O(n) - To iterate through length of nums array
 * Space Complexity: O(1) - Store value of accumulator
 */
class Solution {
    public int alternatingSum(int[] nums) {
        // Add elements at even incides, and subtract elements at odd indices

        // Variables
        int accumulator = 0;

        // Iterate through length of loop
        for(int i = 0; i < nums.length; i++){
            // Add elements at even indices
            if(i % 2 == 0){
                accumulator += nums[i];
            }
            // subtract elements at odd indices
            else{
                accumulator -= nums[i];
            }
        }

        return accumulator;
    }
}
