/*
    Problem 2469: Convert the Temperature
    URL: https://leetcode.com/problems/convert-the-temperature/description/

    Approach:
    Create an answer array.
    Then perform calculations to convert from celsius to kelvin or celcius to fahrenheit.
    Store answers inside of answer array, and then return answer array.

    Time Complexity: O(1) Constant time to perform calculations and return small array
    Space Complexity: O(1) Constant space required to store variables and array of 2 doubles.
*/
class Solution {
    public double[] convertTemperature(double celsius) {
        double answer[] = {0.1, 0.2};
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius *1.80 + 32.00;
        answer[0] = kelvin;
        answer[1] = fahrenheit;
        return answer;
    }
}