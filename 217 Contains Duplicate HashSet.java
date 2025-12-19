/*
    Problem 217: Contains Duplicate
    URL: https://leetcode.com/problems/contains-duplicate/description/

    Approach:
    Create a HashSet.
    Iterate through the array. If the set contains the element in the array, return true.
    Otherwise, add the element to the set.
    If we iterate through the array, and there are no matching sets, return false.

    Time Complexity: O(n)- We iterate through the array once
    Space Complexity: O(n)- In worst case, we store all the elements of the array into HashSet.
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a HashSet
        HashSet<Integer> set = new HashSet<>();
        // Iterate through array
        for(int i = 0; i < nums.length; i++){
            // If set contains num, return true
            if(set.contains(nums[i])){
                return true;
            }
            // Else add num to set
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}