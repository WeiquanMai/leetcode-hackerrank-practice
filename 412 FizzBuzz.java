/*
    Problem 412: FizzBuzz
    URL: https://leetcode.com/problems/fizz-buzz/

    Approach:
    Iterate through from 1 until n and add result to string based on conditions:
    - if divisible by 3 and 5, output FizzBuzz
    - if divisible by 3, output Fizz
    - if divisible by 5, output Buzz
    - else, output i
    - return result string

    Time Complexity: O(n)- we iterate from 1 until n once
    Space Complexity: O(n)- we create a result list.
*/
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0){
                list.add("FizzBuzz");
            }
            else if ( i % 3 == 0){
                list.add("Fizz");
            }
            else if (i % 5 == 0){
                list.add("Buzz");
            }
            else{
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
}
