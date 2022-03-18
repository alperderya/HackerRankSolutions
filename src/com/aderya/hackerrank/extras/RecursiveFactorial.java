package com.aderya.hackerrank.extras;

import java.util.Scanner;

public class RecursiveFactorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int factorial = scanner.nextInt();

        System.out.println(findFactorial(factorial));

    }

    public static int findFactorial(int factorial){
        if(factorial==1){
            return 1;
        }
        return factorial * findFactorial(factorial-1);
    }
}
