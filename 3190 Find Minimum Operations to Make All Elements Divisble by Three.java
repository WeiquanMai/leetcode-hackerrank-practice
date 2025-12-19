/*
    Problem 3190: Find Minimum Operations to Make All Elements Divisible by Three
    URL: https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/

    Approach:
    Iterate through array. If nums[i] % 3 != 0,
    then we either have to add 1 or subtract 1 from that number to make it divisible by three.
    Keep a counter of operations, and then return counter.

    Time Complexity: O(n) Iterate through the array
    Space Complexity: O(1) Constant space to store accumulator
*/
class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;

        for (int i = 0; i < nums.length; i++){

            // if nums[i] % 3 != 0, then you either add 1 or subtract 1 to make it divisible by 3. 
            // Either way, operations++
            if ( nums[i] % 3 !=0){
                operations++;
            }
        }

        return operations;
    }
}