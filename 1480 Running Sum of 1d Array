/*
    Problem 1480: Running Sum of 1d Array
    URL: https://leetcode.com/problems/running-sum-of-1d-array/description/

    Approach:
    Create a runningSum accumulator and result index.
    Iterate through nums array, and add each result from nums index to runningSum,
    and then store runningSum to result.

    Time Complexity: O(n)- we iterate through the list once
    Space Complexity: O(n)- we store nums array into result array
*/
class Solution {
    public int[] runningSum(int[] nums) {

        // Initialize runningSum accumulator and result array
        int runningSum = 0;
        int[] result = new int[nums.length];

        // Iterate through length of nums array and add each index result to runningSum
        for(int i = 0; i < nums.length; i++){
            runningSum += nums[i];
            // Then set add runningSum to result index
            result[i] = runningSum;
        }
        return result;
    }
}