/*
    Problem 1672: Number of Steps to Reduce a Number to Zero
    URL:https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

    Approach:
    Initialize counter to 0.
    Keep running while the number is not 0. 
    If the number is even, divide by 2 and increment counter.
    If the number is odd, subtract 1 and increment the counter.

    Time Complexity: O(logn)- Run time depends on size of num
    Space Complexity: O(1)- uses fixed amount of space to track counter
*/
class Solution {
    public int numberOfSteps(int num) {
        int counter = 0;
        while (num != 0){
            if (num % 2 == 0){
                num = num / 2;
                counter ++;
            }
            else{
                num = num - 1;
                counter++;
            }
        }
        return counter;
    }