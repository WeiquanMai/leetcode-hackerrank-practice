/*
    Problem 1: Two Sum
    URL: https://leetcode.com/problems/two-sum/

    Approach:
    Create a hashmap.
    Iterate through the array and calculate its complement (target - num).
    If the complement exists in the map, we've found the pair.
    If complement does not exist in the map, add to map.

    Time Complexity: O(n)- We iterate through the list once
    Space Complexity: O(n)- Worst case, we store all the element in nums into the HashMap.
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(map.containsKey (target - num)){
                return new int[]{i, map.get(target - num)};
            }
            else{
                map.put(num,i);
            }
        }
        return new int[]{};
    }
}