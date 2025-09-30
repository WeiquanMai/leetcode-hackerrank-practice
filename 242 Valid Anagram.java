/*
    Problem 242: Valid Anagram
    URL: https://leetcode.com/problems/valid-anagram/

    Approach:
    Convert the string into a character array. Sort the character array.
    Convert sorted array back to a string.
    If the sorted strings match each other, then they are a valid anagram; thus return true.
    Else, they are not anagrams, and return false. 

    Time Complexity: O(nlogn) - we sort the array, and then compare the sorted array.
    Space Complexity: O (n) - we need to create new character arrays to hold characters of the original strings.
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        // Convert string to array
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        
        // Sort the arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Convert array back to string
        String a = new String(charArray1);
        String b = new String(charArray2);

        if(a.equalsIgnoreCase(b)){
            return true;
        }
        else{
            return false;
        }


        
    }
}