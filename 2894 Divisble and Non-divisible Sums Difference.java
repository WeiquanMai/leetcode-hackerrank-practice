/*
    Problem 2894: Divisible and Non-dividible Sums Difference
    URL: https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/

    Approach:
    Create an accumulator num1 for sum of all integers that are not divisble by m,
    and accumulator num2 for sum of all integers that are divisible by m.
    Iterate through from 1 to n inclusive, and determine if i is divisible by m.
    If i is not divisible by m, then num1 += i, else if i is divisible by m, then num2 += i.
    Then return difference between num1 and num2.

    Time Complexity: O(n) Iterate from 1 to n
    Space Complexity: O(1) space to store both accumulators
*/
class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i <= n; i++){
            if (i % m != 0){
                num1 += i;
            }
            else if(i % m == 0){
                num2 += i;
            }
        }

        return num1 - num2;
    }
}