/*
    Problem 1512: Number of Good Pairs
    URL: https://leetcode.com/problems/number-of-good-pairs/

    Approach:
    Iterate through array twice to find pairs that fit the good pair criteria.

    Time Complexity: O(n)^2 Required to iterate through list twice
    Space Complexity: O(1) Required to store numGoodPairs variable.
*/
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int numGoodPairs = 0;

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] == nums[j] && i < j){
                    numGoodPairs++;
                }
            }
        }

        return numGoodPairs;
    }
}