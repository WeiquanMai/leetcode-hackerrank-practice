/**
 * @author Weiquan Mai
 * Problem 14: Longest Common Prefix
 * URL: https://leetcode.com/problems/longest-common-prefix/
 *
 * Approach:
 * Utilize double for loop to iterate through chars in each string.
 * Compare chars in subsequent strings.
 * If chars match, increase counter. Else, break.
 * Store counter inside array list.
 * Find minimum value in array list, which represents longest common prefix.
 * Return substring from 0 to minimum value in array list.
 *
 * Time Complexity: O(n^2) - Double for loop
 * Space Complexity: O(n) - Store results for array list
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case check
        if(strs == null || strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }

        // Variables
        int counter = 0;
        ArrayList<Integer> result = new ArrayList<>();

        // Double for loop to iterate through every string and char
        for(int i = 0; i < strs.length - 1; i++){
            counter = 0;
            int maxIndex = Math.min(strs[i].length(), strs[i + 1].length());

            for(int j = 0; j < maxIndex; j++){
                // If the characters from this string matches the next string, add it to counter
                if(strs[i].charAt(j) == strs[i + 1].charAt(j)){
                    counter++;
                }
                else{
                    break;
                }
            }

            // Add counter to array list
            result.add(counter);
        }

        // Find lowest number from array list, which respresents longest common prefix
        int longestPrefix = Collections.min(result);
        String s = strs[0].substring(0, longestPrefix);

        return s;
    }
}
