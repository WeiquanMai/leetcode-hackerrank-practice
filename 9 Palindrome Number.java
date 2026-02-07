/**
 * @author Weiquan Mai
 * Problem 9: Palindrome Number
 * URL: https://leetcode.com/problems/palindrome-number/description/
 *
 * Approach:
 * Convert integer to a string.
 * Iterate from left and compare char at left to char at right until middle of string.
 * If char does not match, then return false.
 * If all chars match, return true.
 * 
 * Time Complexity: O(n) - We convert integer to a string and iterate through length of string.
 * Space Complexity: O(1) - Allocate space to store string.
 */


 class Solution {
 public boolean isPalindrome(int x) {
 // Convert integer to string
 String s = Integer.toString(x);

 // Iterate until middle of string
 for(int i = 0; i < (s.length() / 2); i++){
 // If the character from left does not match character from right, return false
 if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
 return false;
 }
 }

 // Else everything matches and return true
 return true;
 }
 }
