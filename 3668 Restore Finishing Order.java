/**
 * @author Weiquan Mai
 * Problem 3668: Restore Finishing Order
 * URL: https://leetcode.com/problems/restore-finishing-order
 *
 * Approach:
 * Iterate through friends array for every order array index.
 * If order[i] matches friends[j] add it to result array.
 * Return result.
 * 
 * Time Complexity: O(n^2) - To iterate through friends array and order array
 * Space Complexity: O(n) - Store result array
 */

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        // Variable
        int[] result = new int[friends.length];
        int resultCounter = 0;

        // Iterate through order
        for(int i = 0; i < order.length; i++){
            // If order[i] is in friends, add it to result
            for(int j = 0; j < friends.length; j++){
                if(order[i] == friends[j]){
                    result[resultCounter] = order[i];
                    resultCounter++;
                }
            }
        }

        return result;
    }
}
