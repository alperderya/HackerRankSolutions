package com.aderya.hackerrank.java.DataStructures.subarray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());
        int[] a = new int[n];
        a = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        scan.close();
        int number = 0;

        for(int k=0; k<n; k++){
            int subArraySum=0;
            for(int i=k; i<n; i++){
                subArraySum +=a[i];
                if(subArraySum<0) number++;
            }
        }
        System.out.println(number);

    }
}
