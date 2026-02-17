/**
 * @author Weiquan Mai
 * Problem 3467: Transform Array by Parity
 * URL: https://leetcode.com/problems/transform-array-by-parity
 *
 * Approach:
 * Iterate through length of nums array and replace even number with 0, and odd number with 1.
 * Utilize bubble sort to swap elements until array is sorted.
 * Return array.
 * 
 * Time Complexity: O(n) - To iterate through the array to replace values, and then to sort array
 * Space Complexity: O(1) - No extra memory space used
 */

class Solution {
    public int[] transformArray(int[] nums) {
        // Variables
        int evenCounter = 0;
        int oddCounter = 0;
        boolean keepSwapping = true;
        int numSwaps = 0;

        // Iterate through length of array
        for(int i = 0; i < nums.length; i++){
            // Replace each even number with 0
            if(nums[i] % 2 == 0){
                nums[i] = 0;
            }
            // Replace each odd number with 1
            else{
                nums[i] = 1;
            }
        }
        // Sort the modified array in non-decreasing order
        while(keepSwapping){
            numSwaps = 0;
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] > nums[i + 1]){
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    numSwaps++;
                }
            }

            if(numSwaps == 0){
                keepSwapping = false;
            }
        }

        return nums;
    }
}
