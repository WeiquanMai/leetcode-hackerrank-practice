/*
    Problem 2006: Count Number of Pairs with Absolute Difference K
    URL: https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/

    Approach:
    Iterate through array using two loops to see if any pairs have absolute difference K.
    If absolute difference K is found, increase counter.

    Time Complexity: O(n)^2: Required to iterate through array twice.
    Space Complexity: O(1)- constant space to store counter.
*/
class Solution {
    public int countKDifference(int[] nums, int k) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (Math.abs(nums[i]- nums[j]) ==k){
                    counter++;
                }
            }
        }
        return counter;
    }
}
