/**
 * @author Weiquan Mai
 * Problem 771 Jewels and Stones
 * URL: https://leetcode.com/problems/jewels-and-stones
 *
 * Approach:
 * Iterate through each char for length of stones String.
 * Compare each char in stones to each char in jewels String.
 * If the chars match, increment counter.
 * Return counter
 * 
 * Time Complexity: O(n^2) - To iterate through stones String and jewlels String
 * Space Complexity: O(1) - Store counter
 */
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // Variables
        int counter = 0;

        // Iterate through length of stones
        for(int i = 0; i < stones.length(); i++){
            // Check if each char in stones matches a value in jewels
            for(int j = 0; j < jewels.length(); j++){
                if(stones.charAt(i) == jewels.charAt(j)){
                    counter++;
                }
            }
        }

        return counter;
    }
}
