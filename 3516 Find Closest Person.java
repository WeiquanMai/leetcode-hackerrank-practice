/**
 * @author Weiquan Mai
 * Problem 3516 Find Closest Person
 * URL: https://leetcode.com/problems/find-closest-person
 *
 * Approach:
 * Calculate values for Person 1 and Person 2 using Math.abs.
 * Return values as specified.
 * 
 * Time Complexity: O(1) - To calculate and compare values
 * Space Complexity: O(n) - Store xResult and yResult
 */
class Solution {
    public int findClosest(int x, int y, int z) {
        int xResult = Math.abs(z - x);
        int yResult = Math.abs(z - y);

        // Return 1 if Person 1 arrives first
        if(xResult < yResult){
            return 1;
        }
        // Return 2 if Person 2 arrives first
        else if(yResult < xResult){
            return 2;
        }
        // Return 0 if both arrive at the same time
        else{
            return 0;
        }
    }
}
