/**
 * @Author Weiquan Mai
 * Problem: Grading Students
 * URL: https://www.hackerrank.com/challenges/grading/problem
 * 
 * Approach: 
 * Iterate through the list and calculate the next multiple of 5 for the current grade.
 * If the input grade is less than 38, no rounding occurs, so simply return that grade.
 * If the input grade is greater than 38, and the difference between next multiple of 5 and current grade is less than 3,
 * then set current grade as next multiple of 5. 
 * If calculated difference is greater than 3, then keep the grade as is.
 * Return the adjusted list of grades
 * 
 * Time Complexity: O(n) - Iterate through length of list and adjust grades as specified.
 * Space Complexity: O(1) - Allocate space for roundedGrade variable
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
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    
        for(int i = 0; i < grades.size(); i++){
            int roundedGrade = ((int)Math.ceil((grades.get(i)/5.0))) * 5;
            
            if (grades.get(i) < 38){
                grades.set(i,grades.get(i));
            }
            else if (grades.get(i) >= 38){
                if (roundedGrade - grades.get(i) < 3){
                grades.set(i,roundedGrade);
                }
                else{
                    grades.set(i,grades.get(i));
                }
            }
        }
        
        return grades;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
