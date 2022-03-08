package com.aderya.hackerrank.problemsolving.breakingtherecords;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int[] breakingRecordss = new int[2];
        int minPoint = scores.get(0);
        int maxPoint = scores.get(0);

        for(Integer score:scores){
            if(score<minPoint){
                breakingRecordss[1]++;
                minPoint = score;
            }
            if(score>maxPoint){
                breakingRecordss[0]++;
                maxPoint = score;
            }
        }
        return Arrays.stream(breakingRecordss).boxed().collect(toList());


    }

}
//Attention: BufferedWriter was changed as "new OutputStreamWriter(System.out)" in order to test result of the case on console.
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

