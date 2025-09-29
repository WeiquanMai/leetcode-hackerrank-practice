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