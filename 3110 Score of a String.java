/*
    Problem 3110: Score of a String
    URL: https://leetcode.com/problems/score-of-a-string/

    Approach:
    Convert each character of the string to it's integer value
    and then add the sum of the absolute difference between adjacent characters to accumulator

    Time Complexity: O(n) Iterates through length of string
    Space Complexity: O(1)- constant space to store accumualtor
*/

class Solution {
    public int scoreOfString(String s) {
        int accumulator = 0;
        for (int i = 0; i < s.length() - 1; i++){
            accumulator += (Math.abs((int)s.charAt(i) - (int)s.charAt(i+1)));
        }
        return accumulator;
    }
}