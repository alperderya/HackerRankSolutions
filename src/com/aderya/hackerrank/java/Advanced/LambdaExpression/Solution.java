package com.aderya.hackerrank.java.Advanced.LambdaExpression;

import java.io.*;
import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return input -> input%2!=0;
    }

    public PerformOperation isPrime() {
        return input -> {
            if(input<=1) return false;

            for(int i=2; i<input/2; i++){
                if(input%i==0){
                    return false;
                }

            }
            return true;
        };
    }

    public PerformOperation isPalindrome(){
        return input -> {
            int copy = input;
            int reversed = 0;
            while(input!=0){
                int last = input%10;
                reversed = 10*reversed + last;
                input = input/10;
            }
            return copy==reversed;
        };
    }


    // Write your code here
}
    public class Solution {

        public static void main(String[] args) throws IOException {
            MyMath ob = new MyMath();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());
            PerformOperation op;
            boolean ret = false;
            String ans = null;
            while (T--> 0) {
                String s = br.readLine().trim();
                StringTokenizer st = new StringTokenizer(s);
                int ch = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                if (ch == 1) {
                    op = ob.isOdd();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "ODD" : "EVEN";
                } else if (ch == 2) {
                    op = ob.isPrime();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PRIME" : "COMPOSITE";
                } else if (ch == 3) {
                    op = ob.isPalindrome();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

                }
                System.out.println(ans);
            }
        }
    }

