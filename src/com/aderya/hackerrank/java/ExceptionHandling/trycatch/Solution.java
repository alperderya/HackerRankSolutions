package com.aderya.hackerrank.java.ExceptionHandling.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        try{
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x/y);

        }catch(InputMismatchException ime){
            //if you use exception variable directly instead of canonicalName to print it then you will fail one of the test cases
            System.out.println(ime.getClass().getCanonicalName());
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }
    }

}
