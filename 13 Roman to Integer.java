/*
    Problem 13: Roman to Integer
    URL: https://leetcode.com/problems/roman-to-integer/

    Approach:
    Iterate through string from right to left.
    Convert each Roman Character to its integer value, and compare it to the character to the right.
    If current character is smaller than previous value, then subtract the value.
    Otherwise, add the value.

    Time Complexity: O(n) Traverses through the length of string s
    Space Complexity: O(1)- constant space to store variables

*/

class Solution {
    public int romanToInt(String s) {
        int accumulator = 0;
        int number = 0;
        int previous = 0;
        
        for (int i = s.length() - 1; i >= 0; i--){
            switch(s.charAt(i)){
                case 'I' -> number = 1;
                case 'V' -> number = 5;
                case 'X' -> number = 10;
                case 'L' -> number = 50;
                case 'C' -> number = 100;
                case 'D' -> number = 500;
                case 'M' -> number = 1000;
            }
            if (number < previous){
                accumulator -= number;
            }
            else {
                accumulator += number;
            }
            previous = number;
        }
        return accumulator;
    }
}