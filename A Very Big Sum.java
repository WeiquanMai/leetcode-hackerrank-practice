/**
  * @Author Weiquan Mai
  * Problem: A Very Big Sum
  * URL: https://www.hackerrank.com/challenges/a-very-big-sum/problem
  * Approach:
  * Iterate through the length of the array, and add value of each element to a long accumulator to store a very large number.
  * Return accumulator.
  * 
  * Time Complexity: O(n) - We iterate through length of list
  * Space Complexity: O(1) - Allocate space for accumulator
  */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
    // Write your code here
        long accumulator = 0;
        
        for(int i = 0; i < ar.size(); i++){
            accumulator += ar.get(i);
        }
        
        return accumulator;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        long result = Result.aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
