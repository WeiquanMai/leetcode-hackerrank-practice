/*
    Problem 1672: Richest Customer Wealth
    URL: https://leetcode.com/problems/richest-customer-wealth/

    Approach:
    Iterate through accounts array.
    For each account in account array, iterate through that account to find its amount of wealth.
    If that amount of wealth is currently higher than our highest, then that amount is the highest.

    Time Complexity: O(m x n)- We iterate through m number of customers and n number of accounts
    Space Complexity: O(1)- space allocated to storing max and accumulator.
    
*/
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        // Iterate through customer array
        for (int i = 0; i < accounts.length; i++)
        {
            // For each array in account array, create an accumulator and find wealth of current account
            int accumulator = 0;
            for (int j = 0; j < accounts[i].length; j++)
            {
                accumulator += accounts[i][j];
            }
            // If wealth of current account is higher than max, then current account is max
            if (max < accumulator){
            max = accumulator;
            }
        }
        return max;
    }
}
