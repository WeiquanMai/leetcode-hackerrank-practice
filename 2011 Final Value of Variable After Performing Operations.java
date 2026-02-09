/**
 * @author Weiquan Mai
 * Problem 2011: Final Value of Variable After Performing Operations
 * URL: https://leetcode.com/problems/final-value-of-variable-after-performing-operations
 *
 * Approach:
 * Iterate through length of operations array.
 * Increment counter if operations[i] contains ++.
 * Decrement counter if operations[i] contains --.
 * Return counter.
 * 
 * Time Complexity: O(n) - To iterate through operations array
 * Space Complexity: O(1) - Store counter
 */

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        // Variables
        int counter = 0;

        // Iterate through operations array
        for(int i = 0; i < operations.length; i++){
            // Increment or decrement counter based on contents of operations[i]
            if(operations[i].contains("++")){
                counter++;
            }
            else if(operations[i].contains("--")){
                counter--;
            }
            else{
                continue;
            }
        }

        return counter;
    }
}
