/**
 * @author Weiquan Mai
 * Problem 3794 Reverse String Prefix
 * URL: https://leetcode.com/problems/reverse-string-prefix/
 *
 * Approach:
 * Utilize StringBuilder to create result string.
 * If k <= string length, then add to string builder by iterating backwards from k until beginning of string to obtain reversed string prefix.
 * Then iterate from k until end of string to obtain remaining string.
 *
 * Time Complexity: O(n) - Iterate through length of string.
 * Space Complexity: O(n) - Store data in StringBuilder
 */

class Solution {
    public String reversePrefix(String s, int k) {
        // Create stringbuilder
        StringBuilder sb = new StringBuilder();

        if(k <= s.length()){
            // Add to string builder from k to 0
            for(int i = k - 1; i >= 0; i--){
                sb.append(s.charAt(i));
            }
        }

        // Add remainder of string to stringbuilder
        for(int i = k; i < s.length(); i++){
            sb.append(s.charAt(i));
        }

        // Convert stringbuilder to string
        String result = sb.toString();

        return result;
    }
}
