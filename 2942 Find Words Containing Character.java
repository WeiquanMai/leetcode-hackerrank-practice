/**
 * @author Weiquan Mai
 * Problem 2942: Find Words Containing Character
 * URL: https://leetcode.com/problems/build-array-from-permutation
 *
 * Approach:
 * Iterate through length of words array and iterate through every character in each word
 * If the character matches specified character x, then add word index to arrayList and break.
 * Return arrayList.
 * 
 * Time Complexity: O(n^2) - To iterate every letter of every word in array
 * Space Complexity: O(n) - Store index values inside arrayList
 */
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        // Variable
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Iterate through length of words
        for(int i = 0; i < words.length; i++){
            // If words[i] contains x, then add it to array list
            for(int j = 0; j < words[i].length(); j++){
                if(words[i].charAt(j) == x){
                    arrayList.add(i);
                    break;
                }
            }
        }

        return arrayList;
    }
}
