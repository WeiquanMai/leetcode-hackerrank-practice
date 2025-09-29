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