/**
 * @author Weiquan Mai
 * Problem 3289 The Two Sneaky Numbers of Digitville
 * URL: https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville
 *
 * Approach:
 * Iterate through length of array nums.
 * If map contains the value, then add value to result array.
 * Else add value to map.
 * Return result array
 * 
 * Time Complexity: O(n) - To iterate through array ans
 * Space Complexity: O(n) - Store values inside hashmap
 */
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        // Variables
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        int resultCounter = 0;

        // Iterate though length of nums
        for(int i = 0; i < nums.length; i++){
            // If map contains value, add it to result list
            if(map.containsKey(nums[i])){
                result[resultCounter] = nums[i];
                resultCounter++;
            }
            // Else map doesn't contain value, add to map
            else{
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
