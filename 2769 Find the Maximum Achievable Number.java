/*
    Problem 2769: Find the Maximum Achievable Number
    URL: https://leetcode.com/problems/find-the-maximum-achievable-number/

    Approach:
    Maximum achievable number increases or decreases x by 1, and simultaneously increase or decrease num by 1.
    So simply multiply t * 2 and add num.
    
    Time Complexity: O(1)- instant calculation and return
    Space Complexity: O(1)- space required to perform calculation and return
*/

class Solution {
    public int theMaximumAchievableX(int num, int t) {
        return t * 2 + num;
    }
}