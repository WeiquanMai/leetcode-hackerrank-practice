/**
 * @author Weiquan Mai
 * Problem 3512: Minimum Operations to Make Array Sum Divisible by K
 * URL: https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k
 *
 * Approach:
 * Iterate through array and calculate total.
 * Return total % k, which represents minimum number of operations required to make the sum of the array divisible by k.
 * 
 * Time Complexity: O(n) - We iterate through array and calculate accumulator.
 * Space Complexity: O(1) - Allocate space to store accumulator
 */

class Solution {
    public int minOperations(int[] nums, int k) {
        // Variable
        int accumulator = 0;

        // Calculate sum of array
        for(int i = 0; i < nums.length; i++){
            accumulator += nums[i];
        }

        return (accumulator % k);
    }
}
