/*
    Problem 217: Contains Duplicate
    URL: https://leetcode.com/problems/contains-duplicate/description/

    Approach:
    Sort the array, and then iterate through the array using a for loop.
    Since the array is sorted, we can compare nums[i] to nums[i + 1] to see if there is a matching pair.
    If matching pair exists, return true.
    If we iterate through the entire array, and no matching pairs exist, return false.

    Time Complexity: O(nlogn) - We sort through the list, and iterate through list once.
    Space Complexity: O(1) - We utilize space already dedicated to the list.
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        // If array is equal to the next number, return true
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        // Else return false
        return false;
    }
}